package com.mycompany.miniproyectosjava;

import java.util.Scanner;

public class CalculadoraDePropinas {

    public static void usar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\tBienvenido a la calculadora de propinas!!");
        System.out.println("\nIntroduce el valor total de la cuenta.. :");
        int bill = scan.nextInt();
        System.out.println("Cuanta propinas querrian dejar? ");
        int tip = scan.nextInt();
        System.out.println("Entre cuantas personas se va a repartir la cuenta? ");
        int person = scan.nextInt();
        int total = bill + tip;
        int per_person = total / person;
        System.out.println("Total a pagar : €" + total);
        System.out.println("Total por cabeza : €" + per_person);
    }
}
