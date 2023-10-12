package Ejercicio2;

public class Planeta {
    //Atributos
    String nombre=null;
    int cantidad=0;
    double masa=0;
    double vol=0;
    int diametro=0;
    int distancia=0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    tipoPlaneta tipo;
    boolean observable=false;
    double periodoOrbital;
    double periodoRotacion;

    // constructor


    public Planeta(String nombre, int cantidad, double masa, double vol, int diametro, int distancia, tipoPlaneta tipo, boolean observable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.masa = masa;
        this.vol = vol;
        this.diametro = diametro;
        this.distancia = distancia;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimir(){
        System.out.println("Nombre del planeta :" + nombre);
        System.out.println("Cantidad de satélites :" + cantidad);
        System.out.println("Masa del planeta :" + masa);
        System.out.println("Volumen del planeta :"+ vol);
        System.out.println("Diámetro del planeta :"+ diametro);
        System.out.println("Distancia al sol :"+ distancia);
        System.out.println("Tipo de planeta :" + tipo);
        System.out.println("Es observable :" + observable);
        System.out.println("El periodo Orbital :"+periodoOrbital);
        System.out.println("El periodo Rotacion :"+periodoRotacion);
    }
    double calcularDensidad(){
        return masa/vol;
    }
    boolean planetaExterior() {
        float limite = (float) (149597870 * 3.4);
        if (distancia > limite){
            return true;
        }else {
            return false;
        }
    }
}
