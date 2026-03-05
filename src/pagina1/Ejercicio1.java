package pagina1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Suma de los números multiplos de 3 y 5 que hay dentro de los primeros 1000 números

		double suma = 0;

		for (int i=3; i<1000;i++) {

			if (i%3 == 0 || i%5 ==0) {

				suma = suma + i;

			}

		}

		System.out.println("El valor de los multiplos de 3 y 5 en los primeros 1000 números es: " + suma);

	} //Cierre main

} //Cierre class
