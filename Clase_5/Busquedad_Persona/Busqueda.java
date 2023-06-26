package Clase_5.Busquedad_Persona;

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args){

        String[] personas = {"Lucas Moy", "Luis Gomez", "Tatiana Gomez", "Doris Durango"};

        System.out.println("Ingrese su Busqueda:");
        Scanner entrada = new Scanner(System.in);
        String busqueda = entrada.nextLine();

        for (String persona : personas){
            if (persona.toLowerCase().contains(busqueda.toLowerCase())){
                System.out.println("La persona es: " + persona);
            }

        }

    }

}
