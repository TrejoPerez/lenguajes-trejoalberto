/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas{
    //Tiene un metodo paint
    public static float apertura=0.01f;
    @Override
    public void paint(Graphics g) {
        //super:llamar la version del papa para perfeccionarlo
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.white);
        //g.fillRect(x, y, ancho, alto);
        
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);        
        //Eje x
        g.drawLine(0,getHeight()/2,getWidth(), getHeight()/2);
        //Eje y
        g.drawLine(getWidth()/2,getHeight(),getWidth()/2,0);
        //Traslada el punto de origen
        
        g.translate(getWidth()/2, getHeight()/2);
        g.drawString("Origen de coordenadas", 0, 0);
       /*
        Thread t1 = new Thread(new Runnable(){
           //Ax^2 + bx + cy +d =0
            float x0=-100;
            float x1=-99;
            float y0;
            float y1;
            @Override
            public void run() {
                while(true){
                    //Graficar el seno
                    for(int i=0;i<=200;i++){
                        //Factor de apertura

                        y0= -apertura*x0*x0+10;
                        y1= -apertura*x1*x1+10;
                        g.drawLine((int)x0, (int)y0, (int) x1, (int) y1);
                        x0++;
                        x1++;
                    }
                    
                try{
                     Thread.sleep(300);
                     System.out.println("La idea es esa");
                 }catch(InterruptedException ex){
                     Logger.getLogger(ContenedorGraficadora.class.getName()).log(Level.SEVERE,null,ex);
                 }
                    
                }
                
            }
           
       });
        
        t1.start();
        */
               
        double Xseno=-2*Math.PI-1;
        double Xseno1 =-2*Math.PI;
        double Yseno;
        double Yseno1;
        g.translate(getWidth()/2, getHeight()/2);
        for(int i=0;i<=200;i++){
            Yseno=Math.sin(Xseno);
            Yseno1=Math.sin(Xseno1);
            g.drawLine((int)Xseno, (int)Yseno, (int) Xseno1, (int) Yseno1);
            Xseno++;
            Xseno1++;
        }
        
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        System.out.println("Haz hecho click sobre la grafica");
        System.err.println("Posicion es ("+x+" "+y+")");
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    private Runnable Runnable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
