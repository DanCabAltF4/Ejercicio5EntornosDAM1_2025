package com.mycompany.miniproyectosjava;

import java.util.*;

public class Encuentra_Numero {
	 {
		int randNo, inputNo, userAttempt = 1;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		randNo = rand.nextInt(101);
		System.out.println("Adivina el numero entre 1 y 100\n");
		do {
			inputNo = scan.nextInt();
			if (inputNo > randNo) {
				System.out.println("Mas bajo!!");
			}
			if (inputNo < randNo) {
				System.out.println("Mas alto!!");
			}
			if (inputNo == randNo) {
				System.out.println("Correcto!!");
				System.out.println("Adivinaste en " + userAttempt + "  intentos.");
			}
			userAttempt++;
		} while (inputNo != randNo);
	}
}
