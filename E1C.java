package Ejercicios;

public class E1C {

	public static void main(String[] args) {
		int numeroInicio = 5;
		int numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			int esPar = numeroInicio%2;
			if(esPar == 0) {
				System.out.print("Se muestra el numero par: ");
				System.out.println(numeroInicio);
			}else {
				System.out.print("Se muestra el numero impar: ");
				System.out.println(numeroInicio);
			}
			numeroInicio++;
			
		}
	}

}
