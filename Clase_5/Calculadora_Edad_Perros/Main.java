package Clase_5.Calculadora_Edad_Perros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la Edad de su Perro: ");

        Integer edad = entrada.nextInt();

        edad = edad * 7;

        System.out.println("La Edad de su Perro en Años es :" + edad);
    }
}
