/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import db.BaseDatos;
import db.MetodosSQL;
import java.sql.Connection;
import java.util.ArrayList;
import modelos.Producto;
import modelos.Proveedor;

/**
 *
 * @author Horacio
 */
public class Programa {
    public static void main(String[] args) {
        ArrayList<Producto> proveedores = MetodosSQL.obtenerProductos();
        for (Producto proveedor : proveedores) {
            System.out.println(proveedor);
        }
        
    }
}
