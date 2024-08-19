package ej4_8_metodosabstractos;

public class Velocista extends Ciclista {
    private double potenciaPromedio; //en vatios
    private double velocidadPromedio; //en km/h
    
    protected Velocista(int id, String nom, double potencia, double velocidad){
        super(id,nom);
        potenciaPromedio = potencia;
        velocidadPromedio = velocidad;
    }
    
    protected double getPotenciaPromedio(){
        return potenciaPromedio;
    }
    
    protected double getVelocidadPromedio(){
        return velocidadPromedio;
    }
    
    protected void setPotenciaPromedio(double potencia){
        potenciaPromedio = potencia;
    }
    
    protected void setVelocidadPromedio(double velocidad){
        velocidadPromedio = velocidad;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio en sprint, en vatios: " + potenciaPromedio);
        System.out.println("Velocidad promedio en sprint, en km/h: " + velocidadPromedio);
    }
    
    protected String imprimirTipo(){
        return "Es un velocista";
    }
    
}