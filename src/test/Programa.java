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

/**
 *
 * @author Horacio
 */
public class Programa {
    public static void main(String[] args) {
        ArrayList<Producto> productos = MetodosSQL.obtenerProductosPorCriterio("pep");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
        
    }
}
