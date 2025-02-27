package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double saldo;
        int opcionMenu=0;
        Double pGalletas= 2200.0;
        Double pPapas = 3200.0;
        Double pGaseosas= 3000.0;
        Double pDulces = 300.0;
        Double pMani = 1500.0;
        Double pJugos = 2800.0;
        int contadorJugos=0,contadorGalleta=0, contadorPapas=0, contadorGaseosa=0,contadorDulces=0,contadorMani=0;
        Scanner input = new Scanner(System.in);
        System.out.println("------------MAQUINA SNACKS-----------");
        System.out.println("Ingrese la su Saldo: ");
        saldo = input.nextDouble();

        do {
            System.out.println("Productos Disponibles, seleccion el numero para añadir a la compra: \n" +
                    "1. Galletas $2200\n" +
                    "2. Paquete de Papas $3200\n" +
                    "3. Gaseosa $3000\n" +
                    "4. Dulces $300\n" +
                    "5. Paquete de Mani $1500\n" +
                    "6. Jugo $2800\n" +
                    "7. Finalizar pedido");
            opcionMenu = input.nextInt();
            switch (opcionMenu){
                case 1-> {
                    if (saldo>pGalletas){
                        System.out.println("Galletas Añadidas a la compra..");
                        saldo = saldo-pGalletas;
                        contadorGalleta+=1;
                    }else System.out.println("No te alcanza tu saldo es: " + saldo);
                }
                case 2->{
                    if (saldo>pPapas){
                        System.out.println("Papas añadidas a la compra..");
                        saldo = saldo-pPapas;
                        contadorPapas+=1;
                    }else System.out.println("No te alcanza.. tu saldo es: " + saldo);
                }
                case 3->{
                    if (saldo>pGaseosas){
                        System.out.println("Gaseosa añadida a la compra..");
                        saldo = saldo-pGaseosas;
                        contadorGaseosa+=1;
                    }else System.out.println("No te alcanza tu saldo es: " + saldo);
                }
                case 4 ->{
                    if (saldo>pDulces){
                        System.out.println("Gaseosa añadida a la compra..");
                        saldo=saldo-pDulces;
                        contadorDulces+=1;
                    }else System.out.println("No te alcanza.. tu saldo es: " + saldo);
                }
                case 5->{
                    if (saldo>pMani){
                        System.out.println("Mani añadida a la compra..");
                        saldo=saldo-pMani;
                        contadorMani+=1;
                    }else System.out.println("No te alcanza tu saldo es: " + saldo);
                }
                case 6->{
                    if (saldo>pJugos){
                        System.out.println("Jugo añadido a la compra... ");
                        saldo=saldo-pJugos;
                        contadorJugos+=1;
                    }
                    System.out.println("No te alcanza.. tu saldo es: " + saldo);
                }
                default -> {
                    System.out.println("Finalizando compra.... Usted adquirio: ");
                    if (contadorGalleta>0){
                        System.out.println("Galletas: " + contadorGalleta);
                    }if (contadorMani>0){
                        System.out.println("Mani: " + contadorMani);
                    }if (contadorDulces>0){
                        System.out.println("Dulces: "+ contadorDulces);
                    }if (contadorGaseosa>0){
                        System.out.println("Gaseosa: "+ contadorGaseosa);
                    }if (contadorJugos>0){
                        System.out.println("Jugos: "+ contadorJugos);
                    }if (contadorPapas>0){
                        System.out.println("Paquete de papas "+ contadorPapas);
                    }
                    System.out.println("Se le entrega cambio... \n" +
                            "valor: $"+saldo);


                }

            }
        }while (opcionMenu!=7);
    }
}
