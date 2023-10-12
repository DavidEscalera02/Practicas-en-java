package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Planeta planeta1=new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planeta.tipoPlaneta.TERRESTRE,true,1,0.997);
        planeta1.imprimir();
        System.out.println("Densidad del Planeta :"+planeta1.calcularDensidad());
        System.out.println("Es planeta exterior :"+planeta1.planetaExterior());
        System.out.println("-------------------------------");
        Planeta planeta2=new Planeta("Jupiter",1,1.899E27,1.4313E15,139820,750000000, Planeta.tipoPlaneta.TERRESTRE,true,11.862,0.410);
        planeta2.imprimir();
        System.out.println("Densidad del Planeta :"+planeta2.calcularDensidad());
        System.out.println("Es planeta exterior :"+planeta2.planetaExterior());
        System.out.println("----------------------------------");

    }
}
