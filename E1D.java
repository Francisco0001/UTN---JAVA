package Ejercicios;

public class E1D {
	
	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		
		for(int numero = numeroFin; numero >= numeroInicio; numero--) {
			if(numero%2 == 0) {
				System.out.print("Se muestra el numero par: ");
				System.out.println(numero);
			}
		}
		
	}
}
