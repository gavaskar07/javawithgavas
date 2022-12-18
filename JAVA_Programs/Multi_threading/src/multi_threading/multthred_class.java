/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multi_threading;
import java.lang.*;
 /*
 * @author HP
 */
public class multthred_class extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("THe number is" + i);
        }
    }
    
}
