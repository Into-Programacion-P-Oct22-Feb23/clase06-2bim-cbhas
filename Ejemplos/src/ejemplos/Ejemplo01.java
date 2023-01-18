package ejemplos;

//import java.security.SecureRandom;
import java.security.*;
import java.util.*;

public class Ejemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;
        System.out.println("Ingrese el límite(debe ser positivo):");
        limite = entrada.nextInt();

        if (limite > 0) {
            int valorA = obtenerNumero(limite);
            int valorB = obtenerNumero(limite);
            int suma = obtnerSuma(valorA, valorB);
            System.out.printf("La suma de %d + %d es igual a: %d\n",
                    valorA,
                    valorB,
                    suma);

        } else {
            System.out.println("El número debe ser positivo!");
        }
    }

    public static int obtenerNumero(int limite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(limite);
        return valorAleatorio;
    }

    public static int obtnerSuma(int a, int b) {
        return a + b;
    }

}
