package org.institutoserpis.ed;

import java.util.Scanner;

public class CalculaTuMedia {
	
	public static void main (String args[]) {
		
		    float nota1 = 0;
		    float nota2 = 0;
		    float nota3 = 0;
		    int notafinal = 0;
		    Scanner tecla = new Scanner(System.in);
		  		    
		System.out.println("PROGRAMA ---CALCULA TU MEDIA EN ENTORNOS DE DESARROLLO---");    
		System.out.println("Introduce tu nota de la 1ª Ev.");
		nota1 = tecla.nextFloat();
		
		System.out.println("Introduce tu nota de la 2ª Ev.");
		nota2 = tecla.nextFloat();
		
		System.out.println("Introduce tu nota de la 3ª Ev.");
		nota3 = tecla.nextFloat();
		
		System.out.println( "Tu nota media del curso es: "+((nota1 + nota2 + nota3)/3));
		
		notafinal = Math.round((nota1 + nota2 + nota3)/3);	
		System.out.println( "Tu nota final del curso es: "+ notafinal);
								  
			if (notafinal <= 3)
				System.out.println("Tu calificación es MUY DEFICIENTE");
		    else if (notafinal <5)
		        System.out.println("Tu calificación es INSUFICIENTE");
		    else if (notafinal <6)
		        System.out.println("Tu calificación es SUFICIENTE");
		    else if (notafinal <7)
		        System.out.println("Tu calificación es BIEN");
		    else if (notafinal <9)
		        System.out.println("Tu calificación es NOTABLE");
		    else if (notafinal <=10)
		        System.out.println("Tu calificación es SOBRESALIENTE"); 	
	} 
}


