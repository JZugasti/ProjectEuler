package pagina1;

public class Ejercicio2 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Buscar la suma de Fibonacci de los números menores de 4M que sean pares

        //Comenzmaos inicializando las variables que vamos a ir incrementando para hacer la secuencia y la suma

        double numero1 = 1;
        double numero2 = 2;
        double i;
        double suma = 2; //Comenzamos con suma = 2 porque al empezar con 1 y 2 la serie, la iteración la va a empezar en 3 y va a saltarse el 2

        for (i = 0; i < 4000000; ) {
            i = numero1 + numero2;
            numero1 = numero2;
            numero2 = i;
            if (i % 2 == 0) {

                suma = suma + i;

            }
        }

        System.out.println(suma);

    } //Cierre main

} //Cierre class
