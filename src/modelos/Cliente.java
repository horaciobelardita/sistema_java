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
public class Cliente {

  private String nombre;
  private String apellido;
  private String dni;
  private String telefono;
  private String categoriaIva;
  private String direccion;

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCategoriaIva() {
    return categoriaIva;
  }

  public void setCategoriaIva(String categoriaIva) {
    this.categoriaIva = categoriaIva;
  }

  public Cliente(String nombre, String apellido, String dni, String telefono, String categoriaIva) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.telefono = telefono;
    this.categoriaIva = categoriaIva;
  }

  public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String categoriaIva) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.direccion = direccion;
    this.telefono = telefono;
    this.categoriaIva = categoriaIva;
  }

  public Cliente(String nombre, String apellido, String dni, String categoriaIva) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.categoriaIva = categoriaIva;
  }

  public Cliente() {

  }

  @Override
  public String toString() {
    return nombre;
  }

}
