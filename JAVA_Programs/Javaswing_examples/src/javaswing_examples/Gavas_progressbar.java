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
public class Gavas_progressbar extends JFrame{
JProgressBar gavas_jp=new JProgressBar(0,2000); 
Gavas_progressbar()
{
       setSize(500,500);
       setLayout(null);
       setVisible(true);
       ///
       gavas_jp.setBounds(10, 100,300,20);
       gavas_jp.setValue(0);
       gavas_jp.setStringPainted(true);
       add(gavas_jp);
}
public void progress()
{
       for(int i=0;i<2000;i++)
       {
              gavas_jp.setValue(i);
              i=i+20;
              try
              {
                     Thread.sleep(150);
              }
              catch(Exception e)
              {
                     
              }
       }
}
}
