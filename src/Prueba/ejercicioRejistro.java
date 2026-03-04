package Prueba;

public class ejercicioRejistro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Comenzamos declarando la suma y haciendo un for para recorrer hasta el 952.000
		long suma = 0;
		
		for (long i=1; i<=952000; i++) {
			
			if (i%2!=0) {
				
				suma = suma + i*i;
				
			} //Cierre if
			 
		} //Cierre for		
		
		System.out.println(suma);
		
	} //Cierre del main

} //Cierre de clase
