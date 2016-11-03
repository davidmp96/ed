package org.institutoserpis.ed;

import java.util.Scanner;
import java.util.Random;
import java.io.InputStream;

public class Adivina {

	public static void main(String[] args) {

		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		int numero;
		System.out.println("Tengo escondido un número entre 1 y 1000. Adivina...");
		System.out.println("numeroAleatorio=" + numeroAleatorio);
		Scanner scanner = new Scanner (System.in);
		int contadorIntentos = 0;
		
		  do {
			  	contadorIntentos++;
				System.out.printf("Introduce el número (intento nº %d): ", contadorIntentos);
				String line = scanner.nextLine();
				numero = Integer.parseInt(line);
				
				if (numero< numeroAleatorio) {
					System.out.println("El numero a adivinar es mayor");
				}
				else if(numero > numeroAleatorio){
					System.out.println("El numero a adivinar es menor");
				}				
					
		 } while (numero !=numeroAleatorio);
		  	System.out.printf("Muy bien. Has acertado!!!! (en el intento nº %d).\n", contadorIntentos );
	}
}
	

