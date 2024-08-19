package ej4_8_metodosabstractos;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima; // en km/h
    
    protected Contrarrelojista (int id, String nom, double velocidadmax){
        super(id,nom);
        velocidadMaxima = velocidadmax;
    }
    
    protected double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    protected void setVelocidadMaxima(double velocidadmax){
        velocidadMaxima = velocidadmax;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Velocidad máxima, en km/h: " + velocidadMaxima);
    }
    
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
    
}
