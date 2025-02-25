package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double saldo = 50000.0;
        Double añadir;
        Double restar;

        int opcion = 0;

        do {
            System.out.println("MENU\n" +
                    "1. Consultar Saldo\n" +
                    "2. Ingresar Dinero\n" +
                    "3. Retirar Dinero\n" +
                    "4. Salir");
            opcion =  input.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Su saldo es: " + saldo);
                case 2 -> {
                    System.out.println("Ingrese cuanto dinero quiere añadir a su cuenta: ");
                    añadir = input.nextDouble();
                    saldo= saldo+añadir;
                }
                case 3 -> {
                    System.out.println("Ingrese cuanto dinero quiere RETIRAR de su cuenta recuerde que su saldo es: "+saldo);
                    restar = input.nextDouble();
                    if (restar>saldo){
                        System.out.println("No puedes retirar "+ restar + "teniendo: " + saldo);
                    }else {
                        saldo = saldo - restar;
                    }

                }
                case 4 -> {
                    break;
                }
            }
        }while(opcion!=4);

    }
}