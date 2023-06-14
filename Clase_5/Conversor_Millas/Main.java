package Clase_5.Conversor_Millas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la Distancia en Millas: ");

        double kilometers;
        double millas = entrada.nextDouble();

        kilometers = millas * 1.60934;

        System.out.println("La Distancia en Kilometros es de: " + kilometers);

    }
}
