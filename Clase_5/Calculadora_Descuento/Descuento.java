package Clase_5.Calculadora_Descuento;

import java.util.Scanner;

public class Descuento {

    public static void main(String[] args){

        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite el Precio del Producto");

        double precio = entradas.nextDouble();
        double porcentajeDescuento = entradas.nextDouble();
        double precioFinal;
        double descuento;

        descuento = (precio * porcentajeDescuento / 100);

        precioFinal = precio - descuento;

        System.out.println("El Precio Final es de: " + precioFinal);

    }
}
