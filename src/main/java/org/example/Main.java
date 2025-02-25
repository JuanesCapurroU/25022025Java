package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcion;
        int opcionUnidad;
        int opcionCelsius;
        int opcionFahrenheit;
        int opcionKelvin;
        Double valor;


            do{
                System.out.println("INGRESA (1) SI EL DATO ES CELSIUS, (2) SI ES FAHRENHEIT, (3) SI ES KELVIN O (4) PARA SALIR");
                opcionUnidad = input.nextInt();


                switch (opcionUnidad){
                    case 1-> {
                        //Celsius
                        System.out.println("INGRESE UN VALOR INICIAL PARA LA CONVERSION: ");
                        valor = input.nextDouble();
                        System.out.println("INGRESE A QUE VALOR QUIERE CONVERTIR LOS CELSIUS\n" +
                                "1. Celsius a Fahrenheit\n" +
                                "2. Celsius a Kelvin");
                        opcionCelsius = input.nextInt();
                        if (opcionCelsius==1){
                            valor = ((9*valor)/5)+32;
                            System.out.println("Celsius a Fahrenheit: "+ valor + "F");
                        }else {
                            valor = valor + 273.15;
                            System.out.println("Celsius a Kevin: "+ valor+"K");
                        }

                    }
                    case 2->{
                        //Fahrenheit
                        System.out.println("INGRESE UN VALOR INICIAL PARA LA CONVERSION: ");
                        valor = input.nextDouble();
                        System.out.println("INGRESE A QUE VALOR QUIERE CONVERTIR LOS FAHRENHEIT\n" +
                                "1. Fahrenheit a Celsius\n" +
                                "2. Fahrenheit a Kelvin");
                        opcionFahrenheit = input.nextInt();
                        if (opcionFahrenheit==1){
                            valor = ((valor-32)*5)/9;
                            System.out.println("El resultado es: "+valor+"C");
                        }else {
                            valor = (((valor-32)*5)/9)+273.15;
                            System.out.println("El resultado es: "+valor+"K");
                        }
                    }
                    case 3->{
                        //KELVIN
                        System.out.println("INGRESE UN VALOR INICIAL PARA LA CONVERSION: ");
                        valor = input.nextDouble();
                        System.out.println("INGRESE A QUE VALOR QUIERE CONVERTIR LOS KELVIN\n" +
                                "1. Kelvin a Celsius\n" +
                                "2. Kelvin a Fahrenheit");
                        opcionKelvin = input.nextInt();
                        if (opcionKelvin==1){
                            valor = valor-273.15;
                            System.out.println("El resultado es: "+valor+"C");
                        }else {
                            valor= (((valor-273.15)*9)/5)+32;
                            System.out.println("El resultado es: "+valor+"F");
                        }
                    }
                    default -> { System.out.println("Saliendo..");
                        break;
                    }
                }
            }while(opcionUnidad!=4);
        }


    }
