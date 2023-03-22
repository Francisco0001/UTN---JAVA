package Ejercicios;

public class E2D {

	public static void main(String[] args) {
		float ingresosMensuales = 489082;
		int vehiculos = 1;
		int antiguedad = 6;
		int inmuebles = 1;
		boolean embarcacion = false;
		boolean aeronave = false;
		boolean activosSocietarios = false;
	
	if((ingresosMensuales >= 489083) || ((vehiculos >= 3) && (antiguedad >= 5)) || (inmuebles >= 3)) {
		System.out.println("Perteneces a los ingresos altos");
	}
	else {
		if((embarcacion == true) || (aeronave == true) || (activosSocietarios == true)) {
			System.out.println("Perteneces a los ingresos altos-");
		}
		else {
			System.out.println("No perteneces a los ingresos altos");
		}
	}
	}
}
