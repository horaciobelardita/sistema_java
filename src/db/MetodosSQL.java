package db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Producto;

public class MetodosSQL {


    public static int guardarUsuario(String nick, String nombre, String email, String pass, String tipo) {
        int filasAfectadas = 0;
        Connection conexion = null;
        PreparedStatement pstm = null;
        String sql = "INSERT INTO usuarios "
                + "(nick ,nombre, email, password, tipo_usuario) "
                + "VALUES (?,?,?,?,?)";

        try {
            conexion = BaseDatos.obtenerConexion();
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, nick);
            pstm.setString(2, nombre);
            pstm.setString(3, email);
            pstm.setString(4, pass);
            pstm.setString(5, tipo);

            filasAfectadas = pstm.executeUpdate();
           
        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarStatement(pstm);
        }

        return filasAfectadas;

    }

    public static ArrayList<Producto> obtenerProductos() {
        Connection conexion = null;
        ArrayList<Producto> productos = new ArrayList<>();
       Statement stmt = null;
        ResultSet rs = null;
        try {
            conexion = BaseDatos.obtenerConexion();
            stmt = conexion.createStatement();
            String sql = "SELECT * FROM productos";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setCodigo(rs.getString("codigo"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecioCompra(rs.getDouble("precio_compra"));
                p.setPrecioVenta(rs.getDouble("precio_venta"));
                p.setStock(rs.getInt("stock"));
                productos.add(p);
            }

        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(stmt);
        }
        return productos;

    }
    /*
    public int guardar_inv(String nombre, String pre_com, String pre_ven, String cant_inv, String id_prove, String url_inv, String descr_inv) {

        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO inventario (nombre ,pre_com, pre_ven, cantidad, id_prove, descripcion, imagen) VALUES (?,?,?,?,?,?,?)");

        try {
            conexion = BaseDatos.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, pre_com);
            sentencia_preparada.setString(3, pre_ven);
            sentencia_preparada.setString(4, cant_inv);
            sentencia_preparada.setString(5, cant_inv);
            sentencia_preparada.setString(6, url_inv);
            sentencia_preparada.setString(7, descr_inv);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }

        return resultado;

    }
*/
    public static String buscarNombreUsuario(String nick) {
        Connection conexion = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String username = "";
        try {
            conexion = BaseDatos.obtenerConexion();
            String sql = "SELECT nombre FROM usuarios WHERE nick=? ";
            
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, nick);
            rs = pstm.executeQuery();
            while (rs.next()) {
                username = rs.getString("nombre");
            }
        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(pstm);
        }
        return username;
    }

    public static boolean buscarUsuario(String nick, String password) {
        boolean existeUsuario = false;
        Connection conexion = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conexion = BaseDatos.obtenerConexion();
            String sql = "SELECT nick, password "
                    + "FROM usuarios WHERE nick=? && password=?";
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, nick);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            if (rs.next()) {
                existeUsuario = true;
            } 
        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(pstm);
        }
        return existeUsuario;
    }

}
