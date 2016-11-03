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
  
  do {
		System.out.print("Introduce el número");
		String line = scanner.nextLine();
		numero = Integer.parseInt(line);
		
			if (numero< numeroAleatorio) {
				System.out.println("El numero a adivinar es mayor");
			}
			else if(numero > numeroAleatorio){
				System.out.println("El numero a adivinar es menor");
			}				
			
 } while (numero !=numeroAleatorio);
  	System.out.println("Has acertado :D" );
	}
}


