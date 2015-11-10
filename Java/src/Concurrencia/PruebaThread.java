/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

/**
 *
 * @author T-107
 */
public class PruebaThread implements Runnable {
    public static void main(String[] args) {
       //Primer paso creado
       PrimerThread t1 = new PrimerThread();
       //2do paso iniciado
        PruebaThread r=new PruebaThread();
        Runnable r2=new PruebaThread();
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
    @Override
    public void run(){
        System.out.println("Soy el segundo thread");
    }
}
