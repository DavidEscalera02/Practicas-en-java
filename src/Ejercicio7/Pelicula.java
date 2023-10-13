package Ejercicio7;

public class Pelicula {
    // atributos
    private String nombre;
    private String Director;
    enum tipo{ACCION,COMEDIA,DRAMA,SUSPENSO};
    tipo Genero;
    enum  tipo2 {ACCION,COMEDIA,DRAMA,SUSPENSO}
    tipo Genero2;
    enum tipo3{ACCION,COMEDIA,DRAMA,SUSPENSO}
    tipo Genero3;
    private int duracion;
    private int ano;
    private double calificacion;
    //constructores

    public Pelicula(String nombre, String director, tipo genero, tipo genero2, tipo genero3, int duracion, int ano, double calificacion) {
        this.nombre = nombre;
        Director = director;
        Genero = genero;
        this.Genero2 = genero2;
        Genero3 = genero3;
        this.duracion = duracion;
        this.ano = ano;
        this.calificacion = calificacion;
    }


    // metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public tipo getGenero() {
        return Genero;
    }

    public void setGenero(tipo genero) {
        Genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimir(){
        System.out.println("Nombre De La Pelicula: "+nombre);
        System.out.println("Director De La Pelicula: "+Director);
        System.out.println("Genero De La Pelicula: "+Genero);
        System.out.println("Duracion  De La Pelicula: "+duracion);
        System.out.println("Año Que Salio La Pelicula: "+ano);
        System.out.println("Calificacion De La Pelicula: "+calificacion);
    }
    public boolean esPeliculaEpica(){
        if (duracion>=180){
            return true;
        }else {
            return false;
        }
    }
    private String calcularValoracion(){
        if (calificacion>=0 && calificacion<=2){
            return "*";
        } else if (calificacion>=2 && calificacion>=5) {
            return "**";
        } else if (calificacion>=5 && calificacion>=7){
            return "***";
        } else if (calificacion>=7 && calificacion>=8) {
            return "****";
        } else if (calificacion>=8 && calificacion>=10) {
            return "******";
        }else {
            return "Asigne una valoracion Valida";
        }
    }
    public boolean esSimilar(Pelicula pelicula){
        if (pelicula.Genero== Genero&&pelicula.calcularValoracion()==calcularValoracion()){
            return true;
        }else {
            return false;
        }
    }
    public void imprimirCartel() {
        System.out.println("-------- " + nombre + " ----------");
        System.out.println(calcularValoracion());
        System.out.println(ano);
        System.out.println(Genero+"-"+Genero2+"-"+Genero3);
        System.out.println(Director);

    }

}

