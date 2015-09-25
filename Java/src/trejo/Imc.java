package trejo;

public class Imc {
    float peso;
    float altura;
    float resultado;
    
    public Imc(float pe,float al) {
        peso=pe;
        altura=al;
    }
   
    // Regla numero uno de consultores 
    //Una clase puede tener cualquier cantdad de constructores simepre y cuando
    //no se tengan duplicados
    
    
   
    public Imc(float f){
    /*Este codigo no tiene nada que ver con los constructores 
        byte b=12;
        short s=2;
        int i=2;
        long l=2;
     //Reasignamos
        b=(byte)i;
        l=i;
        s=(short)l;
        s=b;
        l=s;
        s=(short)l;
        s=(short)i;
        l=b;
      */                  
        
    }
    public String calcular() {
        String valor="";
        float resultadoImc=peso/(altura*altura);
        if(resultadoImc<20){
            valor ="Eres anorexico, te moriras, tu peso es: "+resultadoImc;
        }
        if(resultadoImc>=20 && resultadoImc<=25){
            valor="Estas bien sano, tu peso es: "+resultadoImc;
            
        }
        if(resultadoImc>=25 && resultadoImc<=30){
            valor = "Te pasate de tamales, tu peso es: "+resultadoImc;
            
        }
        if(resultadoImc>=30 && resultadoImc<=35){
            valor ="eres un tinaco con patas, tu peso es: "+resultadoImc;
            
        }
        
        return valor;
    }
    
    
}
