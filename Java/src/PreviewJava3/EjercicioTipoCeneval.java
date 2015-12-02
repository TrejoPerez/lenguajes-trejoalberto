/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
        Desarrollar el siguiente programa
        Crear una ventana jFrame con un Jlabe que al ejecutarse aparesca un contador
        que inicie desde 30 y que haga un conteo en retroceso.Al llegar al numero 20, se debe cerrar 
        esa ventana y abrise automaticamente una segunda ventana con otro jLabel que contega el contador 
        desde el 19 hacia atras. Al llegar al 10 debe de cerrarce dicha ventana y debe aparecer una tercera
        jFrame igual que las anteriores y el jLabel debe continuar el conteo hasta llegar al cero y ali debe 
        quedarse dicha ventana con el contador en cero.
        El decremento en todo el conteo es de 1 segundo
    */
package PreviewJava3;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author T-107
 */
public class EjercicioTipoCeneval extends Canvas{
    
    public EjercicioTipoCeneval(){
         public void paint(Graphics g){
        Thread t1 = new Thread(new Runnable(){
          int i =30;
            @Override
            public void run() {
                while(i>=30){
                    System.out.println(""+i);
                    i--;
                try{
                     Thread.sleep(300);
                     
                 }catch(InterruptedException ex){
                     System.out.println("El error es "+ex);
                 }
                    
                }
                
            }
           
       });
        
        t1.start();
        
    }
        
    }
   
}