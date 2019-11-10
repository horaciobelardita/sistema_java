/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Horacio
 */
public class Paginador<T> {

  private  List<T> lista;
  private  JLabel label;
  private  int totalRegistros, registrosXPag, cantidadPag, numeroPag = 1;

  public int getRegistrosXPag() {
    return registrosXPag;
  }

  public int getCantidadPag() {
    return cantidadPag;
  }

  public int getNumeroPag() {
    return numeroPag;
  }
  
  public Paginador(List<T> lista, JLabel label, int regXPag) {
    this.lista = lista;
    this.label = label;
    registrosXPag = regXPag;
    cargarDatos();
  }

  private void cargarDatos() {
    totalRegistros = lista.size();
    cantidadPag = (totalRegistros / registrosXPag);
    if ((totalRegistros % registrosXPag) > 0) {
      cantidadPag++;
    }
    label.setText("Páginas 1/" + cantidadPag);
  }

  public int primero() {
    numeroPag = 1;
    label.setText("Páginas " + numeroPag + "/" + cantidadPag);
    return numeroPag;
  }

  public int anterior() {
    if (numeroPag > 1) {
      numeroPag--;
      label.setText("Páginas " + numeroPag + "/" + cantidadPag);
    }
    return numeroPag;
  }

  public int siguiente() {
    if (numeroPag < cantidadPag) {
      numeroPag += 1;
      label.setText("Paginas " + numeroPag + "/" + cantidadPag);
    }
    return numeroPag;
  }

  public int ultimo() {
    numeroPag = cantidadPag;
    label.setText("Paginas " + numeroPag + "/" + cantidadPag);
    return numeroPag;
  }
}
