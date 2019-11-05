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
    private Integer idVenta;
    private String codigoProducto;
    private Integer cantidad;

    public DetalleVenta(Integer idVenta, String codigoProducto, Integer cantidad) {
        this.idVenta = idVenta;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }
        
    
    
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
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
