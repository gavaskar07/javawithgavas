/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt_examples;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */
public class Student_reg implements ActionListener{
     Label name=new Label("Name");
    Student_reg()
    {
        Frame f=new Frame();
        f.setSize(500, 500);
        //setting label
       
        name.setBounds(50,20 , 100, 50);
        f.add(name);
        //setting textbox
        TextField txt_name=new TextField();
        txt_name.setBounds(200, 30, 100, 20);
        f.add(txt_name);
        ///radio button
        Label gender=new Label("Gender");
        gender.setBounds(50,60 , 100, 50);
        f.add(gender);
       CheckboxGroup ck_g1=new CheckboxGroup();
       Checkbox chk_male=new Checkbox("Male",ck_g1,false);
       chk_male.setBounds(200, 60, 100, 50);
       f.add(chk_male);
       Checkbox chk_female=new Checkbox("Fe-Male",ck_g1,false);
        chk_female.setBounds(300, 60, 100, 50);
       f.add(chk_female);
       ///check box
        Label hobies=new Label("Hobies");
        hobies.setBounds(50,100 , 100, 50);
        f.add(hobies);
        Checkbox chk_hobies_play=new Checkbox("Playing");
        chk_hobies_play.setBounds(200,100 , 100, 50);
        f.add(chk_hobies_play);
        Checkbox chk_hobies_singing=new Checkbox("Singing");
        chk_hobies_singing.setBounds(300,100 , 100, 50);
        f.add(chk_hobies_singing);
        
        //dropdown
        Label department=new Label("Department");
        department.setBounds(50,140 , 100, 50);
        f.add(department);
        Choice ch_dept=new Choice();
        ch_dept.add("CSE");
        ch_dept.add("IT");
        ch_dept.add("ECE");
        ch_dept.setBounds(200, 160, 100, 50);
        f.add(ch_dept);
        ///button
        Button register=new Button("Register");
        register.setBounds(200, 220, 100, 50);
        register.addActionListener(this);
        f.add(register);

        
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //Dialog d=new Dialog(f,)
       name.setText("welcome......");
    }
}
