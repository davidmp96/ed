package org.institutoserpis.ed;

import org.junit.Test;

public class CalculaTuMediaTest {
	
	@Test
	public void TestCalificacion() {
		float nota1 = 7;
		float nota2 = 6;
		float nota3 = 8;
		int notafinal = 0;
		notafinal = Math.round((nota1 + nota2 + nota3)/3);
		System.out.println( "TEST1");
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
	
	@Test
	public void TestRealizacionMedia() {
		float nota1 = 7;
		float nota2 = 6;
		float nota3 = 8;
		System.out.println( "TEST2");
		System.out.println( "Tu nota media del curso es: "+((nota1 + nota2 + nota3)/3));
	}
}
