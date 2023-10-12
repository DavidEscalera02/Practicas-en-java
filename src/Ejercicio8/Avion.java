package Ejercicio8;

public class Avion {
    //Atributos
    private String Fabricante;
    private int numeroMotores;
    // constructores

    public Avion(String fabricante, int numeroMotores) {
        Fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }
    //metodos o comportamientos


    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }
    public void cambiarFabricante(Avion avion){
        avion.setFabricante("Lockheed");
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    public void imprimirFabricante() {
        System.out.println("El fabricante del avión es: " +Fabricante);
    }
}
