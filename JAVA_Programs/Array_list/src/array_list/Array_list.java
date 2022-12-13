/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_list;
import java.util.*;
/**
 *
 * @author HP
 */
public class Array_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> gavas_array=new HashSet<Integer>();
        gavas_array.add(1);
        gavas_array.add(2);     
        Iterator itr=gavas_array.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
}  

    }
    
}
