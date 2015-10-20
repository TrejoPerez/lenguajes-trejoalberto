/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.io.*;
/**
 *
 * @author T-107
 */
public class ProbarSerializacion {
    public static void main(String[] args) {
        Direccion d1 = new Direccion();
                  d1.setCalle("Calle 13");
                  d1.setColonia("Colonia");
                  d1.setCp(55130);
                  d1.setMunicipio("Ecatepunk");
        Usuario u = new Usuario();
                u.setDireccion(d1);
                u.setLogin("Campitos");
                u.setPassword("Yo-Homero");
            //Ahora fijense bien como usamos la clase persistencia
                PersistenciaUsuarios2 p2 = new PersistenciaUsuarios2();
                try{
                    p2.guardar(u);
                    System.out.println("Ese usuario se guardo con exito");                   
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }                  
    }
}
