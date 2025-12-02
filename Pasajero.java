package ejercicio5;

public class Pasajero {
    //Creo las variables
    private String nombre;
    private int peso;
    private double altura;

    //Creo constructores con diferentes parametros asignables
    public Pasajero(String n){
        nombre = n;
        peso = 78;
        altura = 1.80;
    }

    public Pasajero(String n,int p){
        nombre = n;
        peso = p;
        altura = 1.80;
    }

    public Pasajero(String n, double a){
        nombre = n;
        peso = 73;
        altura = a;
    }

    public Pasajero(String n, int p, double a){
        nombre = n;
        peso = p;
        altura = a;
    }

    //Creo los getters
    public String getNombre(){
        return nombre;
    }
    public int getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }


}
