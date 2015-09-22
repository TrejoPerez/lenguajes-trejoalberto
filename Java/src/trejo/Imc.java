package trejo;

public class Imc {
    float peso;
    float altura;
    
    public Imc() {
        peso=55.5f;
        altura=77.7f;
    }
   
    // Regla numero uno de consultores 
    //Una clase puede tener cualquier cantdad de constructores simepre y cuando
    //no se tengan duplicados
    
    
   
    public Imc(float f){
    //Este codigo no tiene nada que ver con los constructores 
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
                        
        
    }
    public float calcular() {
        float resultadoImc=peso/(altura*altura);
        return resultadoImc;
    }
}
