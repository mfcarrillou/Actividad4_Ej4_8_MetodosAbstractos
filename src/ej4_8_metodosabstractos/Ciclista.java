package ej4_8_metodosabstractos;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private double tiempoAcumulado = 0; //en minutos
    
    protected abstract String imprimirTipo();
    
    protected Ciclista(int id, String nom){
        identificador = id;
        nombre = nom;
    }
    
    protected int getIdentificador(){
        return identificador;
    }
    
    protected String getNombre(){
        return nombre;
    }
    
    protected double getTiempoAcumulado(){
        return tiempoAcumulado;
    }
    
    protected void setIdentificador(int id){
        identificador = id;
    }
    
    protected void setNombre(String nom){
        nombre = nom;
    }
    
    protected void setTiempoAcumulado(double tiempo){
        tiempoAcumulado = tiempo;
    }
    
    protected void imprimir(){
        System.out.println("\nIdentificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado de carrera, en minutos: " + tiempoAcumulado);
    }
    
}