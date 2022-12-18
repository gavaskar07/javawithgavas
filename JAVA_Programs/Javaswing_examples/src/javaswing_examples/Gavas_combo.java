/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_examples;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Gavas_combo extends JFrame  {
    Gavas_combo()
    {
         setSize(400,400);
         setLayout(null);
         setVisible(true);
         String department[]={"CSE","IT","ECE","EEE"};
         JComboBox gavas_combo=new JComboBox(department);
         gavas_combo.setBounds(150, 150, 100,30);
         add(gavas_combo);
    }
}
