package ejercicio6;

public class Empleado {

    //Creo las variables
    private static int numeroEmpleado;
    private int contador;

    //Creo el CONSTRUCTOR
    public Empleado(){
        numeroEmpleado++;
        contador=numeroEmpleado;
    }

    //Creo los GETTERS
    public int getContador(){
        return contador;
    }
}
