
package metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class metodos_sql {
    public static conexion_bd conexion = new conexion_bd();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero=0;
    
    public int guardar_us(String nick, String nombre, String email,String pass, String tipo){
        int resultado=0;
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO usuarios(nick ,nombre_us, email_us, password, tipo_us) VALUES (?,?,?,?,?)");
        
        try {
            conexion=conexion_bd.conectar();
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nick);
            sentencia_preparada.setString(2, nombre);
            sentencia_preparada.setString(3, email);
            sentencia_preparada.setString(4, pass);
            sentencia_preparada.setString(5, tipo);
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        
        return resultado;
    
    }
    
    public int guardar_inv(String nombre, String pre_com, String pre_ven, String cant_inv, String id_prove, String url_inv, String descr_inv){
        int resultado=0;
        Connection conexion=null;
        String sentencia_guardar=("INSERT INTO inventario (nombre ,pre_com, pre_ven, cantidad, id_prove, descripcion, imagen) VALUES (?,?,?,?,?,?,?)");
        
        try {
            conexion=conexion_bd.conectar();
            sentencia_preparada= conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, pre_com);
            sentencia_preparada.setString(3, pre_ven);
            sentencia_preparada.setString(4, cant_inv);
            sentencia_preparada.setString(5, cant_inv);
            sentencia_preparada.setString(6, url_inv);
            sentencia_preparada.setString(7, descr_inv);
            
            resultado=sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        
        return resultado;
    
    }
    
    public static String buscar_nombre(String nick){
        String busqueda_nombre=null;
        Connection conexion=null;
        try {
            conexion = conexion_bd.conectar();
            String sentencia_buscar=("SELECT nombre_us FROM usuarios WHERE nick='"+nick+"' ");
            sentencia_preparada=conexion.prepareStatement(sentencia_buscar);
            resultado= sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_nombre =resultado.getString("nombre_us");
                    
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return busqueda_nombre;
    }
    
    public static String buscar_usuario(String nick, String password){
        String busqueda_usuario=null;
        Connection conexion =null;
        
        try {
            conexion = metodos_sql.conexion.conectar();
            String buscar_usuario=("SELECT nick, password FROM usuarios WHERE nick='"+nick+"' && password='"+password+"'");
            sentencia_preparada=conexion.prepareStatement(buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "Usuario encontrado";
            }else{
                busqueda_usuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("e");
        }
        return busqueda_usuario;
    }

}
