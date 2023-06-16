package Clase_5.Adivinar_Numeros;

import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args){

        Integer numeroAleatorio = (int) (Math.random() * 100 + 1);
        Integer intentos = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un Número entre 1 y 100");

        while (true) {
            System.out.println("Intento #" + (intentos +1) + ": ");
            Integer numeroAdivinado = entrada.nextInt();
            intentos++;

            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El Número a Divinar es Mayor");
            } else if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El Número a Divinar es Menor");
            } else {
                System.out.println("Felicitaciones Adivinaste el Número");
                break;
            }
        }
    }
}
