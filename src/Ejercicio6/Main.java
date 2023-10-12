package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        Cuenta_Bancaria2 cuenta = new Cuenta_Bancaria2("Julian", "velazquez", 684512369, Cuenta_Bancaria2.tipo.AHORROS, 2);
        cuenta.imprimi();
        cuenta.consigna(200000);
        cuenta.consigna(300000);
        cuenta.retira(400000);
        cuenta.aplicar_InteresMensual();


    }

}
