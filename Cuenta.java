package ejer6;

public class Cuenta {
    private String nombreCuenta;
    private int numeroCuenta;
    private String clave;
    private float saldo;

    public Cuenta (String nombreCuenta, int numeroCuenta, String clave, float saldo){
        this.nombreCuenta=nombreCuenta;
        this.numeroCuenta=numeroCuenta;
        this.clave=clave;
        this.saldo=saldo;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreCuenta='" + nombreCuenta + '\'' +
                ", clave='" + clave + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    //Metodos
    public void ingresarDinero(float cantidad){
        saldo += cantidad;
    }
    public void retirarDinero(float retirar){
        saldo -= retirar;
    }
    public void cambiarClave(String nuevaClave){
        clave = nuevaClave;
    }

    //GETTERS Y SETTERS
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nonbreCuenta) {
        this.nombreCuenta = nonbreCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
