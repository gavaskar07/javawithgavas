/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multi_threading;

/**
 *
 * @author HP
 */
public class Multi_threading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        multthred_class gavas_thread=new multthred_class();
//        gavas_thread.start();
//        multthred_class gavas_thread_1=new multthred_class();
//        gavas_thread_1.start();
       Thread gavas_thread=new Thread(new multhread_thread_interface());
       gavas_thread.start();
    }
    
}
