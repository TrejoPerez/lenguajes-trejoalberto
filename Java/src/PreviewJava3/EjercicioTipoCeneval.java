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
public class EjercicioTipoCeneval{
        public static void main(String[] args) {
            Thread t1 = new Thread(new Runnable(){
                ventana1 v1 = new ventana1();
                ventana2 v2 = new ventana2();
                ventana3 v3 = new ventana3();
                    
                
                @Override
                public void run(){
                    int i = 30;
                    while(i<=30){
                         if(i>=21 && i <=30){
                             v3.setVisible(true);
                            ventana3.etiqueta1.setText(""+i);
                        }if(i==20){
                            v3.dispose();
                            ventana2.etiqueta2.setText(""+i);
                            v2.setVisible(true);
                        }
                         if(i>10 && i <20){
                            ventana2.etiqueta2.setText(""+i);
                        }if(i==10){
                            v2.dispose();
                            ventana1.etiqueta1.setText(""+i);
                            v1.setVisible(true);
                        }
                         if(i>=0 && i <10){
                            ventana1.etiqueta1.setText(""+i);
                        }
                        i--; 
                        try{
                           Thread.sleep(1000);
                        }catch(InterruptedException ex){
                            System.out.println("El error fue "+ ex);
                        };
                        
                    }
                    
                }
            });
            t1.start();
                
     
    }
        
    
        
    
   
}