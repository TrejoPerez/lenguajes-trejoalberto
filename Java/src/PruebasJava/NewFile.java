//Pruebas para leer y erscribir archivos de texto
package PruebasJava;
import java.io.*;
public class NewFile{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*Escritura
        File f = new File("/root/Exploiter/textof.txt");    
        FileWriter fW = new FileWriter(f);
        BufferedWriter bW = new BufferedWriter(fW);
        PrintWriter pW = new PrintWriter(bW);
        pW.write("Bien ");
        pW.append("vamos");
        pW.close();
        bW.close();
        */
        WriteFile leer = new WriteFile();
        leer.leerArchivo();
    }
    
}
