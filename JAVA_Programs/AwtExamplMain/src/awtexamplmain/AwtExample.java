/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awtexamplmain;
import java.awt.*;
/**
 *
 * @author HP
 */
public class AwtExample extends Frame{

    public AwtExample() {
       
       setSize(500,500);
        Label names=new Label("Name:");
        names.setBounds(100, 100,50,10);
        add(names);
        
        TextField n=new TextField();
        n.setBounds(210, 100,150,15);
        add(n);
        Label Address=new Label("Address:");
        Address.setBounds(100, 140,50,10);
        add(Address);
        
        TextField ad=new TextField();
        ad.setBounds(210, 140,150,15);
        add(ad);
        
        Label Phno=new Label("Phone Number:");
        Phno.setBounds(100, 180,90,10);
        add(Phno);
       
          TextField pn=new TextField();
        pn.setBounds(210, 180,150,15);
        add(pn);
        
         Label Email=new Label("Email Id:");
        Email.setBounds(100, 220,50,10);
        add(Email);
        
          TextField em=new TextField();
        em.setBounds(210, 220,150,15);
        add(em);
        
         Label Gender=new Label("Gender:");
        Gender.setBounds(100, 260,50,10);
        add(Gender);
        
         Label Qualification=new Label("Qualification:");
        Qualification.setBounds(100, 300,80,10);
        add(Qualification);
        
        Label College=new Label("College Name:");
        College.setBounds(100, 340,80,10);
        add(College);
        
        Label Passout=new Label("Pass Out Year:");
        Passout.setBounds(100, 380,90,10);
        add(Passout);
        
        Button R=new Button("Register");
        R.setBounds(250, 450,10,10);
        add(R);
       
    setVisible(true);
        setLayout(null);
   
    
}
}