package Ejercicio1;

public class Persona {
    private String nombre;
    private String apellido;
    private String numerodeDocumento;
    private int anacimiento;
    private String nacionalidad;
    private char genero;

    public Persona(String nombre, String apellido, String numerodeDocumento, int anacimiento, String nacionalidad, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerodeDocumento = numerodeDocumento;
        this.anacimiento = anacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println("Nombre :"+nombre);
        System.out.println("Apellido :"+apellido);
        System.out.println("C.I  :"+numerodeDocumento);
        System.out.println("Año de Nacimiento :"+anacimiento);
        System.out.println("Nacionalidad  :"+nacionalidad);
        System.out.println("Genero :"+genero);

    }
}
