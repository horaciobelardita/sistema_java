/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Date;

/**
 *
 * @author horaciobelardita
 */
public class Venta {

  private String id;
  private Date fecha;
  private Double importeNeto;
  private Double importeBruto;
  private Integer iva;
  private String dni;

  public Venta(String id, Date fecha, Double importeNeto, Double importeBruto, Integer iva, String dni) {
    this.id = id;
    this.fecha = fecha;
    this.importeNeto = importeNeto;
    this.importeBruto = importeBruto;
    this.iva = iva;
    this.dni = dni;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Double getImporteNeto() {
    return importeNeto;
  }

  public void setImporteNeto(Double importeNeto) {
    this.importeNeto = importeNeto;
  }

  public Double getImporteBruto() {
    return importeBruto;
  }

  public void setImporteBruto(Double importeBruto) {
    this.importeBruto = importeBruto;
  }

  public Integer getIva() {
    return iva;
  }

  public void setIva(Integer iva) {
    this.iva = iva;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

}
