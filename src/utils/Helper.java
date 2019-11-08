package utils;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Helper {

    public static void validarSoloNumero(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'
                || evt.getKeyChar() == KeyEvent.VK_DELETE
                || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            campo.setEditable(true);
        } else {
            campo.setEditable(false);
        }
    }

    public static void validarSoloNumeroDecimales(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'
                || evt.getKeyChar() == KeyEvent.VK_DELETE
                || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE
                || evt.getKeyChar() == KeyEvent.VK_COMMA) {
            campo.setEditable(true);
        } else {
            campo.setEditable(false);
        }
    }

    public static void validarAlphanumerico(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z'
                || evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z'
                || evt.getKeyChar() == KeyEvent.VK_DELETE
                || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE
                || evt.getKeyChar() == KeyEvent.VK_SPACE) {
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

    public static String convertirPuntoAComa(String valor) {
        String retorno = "";
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) == '.') {
                retorno += ",";
            } else {
                retorno += valor.charAt(i);
            }
        }
        return retorno;
    }

    public static boolean esCampoVacio(JTextField campo) {
        return campo.getText().trim().isEmpty();
    }

    public static void mostrarError(JTextField campo, JLabel label, String msgError, Color color) {
        label.setText(msgError);
        label.setForeground(color);
        campo.requestFocus();
    }

}
