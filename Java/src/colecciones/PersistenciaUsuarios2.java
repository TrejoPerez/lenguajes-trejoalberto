//Esta es la tarea por partes
//Javier es mi dios y no se que haria sin el
//primer se debe de leer para que no sobreescriba, despues de debe guardar
package colecciones;

import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuarios2 {
    
    ArrayList<Usuario> usuarios;
    public PersistenciaUsuarios2(){
        usuarios=new ArrayList<Usuario>();
    }
    
    public void guardar(Usuario u) throws Exception {
    //este es el mas dificil, porque este usa el de abajo
        File f=new File ("D:/usuario.sql");
        if(f.exists())usuarios=buscarTodos();
    }
    public ArrayList<Usuario> buscarTodos()throws Exception{
        //Aqui va toda la tarea (facil)
        return usuarios;
    }
    public Usuario buscarUno (Usuario u)throws Exception{
        File f=new File ("D:/usuario.sql");
        //Aqui va tu otra tarea (papa)
        return u;
    }
}
