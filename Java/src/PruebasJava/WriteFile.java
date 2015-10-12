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
            
            while(lep!=null){
                lep=buffer.readLine();
                if(lep==null){
                    System.out.println(lep);
                    System.out.println("if1");
                       break;
                }   
                
            }
            FileWriter fwriter= new FileWriter(f);
            BufferedWriter bwriter = new BufferedWriter(fwriter);
            PrintWriter pwriter = new PrintWriter(bwriter);
            while(cuenta !=null){
                cuenta = buffer.readLine();
                if(cuenta==null){
                    System.out.println("Entraste");
                    pwriter.write(cuenta+"ased");
                    break;
                }
            }
            
            bwriter.close();
            pwriter.close();
            System.out.println(buffer.readLine());
           
            //lee = buffer.readLine();
            
            
            //Escribimos
            
            
            
            
            
            
        }catch(Exception e)   {
            
        }
    }
   
    
}
