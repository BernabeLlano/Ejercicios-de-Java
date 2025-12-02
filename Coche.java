package ejercicio4parte2;

public class Coche {
    //Creo las caracteristicas
    private String marca;
    private double precio;

    //Creo el constructor
    public Coche(){
        marca = "";
        precio = 0;
    }

    //Creo los GETTERS
    public String getMarca(){
        return marca;
    }
    public double getPrecio(){
        return precio;
    }

    //Creo los SETTERS
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }

    //Creo los métodos que me pide el ejercicio
    public double CalcularPrecioIva(){
        return ((precio*0.21)+precio);
    }

    public int compararPrecioCohe(Coche c){
        int valor = 0;
        if (this.precio == c.getPrecio()){
            valor = 0;
        } if (this.precio > c.getPrecio()){
            valor = 1;
        } if (this.precio < c.getPrecio()){
            valor = -1;
        }
        return valor;
    }

    public static String empezar_conducir(String empezar){
        empezar = "1. Arrancar coche\n2. Meter marcha\n3.Acelerar coche";
        return empezar;
    }

    //FORMA PARA MOSTRAR CARACTERISTICAS DESDE CLASE
    /*
    * public String toString(){
    * return "Marca: "+marca+" | Precio: "+precio"
    * }
    * */


}
