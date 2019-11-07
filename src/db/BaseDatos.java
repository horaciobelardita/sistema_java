package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class BaseDatos {

    private static Connection con = null;

    public static Connection obtenerConexion() {
        try {
            if (con == null) {
                // con esto determinamos cuando finalize el programa
                Runtime.getRuntime().addShutdownHook(new MiShDwnHook());
                ResourceBundle rb = ResourceBundle.getBundle("db");
                String driver = rb.getString("driver");
                String url = rb.getString("url");
                String pwd = rb.getString("password");
                String usr = rb.getString("user");
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
            }
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al crear la conexion");
            throw new RuntimeException("Error al crear la conexion", ex);
        }
    }

   

    public static void cerrarStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public static void cerrarResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    static class MiShDwnHook extends Thread {
// justo antes de fnalizar el programa la JVM invocara
// a este metodo donde podemos cerrar la conexion

        public void run() {
            try {
                Connection con = BaseDatos.obtenerConexion();
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}
