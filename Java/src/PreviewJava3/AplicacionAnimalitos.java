/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreviewJava3;

/**
 *
 * @author T-107
 */
public class AplicacionAnimalitos {
    public static void main(String[] args) {
        ComportaminetoRuido r = new Vaca();
        System.out.println(botonSonido(r));
        //Aquoi el niño seleccionara de un listado un animalito
        //por ejemplo es raton
        
    }
    public static String botonSonido(ComportaminetoRuido r){
        return r.hacerRuido();
    }
}
