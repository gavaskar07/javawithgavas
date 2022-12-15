/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_examples;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Gavas_textfield {
 Gavas_textfield()
 {
   JFrame gavas_frame=new JFrame("Gavas's Frame"); 
   gavas_frame.setSize(400, 400);
   gavas_frame.setLayout(null);
   gavas_frame.setVisible(true);
  JTextArea gavas_text=new JTextArea();
  gavas_text.setBounds(10, 30, 100, 20);
  gavas_text.setBackground(Color.red);
  gavas_text.setForeground(Color.WHITE);
  gavas_frame.add(gavas_text);
 }
}
