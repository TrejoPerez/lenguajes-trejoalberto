/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class PrimerThread extends Thread{
    @Override
    public void run(){
        try {
            //Tercer paso creado
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrimerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Soy el primer threadsito");
    }
}
