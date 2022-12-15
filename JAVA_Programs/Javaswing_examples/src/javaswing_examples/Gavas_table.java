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
public class Gavas_table{
       Gavas_table()
       {
        JFrame gavas_frame=new JFrame("Gavaskar Frame for Table");
        gavas_frame.setSize(400, 400);
        gavas_frame.setVisible(true);
        gavas_frame.setLayout(null);
        //creating table component
        String column[]={"Roll","Name","EMail"};
        String row[][]={{"5011","GAVASKAR","gavaskar07@gmail.com"}          
        ,{"5012","HARI","hari@gmail.com"}};
        JTable gavas_table=new JTable(row,column);
        gavas_table.setBounds(10, 50, 300, 100);
        gavas_frame.add(gavas_table);
       }
}
