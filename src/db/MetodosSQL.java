package db;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Producto;
import modelos.Proveedor;
import modelos.Usuario;

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
                p.setDescripcion(rs.getString("descripcion"));
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

    public static ArrayList<Proveedor> obtenerProveedores() {
        Connection conexion = null;
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conexion = BaseDatos.obtenerConexion();
            stmt = conexion.createStatement();
            String sql = "SELECT * FROM proveedores ORDER BY nombre_empresa";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Proveedor prov = new Proveedor();
                prov.setCuit(rs.getString("cuit"));
                prov.setNombreEmpresa(rs.getString("nombre_empresa"));
                prov.setNombreContacto(rs.getString("nombre_contacto"));
                prov.setDireccion(rs.getString("direccion"));
                prov.setDireccion(rs.getString("telefono"));
                proveedores.add(prov);
            }

        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(stmt);
        }
        return proveedores;

    }

    public static int guardarProducto(Producto p, boolean cambiarFoto) {
        int filasAfectadas = 0;
        Connection conexion = null;
        PreparedStatement pstm = null;

        try {

            conexion = BaseDatos.obtenerConexion();
            if (cambiarFoto) {
                String sql = "INSERT INTO productos "
                        + "(codigo ,nombre, descripcion, "
                        + "precio_venta, precio_compra, stock, imagen, id_proveedor) "
                        + "VALUES (?,?,?,?,?,?,?,?)";
                File fileFoto = p.getFoto();
                FileInputStream fis = new FileInputStream(fileFoto);
                pstm = conexion.prepareStatement(sql);
                pstm.setString(1, p.getCodigo());
                pstm.setString(2, p.getNombre());
                pstm.setString(3, p.getDescripcion());
                pstm.setDouble(4, p.getPrecioVenta());
                pstm.setDouble(5, p.getPrecioCompra());
                pstm.setInt(6, p.getStock());
                long size = p.getFoto().length();
                pstm.setBinaryStream(7, fis, size);
                pstm.setString(8, p.getIdProveedor());
            } else {
                String sql = "INSERT INTO productos "
                        + "(codigo ,nombre, descripcion, "
                        + "precio_venta, precio_compra, stock, id_proveedor) "
                        + "VALUES (?,?,?,?,?,?,?)";
                pstm = conexion.prepareStatement(sql);
                pstm.setString(1, p.getCodigo());
                pstm.setString(2, p.getNombre());
                pstm.setString(3, p.getDescripcion());
                pstm.setDouble(4, p.getPrecioVenta());
                pstm.setDouble(5, p.getPrecioCompra());
                pstm.setInt(6, p.getStock());
                pstm.setString(7, p.getIdProveedor());
            }
            filasAfectadas = pstm.executeUpdate();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDatos.cerrarStatement(pstm);
        }

        return filasAfectadas;
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
    //    public static String buscarNombreUsuario(String nick) {
    //        Connection conexion = null;
    //        PreparedStatement pstm = null;
    //        ResultSet rs = null;
    //        String username = "";
    //        try {
    //            conexion = BaseDatos.obtenerConexion();
    //            String sql = "SELECT nombre FROM usuarios WHERE nick=? ";
    //            
    //            pstm = conexion.prepareStatement(sql);
    //            pstm.setString(1, nick);
    //            rs = pstm.executeQuery();
    //            while (rs.next()) {
    //                username = rs.getString("nombre");
    //            }
    //        } catch (SQLException e) {
    //        } finally {
    //            BaseDatos.cerrarResultSet(rs);
    //            BaseDatos.cerrarStatement(pstm);
    //        }
    //        return username;
    //    }
    public static Usuario buscarUsuario(String nick, String password) {
        Connection conexion = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conexion = BaseDatos.obtenerConexion();
            String sql = "SELECT * "
                    + "FROM usuarios WHERE nick=? AND password=?";
            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, nick);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            usuario = new Usuario();
            while (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setNick(rs.getString("nick"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPassword(rs.getString("password"));
                usuario.setTipoUsuario(rs.getString("tipo_usuario"));
            }
        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(pstm);
        }
        return usuario;
    }

    public static ArrayList<Producto> obtenerProductosPorCriterio(String filtro) {
        Connection conexion = null;
        ArrayList<Producto> productos = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conexion = BaseDatos.obtenerConexion();
            String sql = "SELECT * FROM productos WHERE codigo LIKE '%"
                    + filtro + "%' "
                    + "OR nombre LIKE '%" + filtro + "%'";
            stmt = conexion.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Producto p = new Producto();
                p.setCodigo(rs.getString("codigo"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
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

    public static int borrarProducto(Producto p) {
        Connection conexion = null;
        PreparedStatement stmt = null;
        int filasAfectadas = 0;
        try {
            conexion = BaseDatos.obtenerConexion();
            String sql = "DELETE FROM productos WHERE codigo = ?";
            stmt = conexion.prepareStatement(sql);
            stmt.setString(1, p.getCodigo());
            filasAfectadas = stmt.executeUpdate();

        } catch (SQLException e) {
        } finally {
            BaseDatos.cerrarStatement(stmt);
        }
        return filasAfectadas;
    }

    public static InputStream buscarFoto(Producto p) {
        InputStream streamFoto = null;
        Connection conn = null;
        PreparedStatement prepSt = null;
        ResultSet rs = null;
        try {
            conn = BaseDatos.obtenerConexion();
            String sql = "SELECT imagen FROM productos WHERE codigo = ?";

            prepSt = conn.prepareStatement(sql);
            prepSt.setString(1, p.getCodigo());

            rs = prepSt.executeQuery();

            if (rs.next()) {
                streamFoto = rs.getBinaryStream(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            BaseDatos.cerrarResultSet(rs);
            BaseDatos.cerrarStatement(prepSt);
        }
        return streamFoto;

    }

    public static int actualizarProducto(Producto p, boolean actualizarFoto) {
        int filasAfectadas = 0;
        Connection conexion = null;
        PreparedStatement pstm = null;

        try {

            conexion = BaseDatos.obtenerConexion();
            String sql = "";
            if (!actualizarFoto) {
                sql = "UPDATE productos "
                        + "SET nombre = ?, descripcion = ? ,"
                        + "precio_venta = ?, precio_compra = ?, stock = ? , "
                        + "id_proveedor = ? ";
            } else {
                sql += ", imagen = ?";
            }
            sql += " WHERE codigo = ?";

            pstm = conexion.prepareStatement(sql);
            pstm.setString(1, p.getNombre());
            pstm.setString(2, p.getDescripcion());
            pstm.setDouble(3, p.getPrecioVenta());
            pstm.setDouble(4, p.getPrecioCompra());
            pstm.setInt(5, p.getStock());
            pstm.setString(6, p.getIdProveedor());
            int codigo = 7;
            if (actualizarFoto) {
                File fileFoto = p.getFoto();
                FileInputStream fis = new FileInputStream(fileFoto);
                long size = p.getFoto().length();
                pstm.setBinaryStream(6, fis, size);
                codigo++;
            }

            pstm.setString(codigo, p.getCodigo());

            filasAfectadas = pstm.executeUpdate();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDatos.cerrarStatement(pstm);
        }

        return filasAfectadas;
    }

}
