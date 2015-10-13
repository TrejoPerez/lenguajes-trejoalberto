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
        //Agregar a usuario al arreglo
             usuarios.add(u1);
        Direccion d2= new Direccion();
            d2.setCalle("Calle la viga");
            d2.setColonia("Jalapa");
            d2.setCp(55123);
            d2.setMunicipio("Ecatepec");
        Usuario u2 = new Usuario();
            u2.setDireccion(d2);
            u2.setLogin("ana");
            u2.setPassword("bien");
            usuarios.add(u2);
            
            Direccion d3= new Direccion();
            d3.setCalle("Sur 44");
            d3.setColonia("Vicente villada");
            d3.setCp(55090);
            d3.setMunicipio("Nezahuacoyotl");
        Usuario u3 = new Usuario();
            u3.setDireccion(d3);
            u3.setLogin("pedro");
            u3.setPassword("nose");
            usuarios.add(u3);
        return usuarios;
    }
}
