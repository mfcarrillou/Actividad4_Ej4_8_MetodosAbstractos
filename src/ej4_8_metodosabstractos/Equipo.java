package ej4_8_metodosabstractos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private static double totalTiempo; //en minutos
    private String pais;
    private List<Ciclista> equipo;
    
    protected Equipo(String nom, String pais_){
        nombre = nom;
        pais = pais_;
        equipo = new ArrayList<>();
    }
    
    protected String getNombre(){
        return nombre;
    }
    
    protected String getPais(){
        return pais;
    }
    
    protected void setNombre(String nom){
        nombre = nom;
    }
    
    protected void setPais(String pais_){
        pais = pais_;
    }
    
    protected void imprimir(){
        System.out.println("\nNombre del equipo: " + nombre);
        System.out.println("País del equipo: " + pais);
        System.out.println("Tiempo total del equipo, en minutos: " + totalTiempo);
    }
    
    protected void añadirCiclista(Ciclista ciclista){
        equipo.add(ciclista);
    }
    
    protected void calcularTotalTiempo(){
        for (Ciclista ciclista : equipo) {
            double tiempoCiclista = ciclista.getTiempoAcumulado();
            totalTiempo = totalTiempo + tiempoCiclista;
        }
    }
    
    protected void listarEquipo(){
        System.out.println("Ciclistas del equipo: ");
        for (Ciclista ciclista : equipo) {
            System.out.println("\t" + ciclista.getNombre());
        }
    }
    
    protected void imprimirDatosCiclista(){
        Scanner entrada = new Scanner(System.in);
        int id = entrada.nextInt();
        boolean encontrado = false;
        for (Ciclista ciclista: equipo) {
            int identificador = ciclista.getIdentificador();
            if (identificador == id){
                ciclista.imprimir();
                System.out.println(ciclista.imprimirTipo());
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("No existe un ciclista con el identificador ingresado.");
        }   
    }
    
}