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
    private String nombre;
    private String email;
    //Composicion agregacion
    private Direccion direccion;
    /*
        Reglas del encapsulamiento
        Todas las clases model de tipo POJO se deben encapsular
        1.-Todos los atributos deben tener modificador de acceso private
        2.-Por cada atributo debe haber implementado un metodo accesorio (para acceder al atributo) en la clase POJO
            y siempre son public
        3.- Por cada atributo debe haber implementado un metodo mutador (cambia el valor) y siempre son public(setters)
    */

    public Cliente() {
    }

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
