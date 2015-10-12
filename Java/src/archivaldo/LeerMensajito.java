package archivaldo;

import java.io.*;

public class LeerMensajito {
    public static void main(String[] args) throws Exception {
        //ahora vamos a leer esta es otra clase
        //El primer paso es obtener el archivo que se guardo
        File file=new File("D:sucio.xxx");
        //El segundo paso es establecer la direccion de la informacion
        FileInputStream fis=new FileInputStream(file);
        
        ObjectInputStream ois=new ObjectInputStream(fis);
        //creamos el objeto que leera
        //Se le aplico un casting a algodon, ya que se estan usando strings y solo se hace en no primitivos
        // String mensajito="Este es otro archivo"; 
        //Estoy guardando un String de la clase wraper y por eso se le hace el casting
        String algodon=(String) ois.readObject();

        System.out.println(algodon);
        
    }
}
