/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception_handling;
import java.io.*;
/**
 *
 * @author HP
 */
public class division_number {
    public void division()
    {
 try
 {
     int numerator=20;
     int denominator=0;
     int division=numerator/denominator;
     System.out.println("The division value is"+ division);
 }
 catch(Exception e)
 {
    System.out.println(e.getMessage());
 } 
 finally
 {
     System.out.println("The finlly block");
 }
    }
}
