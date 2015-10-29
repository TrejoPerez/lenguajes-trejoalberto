//Esta es la tarea por partes

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
        File f=new File ("/root/Exploiter/persistencia.ped");
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    
    public ArrayList<Usuario> buscarTodos()throws Exception{
        //Aqui va toda la tarea (facil)
        File file = new File("/root/Exploiter/persistencia.ped");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Se aplica el casting porque se esta regresa un arreglo
        usuarios =  (ArrayList<Usuario>) ois.readObject();
         return usuarios;   
        
        
    }
    public Usuario buscarUno (Usuario u)throws Exception{
        File f=new File ("D:/usuario.sql");
        //Aqui va tu otra tarea (papa)
        return u;
    }
}
