package archivaldo;

import java.io.*;
public class InterfazUsuario {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //se va a crear un archivo serializado
        //paso 1 crear un archivo a guardar
        File file=new File("D:\\sucio.xxx");
        //esto crea archivos si no existen y los lee si existen
        //paso 2 indicar si vamos a leer o guardar algo en ese archivo
        FileOutputStream fos=new FileOutputStream(file);
        //paso 3 ponemos algo en el archivaldo
        String mensajito="Este es un mensajito bien pinche basico";
        //Paso4 Ahora si guardamos este mensajito serializado
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(mensajito);
        System.out.println("Se guardo tu mensajito");
    }
}
