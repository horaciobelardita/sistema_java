/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;

/**
 *
 * @author Horacio
 */
public class Producto {

  private String codigo;
  private String nombre;
  private String descripcion;
  private Integer stock;
  private File foto;
  private Double precioCompra;
  private Double precioVenta;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public File getFoto() {
    return foto;
  }

  public void setFoto(File foto) {
    this.foto = foto;
  }

  public Double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(Double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public Double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(Double precioVenta) {
    this.precioVenta = precioVenta;
  }

  @Override
  public String toString() {
    return nombre;
  }

}
