/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author T-107
 */
public class ContenedorGraficadora extends Canvas{
    //Tiene un metodo paint
    @Override
    public void paint(Graphics g) {
        //super:llamar la version del papa para perfeccionarlo
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.white);
        //g.fillRect(x, y, ancho, alto);
        
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);        
        g.drawLine(0,getHeight()/2,getWidth(), getHeight()/2);
        g.drawLine(getWidth(), getWidth(), getHeight(), getWidth()/2);
    }
    
    
    
}
