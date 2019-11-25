/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import db.MetodosSQL;

/**
 *
 * @author Horacio
 */
public class Programa {
  
  public static void main(String[] args) {
    System.out.println(MetodosSQL.obtenerProductoPorCodigo("123456789101"));
    
  }
}
