/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author Horacio
 */
public class PintarLabel extends JLabel {

  private BufferedImage bufferedImage;

  public PintarLabel(BufferedImage bufferedImage) {
    this.setSize(200, 200);
    this.bufferedImage = bufferedImage;
  }

  @Override
  protected void paintComponent(Graphics g) {
    Image img = bufferedImage;
    g.drawImage(bufferedImage, 0, 0, this);
  }

}
