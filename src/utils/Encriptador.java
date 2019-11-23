/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import static org.apache.commons.codec.binary.Base64.encodeBase64;

/**
 *
 * @author Horacio
 */
public class Encriptador {

  private final static String algoritmo = "AES";
  private final static String cifrado = "AES/CBC/PKCS5Padding";
  private static String key = "0123456789ABCDEF";
  private static String iv = "0123456789ABCDEF";

  public static String encriptar(String texto) throws Exception {
    Cipher cipher = Cipher.getInstance(cifrado);
    SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algoritmo);
    IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
    cipher.init(cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
    byte[] ecryptado = cipher.doFinal(texto.getBytes());
    return new String(encodeBase64(ecryptado));

  }

  public static String desencriptar(String texto) throws Exception {
    Cipher cipher = Cipher.getInstance(cifrado);
    SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algoritmo);
    IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
    byte[] encryptado = Base64.decodeBase64(texto);

    cipher.init(cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
    byte[] desencriptado = cipher.doFinal(encryptado);
    return new String(desencriptado);

  }
}
