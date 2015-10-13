/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-107
 */
import java.util.*;
public class PersistenciaUsuarios {
    //Se puede guardar culaquier tipo de objet, ese array list va a ser generico de la clase usuario
    public ArrayList<Usuario> obtenerUsuario(){
        //Arreglo variable
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        //Empezamos a nllenar el arraylist generico a Usuario
        Direccion d1 =  new Direccion();
            d1.setCalle("Av. Mexico");
            d1.setColonia("Ejidos tulpetlac");
            d1.setCp(55130);
            d1.setMunicipio("Ecatepec");
            //Primero se crean las direcciones para despues crear al usuario
        Usuario u1 = new Usuario();
                u1.setDireccion(d1);
                u1.setLogin("Juan");
                u1.setPassword("algo");
                
        return usuarios;
    }
}
