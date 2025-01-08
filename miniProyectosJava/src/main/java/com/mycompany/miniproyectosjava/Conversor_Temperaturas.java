package com.mycompany.miniproyectosjava;

import java.util.Scanner;
public class Conversor_Temperaturas {
	public static void conversorTemp() {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al Conversor de Temperaturas\n");
	System.out.print("Introduce el valor que quieres convertir: ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para convertir Celsius a Fahrenheit.... ");
	System.out.println("  Introduce 2 para convertir Fahrenheit a Celsius.... ");
	System.out.print("\nIntroduce el valor aqui...");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("La conversion es de.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("La conversion es de.. "+value3+"�C");
		}
	System.out.println("\n\t¡¡Gracias!!..");
	}
}
