package arreglos;

import sun.security.util.Length;

public class Arreglosuno {
    /*Reglas de arreglos
    1. Los arreglos puedes ser tipos primitivos y referenciadps    
    2. Los referenciados tienen combinaciones de 2 o mas primitivos
    3. Todos los arreglos son tratados como objetos, incluyendo los arreglos primitivos
    */
    public static void main(String[] args) {
        int x=4;
        //Inicializacion explicita              
        int []y={7,-20,15};
        //Inicializacion implicita
        int z[]=new int [4];
        //Arreglo de referenciados
        String mensaje[]={"Hola", "como", "estas?"};
        System.out.println(x);
        System.out.println(z[2]); 
           //Regla para iterar los elementos del arreglo de strings
            for(int i=0;i<mensaje.length;i++){
                System.out.println(mensaje[i]); 
            }//fin del ciclo
            //Ciclo for mejorado:
            //for(tipo de variable -variable-:arreglo)
            for(String valor:mensaje){
                System.out.println(valor);
                if(valor.equals("como"))break;
            }
    }
}
