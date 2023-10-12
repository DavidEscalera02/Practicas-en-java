package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion("Airbus",4);
        Avion avion2;
        Avion avion3 = new Avion("Boeing",4);
        avion2=avion1;
        avion1.imprimirFabricante();
        avion2.imprimirFabricante();
        avion1.setFabricante("Douglas");
        avion1.imprimirFabricante();
        avion2.imprimirFabricante();
        avion1.cambiarFabricante(avion2);
        avion2.imprimirFabricante();
    }
}
