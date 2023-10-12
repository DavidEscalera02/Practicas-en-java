package Ejercicio6;

public class Cuenta_Bancaria2 {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    Cuenta_Bancaria2.tipo tipoCuenta;
    float saldo = 0;
    double TasaInteresMensual;
    //Constructtores

    public Cuenta_Bancaria2 (String nombresTitular, String apellidosTitular, int numeroCuenta, Cuenta_Bancaria2.tipo tipoCuenta, double tasaInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo=0;
        this.TasaInteresMensual=tasaInteresMensual;
    }
    public void imprimi() {
        System.out.println("Nombres del titular: " + nombresTitular);
        System.out.println("Apellidos del titular: " + apellidosTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }
    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }
    boolean consigna(int valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha depositado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retira(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }
    public void aplicar_InteresMensual(){
        saldo += saldo * (TasaInteresMensual / 100.0);
        System.out.println("Se ha aplicado el interés mensual el Nuevo saldo es: $" + saldo);
    }
    void compararCuentas(Cuenta_Bancaria2 cuenta) {
        if (saldo >= cuenta.saldo) {
            System.out.println("El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parámetro");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parámetro");
        }
    }
}
