package Clase_5.Calculadora_Propinas;

import java.util.Scanner;

public class Propina {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el Valor de la Cuenta:");
        double valorTotal = entrada.nextDouble();

        System.out.println("Digite el Porcentaje de Propina que desea dejar:");
        double porcentajePropina = entrada.nextDouble();

        double propina;
        double totalCuenta;

        propina = (valorTotal * porcentajePropina) / 100;
        totalCuenta = valorTotal + propina;

        System.out.println("Propina: $" + propina);
        System.out.println("El valor Total de la Cuenta es: $ " + totalCuenta);

    }
}
