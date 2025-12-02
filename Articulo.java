package ejercicio4;

public class Articulo {
    //Creo clases
    private String nombre;
    private double precio;

    //Creo CONSTRUCTOR
    //Parametrizo de forma formal los atributos y los incializo
    //This asigna al valor de la clase el valor inicial que posteriormente modificaremos
    public Articulo(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    //Creo los GETTERS (Accesores) de Articulo
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }

    //Creo metodo boolean para comparar precios
    public boolean masBaratoQue(Articulo a){
        //Devuelvo la comparacion entre el precio original con el del objeto
        return this.precio < a.getPrecio();
    }

}
