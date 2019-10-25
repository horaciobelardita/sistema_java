
package metodos_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_bd {
    public static String url="jdbc:mysql://localhost/gestor_comercio";
    public static String usuario = "root";
    public static String contraseña="password";
    public static String clase="com.mysql.jdbc.Driver";
    
    public static Connection conectar() throws SQLException{
        Connection conexion=null;
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.print("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
        
    }
    
}
