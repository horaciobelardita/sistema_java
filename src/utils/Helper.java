package utils;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Helper {

    public static void validarSoloNumero(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || 
                evt.getKeyChar() == KeyEvent.VK_DELETE || 
                evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            campo.setEditable(true);
        } else {
            campo.setEditable(false);
        }
    }
    
    public static void validarSoloNumeroDecimales(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || 
                evt.getKeyChar() == KeyEvent.VK_DELETE ||
                 evt.getKeyChar() == KeyEvent.VK_BACK_SPACE ||
                evt.getKeyChar() == KeyEvent.VK_COMMA
                ) {
            campo.setEditable(true);
        } else {
            campo.setEditable(false);
        }
    }
    
    public static String convertirComaAPunto(String valor) {
        String retorno = "";
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) == ',') {
                retorno += ".";
            } else {
                retorno += valor.charAt(i);
            }
        }
        return retorno;
    }
}
