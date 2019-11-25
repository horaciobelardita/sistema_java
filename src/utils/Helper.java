package utils;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import net.sourceforge.jbarcodebean.JBarcodeBean;

public class Helper {

  public static void validarSoloNumero(java.awt.event.KeyEvent evt) {
    if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9')
      && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
      evt.consume();
    }
  }

  public static void validarCampoDni(KeyEvent evt, JTextField textField) {
    char ch = evt.getKeyChar();
//    validar solo caracteres alfanumericos
    if ((ch < '0' || ch > '9')
      && (ch != KeyEvent.VK_BACK_SPACE)) {
      evt.consume();

    } else if (textField.getText().length() >= 8) {
      evt.consume();
    }
  }

  public static void validarSoloNumeroDecimales(java.awt.event.KeyEvent evt, JTextField textField) {
    char ch = evt.getKeyChar();
//    validar solo caracteres alfanumericos
    if ((ch < '0' || ch > '9') && textField.getText().contains(".")
      && (ch != KeyEvent.VK_BACK_SPACE)) {
      evt.consume();

    } else if ((ch < '0' || ch > '9') && ch != '.'
      && (ch != KeyEvent.VK_BACK_SPACE)) {
      evt.consume();
    }
  }

  public static void validarAlphanumerico(java.awt.event.KeyEvent evt) {
    //    obtener el valor de la tecla presionada
    char ch = evt.getKeyChar();
//    validar solo caracteres alfanumericos
    if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')
      && (ch != KeyEvent.VK_BACK_SPACE) && (ch != KeyEvent.VK_SPACE)) {
      evt.consume();

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

  public static void cargarCodigoBarra(String codigoBarra, JLabel label) {
    //    tipo de codigo barra
    JBarcodeBean barcode = new JBarcodeBean();
    barcode.setCodeType(new Interleaved25());
    barcode.setCode(codigoBarra);
    barcode.setCheckDigit(true);
    BufferedImage bufferedImage = barcode.draw(new BufferedImage(160, 80, BufferedImage.TYPE_INT_RGB));
    PintarLabel p = new PintarLabel(bufferedImage);
    label.removeAll();
    label.add(p);
    label.repaint();
  }

}
