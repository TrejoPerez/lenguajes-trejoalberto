/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasJava;
import java.io.*;
/**
 *
 * @author root
 */
public class WriteFile {
    
    public void leerArchivo(){
        try {
            
            File f = new File("/root/Exploiter/textof.txt") ;
            FileReader file= new FileReader(f);
            
            BufferedReader buffer= new BufferedReader(file);
            
            
            String cuenta="";
            String lep="";
            
           
            FileWriter fwriter= new FileWriter(f,true);
            BufferedWriter bwriter = new BufferedWriter(fwriter);
            PrintWriter pwriter = new PrintWriter(bwriter);
            pwriter.write("trejo\n");
            
            bwriter.close();
            pwriter.close();
             while(lep!=null){
                lep=buffer.readLine();
                if(lep==null)
                    break;
                System.out.println(lep);
                
            }
           
            //lee = buffer.readLine();
            
            
            //Escribimos
            
            
            
            
            
            
        }catch(Exception e)   {
            
        }
    }
   
    
}
