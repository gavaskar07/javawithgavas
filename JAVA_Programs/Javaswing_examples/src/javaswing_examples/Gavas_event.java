/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_examples;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */
public class Gavas_event extends JFrame implements ActionListener {
       JTextField gavas_jt=new JTextField();
   Gavas_event()
   {
      setSize(500,500);
      setVisible(true);
      setLayout(null);
      //creating textfiled    
      gavas_jt.setBounds(150, 150, 300, 50);
      add(gavas_jt);
      ///creating buttom
      JButton gavas_jb=new JButton("Click here");
      gavas_jb.setBounds(150, 200, 100, 20);
      gavas_jb.addActionListener(this);
      add(gavas_jb);
   }

       @Override
       public void actionPerformed(ActionEvent e) {
         gavas_jt.setText("Welcome to JAVA Swing");
       }
}
