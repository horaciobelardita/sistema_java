/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author horaciobelardita
 */
public class DetalleVenta {

  private Integer numDetalle;
  private String idVenta;
  private String codigoProducto;
  private Integer cantidad;
  private Double precioProducto;

  public DetalleVenta(Integer numDetalle, String idVenta, String codigoProducto, Integer cantidad, Double precioProd) {
    this.numDetalle = numDetalle;
    this.idVenta = idVenta;
    this.codigoProducto = codigoProducto;
    this.cantidad = cantidad;
    this.precioProducto = precioProd;
  }

  public Integer getNumDetalle() {
    return numDetalle;
  }

  public String getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(String idVenta) {
    this.idVenta = idVenta;
  }

  public double getPrecioProducto() {
    return this.precioProducto;
  }

  public String getCodigoProducto() {
    return codigoProducto;
  }

  public void setCodigoProducto(String codigoProducto) {
    this.codigoProducto = codigoProducto;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

}
