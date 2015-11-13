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
        //Tercer forma de crear Threads esta es la neta!!!
        //Usando clases internas anonimas = esta dentro de la clase Thread, es como tener unimplements}
        //Las clases i ternas llevan  un new dentro del constructor
        Thread  t3 = new Thread(new Runnable(){
           @Override
           public void run() {
               System.out.println("Yo soy un thread como clase interna anonima");
           }
        });
        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public void run(){
        System.out.println("Soy el segundo thread");
    }
}
