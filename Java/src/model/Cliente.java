package model;


public class Cliente {
    /*
    Aui se va a poner el diagrama,aqui no se necesitan los PK ni los FK
    Relaciones debil,moderada y fuerte
    Debil= Por metodo
    Moderada: Reflejar una relacion PF & FK
    Fuerte: Por herencia
    Moderada = Comsicicn agregacion:relacion entre clases = 
    */
    String nombre;
    String email;
    //Composicion agregacion
    Direccion direccion;
}
