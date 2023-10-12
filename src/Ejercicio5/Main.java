package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Cuenta_Bancaria cuenta=new Cuenta_Bancaria("Julian","velazquez",684512369, Cuenta_Bancaria.tipo.AHORROS,2);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.aplicarInteresMensual();
    }
}
