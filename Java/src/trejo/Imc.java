package trejo;

public class Imc {
    float peso;
    float altura;
    
    public Imc() {
        peso=55.5f;
        altura=77.7f;
    }
    public float calcular() {
        float resultadoImc=peso/(altura*altura);
        return resultadoImc;
    }
}
