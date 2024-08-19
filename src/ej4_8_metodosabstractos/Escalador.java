package ej4_8_metodosabstractos;

public class Escalador extends Ciclista {
    private float aceleracionPromedio; // en m/s^2
    private float gradoRampa; //en grados
    
    protected Escalador(int id, String nom, float aceleracion, float rampa){
        super(id,nom);
        aceleracionPromedio = aceleracion;
        gradoRampa = rampa;
    }
    
    protected double getAceleracionPromedio(){
        return aceleracionPromedio;
    }
    
    protected double getGradoRampa(){
        return gradoRampa;
    }
    
    protected void setAceleracionPromedio(float aceleracion){
        aceleracionPromedio = aceleracion;
    }
    
    protected void setGradoRampa(float rampa){
        gradoRampa = rampa;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleración promedio en subida, en m/s^2: " + aceleracionPromedio);
        System.out.println("Grado de rampa soportada, en grados: " + gradoRampa);
    }
    
    protected String imprimirTipo(){
        return "Es un escalador";
    }
    
}