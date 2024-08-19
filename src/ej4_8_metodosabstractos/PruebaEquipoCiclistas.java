package ej4_8_metodosabstractos;

import java.util.Scanner;

public class PruebaEquipoCiclistas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Carrera ciclística");
        System.out.print("\nIngrese el nombre del equipo: ");
        String nombreEq = entrada.nextLine();
        System.out.print("Ingrese el país del equipo: ");
        String paisEq = entrada.nextLine();
        
        Equipo equipoCiclistas = new Equipo(nombreEq,paisEq);
        
        System.out.println("\nVelocista del equipo");
        System.out.print("\tIngrese el identificador del ciclista: ");
        int idVeloc = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tIngrese el nombre del ciclista: ");
        String nomVeloc = entrada.nextLine();
        System.out.print("\tIngrese la potencia promedio del ciclista en sprint, en vatios: ");
        double potVeloc = entrada.nextDouble();
        System.out.print("\tIngrese la velocidad promedio del ciclista en sprint, en km/h: ");
        double vPVeloc = entrada.nextDouble();
        Velocista velocista = new Velocista(idVeloc, nomVeloc,potVeloc,vPVeloc);
        equipoCiclistas.añadirCiclista(velocista);
        System.out.print("\tIngrese el tiempo acumulado del ciclista, en minutos: ");
        double tiempoVeloc = entrada.nextDouble();
        velocista.setTiempoAcumulado(tiempoVeloc);
        
        System.out.println("\nEscalador del equipo");
        System.out.print("\tIngrese el identificador del ciclista: ");
        int idEsc = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tIngrese el nombre del ciclista: ");
        String nomEsc = entrada.nextLine();
        System.out.print("\tIngrese la aceleración promedio del ciclista en subida, en m/s^2: ");
        float acPEsc = entrada.nextFloat();
        System.out.print("\tIngrese el grado de rampa soportada, en grados: ");
        float gREsc = entrada.nextFloat();
        Escalador escalador = new Escalador(idEsc, nomEsc,acPEsc,gREsc);
        equipoCiclistas.añadirCiclista(escalador);
        System.out.print("\tIngrese el tiempo acumulado del ciclista, en minutos: ");
        double tiempoEsc = entrada.nextDouble();
        escalador.setTiempoAcumulado(tiempoEsc);
        
        System.out.println("\nContrarrelojista del equipo");
        System.out.print("\tIngrese el identificador del ciclista: ");
        int idContraR = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tIngrese el nombre del ciclista: ");
        String nomContraR = entrada.nextLine();
        System.out.print("\tIngrese la velocidad máxima del ciclista, en km/h: ");
        float vMaxContraR = entrada.nextFloat();
        Contrarrelojista contrarrelojista = new Contrarrelojista(idContraR, nomContraR,vMaxContraR);
        equipoCiclistas.añadirCiclista(contrarrelojista);
        System.out.print("\tIngrese el tiempo acumulado del ciclista, en minutos: ");
        double tiempoContraR = entrada.nextDouble();
        contrarrelojista.setTiempoAcumulado(tiempoContraR);
        
        equipoCiclistas.calcularTotalTiempo();
        equipoCiclistas.imprimir();
        equipoCiclistas.listarEquipo();  
    }
    
}
