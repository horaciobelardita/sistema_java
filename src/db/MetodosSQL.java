package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.DetalleVenta;
import modelos.Producto;
import modelos.Proveedor;
import modelos.Usuario;
import modelos.Venta;

public class MetodosSQL extends BaseDatos {

  public static int guardarUsuario(Usuario usuario) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;
    String sql = "INSERT INTO usuarios "
      + "(nick ,nombre, password, tipo_usuario) "
      + "VALUES (?,?,?,?)";

    try {
      conexion = obtenerConexion();
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, usuario.getNick());
      pstm.setString(2, usuario.getNombre());
      pstm.setString(3, usuario.getPassword());
      pstm.setString(4, usuario.getTipoUsuario());

      filasAfectadas = pstm.executeUpdate();

    } catch (SQLException e) {
    } finally {
      BaseDatos.cerrarStatement(pstm);
    }

    return filasAfectadas;

  }

  public static String numeroFactura() {
    Connection conexion = null;
    Statement stmt = null;
    ResultSet rs = null;
    String res = null;
    try {
      conexion = obtenerConexion();
      stmt = conexion.createStatement();
      String sql = "select max(id_venta) from ventas";
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        res = rs.getString(1);
      }
      if (res == null) {
        res = "00000001";
      } else {
        res = String.format("%08d", Integer.parseInt(res) + 1);

      }

    } catch (SQLException e) {
    } finally {
      cerrarStatement(stmt);
    }
    return res;
  }

  public static ArrayList<Producto> obtenerProductos() {
    Connection conexion = null;
    ArrayList<Producto> productos = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
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
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return productos;

  }

  public static ArrayList<Proveedor> obtenerProveedores() {
    Connection conexion = null;
    ArrayList<Proveedor> proveedores = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
      stmt = conexion.createStatement();
      String sql = "SELECT * FROM proveedores ORDER BY id";
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Proveedor prov = new Proveedor();
        prov.setId(rs.getString("id"));
        prov.setNombre(rs.getString("nombre"));
        prov.setDireccion(rs.getString("direccion"));
        prov.setTelefono(rs.getString("telefono"));
        prov.setEmail(rs.getString("email"));
        proveedores.add(prov);
      }

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return proveedores;

  }

  public static int guardarProducto(Producto p, boolean cambiarFoto) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;

    try {

      conexion = obtenerConexion();
      if (cambiarFoto) {
        String sql = "INSERT INTO productos "
          + "(codigo ,nombre, descripcion, "
          + "precio_venta, precio_compra, stock, imagen) "
          + "VALUES (?,?,?,?,?,?,?)";
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
      } else {
        String sql = "INSERT INTO productos "
          + "(codigo ,nombre, descripcion, "
          + "precio_venta, precio_compra, stock) "
          + "VALUES (?,?,?,?,?,?)";
        pstm = conexion.prepareStatement(sql);
        pstm.setString(1, p.getCodigo());
        pstm.setString(2, p.getNombre());
        pstm.setString(3, p.getDescripcion());
        pstm.setDouble(4, p.getPrecioVenta());
        pstm.setDouble(5, p.getPrecioCompra());
        pstm.setInt(6, p.getStock());
      }
      filasAfectadas = pstm.executeUpdate();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage());

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      cerrarStatement(pstm);
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
  public static Usuario buscarUsuario(String nick) {
    Connection conexion = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Usuario usuario = null;
    try {
      conexion = obtenerConexion();
      String sql = "SELECT * "
        + "FROM usuarios WHERE nick=?";
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, nick);
      rs = pstm.executeQuery();

      while (rs.next()) {
        usuario = new Usuario();

        usuario.setId(rs.getInt("id"));
        usuario.setNick(rs.getString("nick"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setPassword(rs.getString("password"));
        usuario.setTipoUsuario(rs.getString("tipo_usuario"));
      }
    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(pstm);
    }
    return usuario;
  }

  public static ArrayList<Producto> obtenerProductosPorCriterio(String filtro) {
    Connection conexion = null;
    ArrayList<Producto> productos = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
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
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return productos;
  }

  public static int borrarProducto(Producto p) {
    Connection conexion = null;
    PreparedStatement stmt = null;
    int filasAfectadas = 0;
    try {
      conexion = obtenerConexion();
      String sql = "DELETE FROM productos WHERE codigo = ?";
      stmt = conexion.prepareStatement(sql);
      stmt.setString(1, p.getCodigo());
      filasAfectadas = stmt.executeUpdate();

    } catch (SQLException e) {
    } finally {
      cerrarStatement(stmt);
    }
    return filasAfectadas;
  }

  public static InputStream buscarFoto(Producto p) {
    InputStream streamFoto = null;
    Connection conn;
    Statement st = null;
    ResultSet rs = null;
    try {
      conn = obtenerConexion();
      String sql = "SELECT imagen FROM productos WHERE codigo = " + p.getCodigo();

      st = conn.createStatement();

      rs = st.executeQuery(sql);

      if (rs.next()) {
        streamFoto = rs.getBinaryStream(1);
      }

    } catch (SQLException ex) {
      ex.printStackTrace();
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(st);
    }
    return streamFoto;

  }

  public static int actualizarProducto(Producto p, boolean actualizarFoto) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;

    try {

      conexion = obtenerConexion();
      String sql = "UPDATE productos "
        + "SET nombre = ?, descripcion = ? ,"
        + "precio_venta = ?, precio_compra = ?, stock = ? ";
      if (actualizarFoto) {
        sql += ", imagen = ?";
      }
      sql += " WHERE codigo = ?";
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, p.getNombre());
      pstm.setString(2, p.getDescripcion());
      pstm.setDouble(3, p.getPrecioVenta());
      pstm.setDouble(4, p.getPrecioCompra());
      pstm.setInt(5, p.getStock());
      int codigo = 6;
      if (actualizarFoto) {
        File fileFoto = p.getFoto();
        FileInputStream fis = new FileInputStream(fileFoto);
        long size = p.getFoto().length();
        pstm.setBinaryStream(codigo, fis, size);
        codigo++;
      }

      pstm.setString(codigo, p.getCodigo());

      filasAfectadas = pstm.executeUpdate();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage());

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;
  }

  public static void insertarVenta(Venta venta) {
    Connection conexion = null;
    ResultSet rs = null;
    PreparedStatement pstm = null;
    String sql = "INSERT INTO ventas "
      + "VALUES (?,?,?,?, ?,?)";
    String ultimoId = null;
    try {
      conexion = obtenerConexion();
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, venta.getId());
      pstm.setDate(2, venta.getFecha());
      pstm.setString(3, venta.getDni());
      pstm.setInt(4, venta.getIva());
      pstm.setDouble(5, venta.getImporteBruto());
      pstm.setDouble(6, venta.getImporteNeto());
      pstm.executeUpdate();

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(pstm);
    }

  }

  public static int insertarDetalleVenta(DetalleVenta detalleVenta) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;
    String sql = "INSERT INTO detalle_venta "
      + "(num_detalle, id_venta, codigo_producto, cantidad, precio) "
      + "VALUES (?,?,?,?,?)";
    try {
      conexion = obtenerConexion();
      pstm = conexion.prepareStatement(sql);
      pstm.setInt(1, detalleVenta.getNumDetalle());
      pstm.setString(2, detalleVenta.getIdVenta());
      pstm.setString(3, detalleVenta.getCodigoProducto());
      pstm.setInt(4, detalleVenta.getCantidad());
      pstm.setDouble(5, detalleVenta.getPrecioProducto());
      filasAfectadas = pstm.executeUpdate();
    } catch (SQLException e) {
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;

  }

  public static ArrayList<Cliente> obtenerClientesPorCriterio(String criterio) {
    Connection conexion = null;
    ArrayList<Cliente> clientes = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
      stmt = conexion.createStatement();
      String sql = "SELECT * FROM clientes WHERE dni LIKE '%"
        + criterio + "%' "
        + "OR nombre LIKE '%" + criterio + "%'"
        + "OR apellidos LIKE '%" + criterio + "%'";
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Cliente cliente = new Cliente();
        cliente.setDni(rs.getString("dni"));
        cliente.setApellido(rs.getString("apellidos"));
        cliente.setNombre(rs.getString("nombre"));
        cliente.setTelefono(rs.getString("telefono"));
        cliente.setDireccion(rs.getString("direccion"));
        cliente.setCategoriaIva(rs.getString("categoria_iva"));
        clientes.add(cliente);
      }

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return clientes;
  }

  public static ArrayList<Cliente> obtenerClientes() {
    Connection conexion = null;
    ArrayList<Cliente> clientes = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
      stmt = conexion.createStatement();
      String sql = "SELECT * FROM clientes ORDER BY dni";
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Cliente cliente = new Cliente();
        cliente.setDni(rs.getString("dni"));
        cliente.setApellido(rs.getString("apellidos"));
        cliente.setNombre(rs.getString("nombre"));
        cliente.setTelefono(rs.getString("telefono"));
        cliente.setDireccion(rs.getString("direccion"));
        cliente.setCategoriaIva(rs.getString("categoria_iva"));
        clientes.add(cliente);
      }

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return clientes;
  }

  public static int guardarCliente(Cliente cliente) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;
    String sql = "INSERT INTO clientes "
      + "(dni, nombre, apellidos, telefono, direccion, categoria_iva) "
      + "VALUES (?,?,?,?,?,?)";
    try {
      conexion = obtenerConexion();
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, cliente.getDni());
      pstm.setString(2, cliente.getNombre());
      pstm.setString(3, cliente.getApellido());
      pstm.setString(4, cliente.getTelefono());
      pstm.setString(5, cliente.getDireccion());
      pstm.setString(6, cliente.getCategoriaIva());

      filasAfectadas = pstm.executeUpdate();
      pstm.close();
    } catch (SQLException e) {
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;

  }

  public static int actualizarCliente(Cliente c) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;

    try {

      conexion = obtenerConexion();
      String sql = "UPDATE clientes "
        + "SET nombre = ?, apellidos = ? ,"
        + "telefono = ?, direccion = ?, categoria_iva = ? ";
      sql += " WHERE dni = ?";
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, c.getNombre());
      pstm.setString(2, c.getApellido());
      pstm.setString(3, c.getTelefono());
      pstm.setString(4, c.getDireccion());
      pstm.setString(5, c.getCategoriaIva());
      pstm.setString(6, c.getDni());

      filasAfectadas = pstm.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;
  }

  public static int borrarCliente(Cliente c) {
    Connection conexion = null;
    PreparedStatement stmt = null;
    int filasAfectadas = 0;
    try {
      conexion = obtenerConexion();
      String sql = "DELETE FROM clientes WHERE dni = ?";
      stmt = conexion.prepareStatement(sql);
      stmt.setString(1, c.getDni());
      filasAfectadas = stmt.executeUpdate();

    } catch (SQLException e) {
    } finally {
      cerrarStatement(stmt);
    }
    return filasAfectadas;
  }

  public static List<Proveedor> obtenerProveedoresPorCriterio(String criterio) {
    Connection conexion = null;
    List<Proveedor> proveedores = new ArrayList<>();
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conexion = obtenerConexion();
      stmt = conexion.createStatement();
      String sql = "SELECT * FROM proveedores WHERE id LIKE '%"
        + criterio + "%' "
        + "OR nombre LIKE '%" + criterio + "%'";
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        Proveedor proveedor = new Proveedor();
        proveedor.setId(rs.getString("id"));
        proveedor.setNombre(rs.getString("nombre"));
        proveedor.setTelefono(rs.getString("telefono"));
        proveedor.setDireccion(rs.getString("direccion"));
        proveedor.setEmail(rs.getString("email"));
        proveedores.add(proveedor);
      }

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(stmt);
    }
    return proveedores;
  }

  public static int guardarProveedor(Proveedor prov) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;
    String sql = "INSERT INTO proveedores "
      + "(id, nombre, direccion,  telefono, email) "
      + "VALUES (?,?,?,?,?)";
    try {
      conexion = obtenerConexion();
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, prov.getId());
      pstm.setString(2, prov.getNombre());
      pstm.setString(3, prov.getDireccion());
      pstm.setString(4, prov.getTelefono());
      pstm.setString(5, prov.getEmail());

      filasAfectadas = pstm.executeUpdate();
      pstm.close();
    } catch (SQLException e) {
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;
  }

  public static int actualizarProveedor(Proveedor prov) {
    int filasAfectadas = 0;
    Connection conexion = null;
    PreparedStatement pstm = null;

    try {

      conexion = obtenerConexion();
      String sql = "UPDATE proveedores "
        + "SET nombre = ?,"
        + "telefono = ?, direccion = ?, email = ? ";
      sql += " WHERE id = ?";
      pstm = conexion.prepareStatement(sql);
      pstm.setString(1, prov.getNombre());
      pstm.setString(2, prov.getTelefono());
      pstm.setString(3, prov.getDireccion());
      pstm.setString(4, prov.getEmail());
      pstm.setString(5, prov.getId());

      filasAfectadas = pstm.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;
  }

  public static int borrarProveedor(Proveedor prov) {
    Connection conexion = null;
    PreparedStatement stmt = null;
    int filasAfectadas = 0;
    try {
      conexion = obtenerConexion();
      String sql = "DELETE FROM proveedores WHERE id = ?";
      stmt = conexion.prepareStatement(sql);
      stmt.setString(1, prov.getId());
      filasAfectadas = stmt.executeUpdate();

    } catch (SQLException e) {
    } finally {
      cerrarStatement(stmt);
    }
    return filasAfectadas;
  }

  public static Producto obtenerProductoPorCodigo(String codigo) {
    Connection conexion;
    Statement pstm = null;
    ResultSet rs = null;
    Producto p = new Producto();
    try {
      conexion = obtenerConexion();
      pstm = conexion.createStatement();
      String sql = "SELECT * FROM productos WHERE codigo = " + codigo;
      rs = pstm.executeQuery(sql);
      while (rs.next()) {
        p = new Producto();
        p.setCodigo(codigo);
        p.setNombre(rs.getString("nombre"));
        p.setNombre(rs.getString("descripcion"));
        p.setPrecioCompra(rs.getDouble("precio_compra"));
        p.setPrecioVenta(rs.getDouble("precio_venta"));
        p.setStock(rs.getInt("stock"));
      }

    } catch (SQLException e) {
    } finally {
      cerrarResultSet(rs);
      cerrarStatement(pstm);
    }
    return p;
  }

  public static int actualizarStockProducto(String codigo, int cantidad) {
    int filasAfectadas = 0;
    Connection conexion;
    PreparedStatement pstm = null;

    try {

      conexion = obtenerConexion();
      String sql = "UPDATE productos "
        + "SET stock = stock - ?";
      sql += " WHERE codigo = ?";
      pstm = conexion.prepareStatement(sql);
      pstm.setInt(1, cantidad);
      pstm.setString(2, codigo);

      filasAfectadas = pstm.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      cerrarStatement(pstm);
    }

    return filasAfectadas;
  }
}
