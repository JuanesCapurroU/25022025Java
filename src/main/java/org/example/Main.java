package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int contadorBot = 0;
        int contadorJugador = 0;
        int eleccionJugador= 0;
        int eleccionBot= 0;


            do {

                eleccionJugador = random.nextInt((3-1)+1)+1;
                System.out.println("Elegiste: ");
                if (eleccionJugador==1){
                    System.out.println("Piedra");
                } else if (eleccionJugador==2) {
                    System.out.println("Papel");
                }else {System.out.println("Tijeras");}

                eleccionBot = random.nextInt((3-1)+1)+1;
                System.out.println("El contrincante saco: ");
                if (eleccionBot==1){
                    System.out.println("Piedra\n");
                } else if (eleccionBot==2) {
                    System.out.println("Papel\n");
                }else{ System.out.println("Tijeras\n");}

                if ((eleccionJugador==1 && eleccionBot ==3) || (eleccionJugador== 2 && eleccionBot ==1) || (eleccionJugador==3 && eleccionBot==2)){
                    System.out.println("Ganaste 1 punto");
                    contadorJugador+=1;
                } else if ((eleccionBot==1 && eleccionJugador==3)|| (eleccionBot==2&&eleccionJugador==1)|| (eleccionBot==3&&eleccionJugador==2)) {
                    System.out.println("BOT Gano 1 punto");
                    contadorBot+=1;
                }else {System.out.println("Empate");}

                System.out.println("Puntuacion: \n" +
                        "1. Jugador: "+contadorJugador + "\n" +
                        "2. BOT: " + contadorBot + "\n");


            }while (contadorJugador != 2 && contadorBot != 2);






    }
}
