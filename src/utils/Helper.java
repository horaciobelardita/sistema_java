package utils;

import javax.swing.JTextField;

public class Helper {

    public static void validarSoloNumero(java.awt.event.KeyEvent evt, JTextField campo) {
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            campo.setEditable(true);
        } else {
            campo.setEditable(false);
        }
    }
}
