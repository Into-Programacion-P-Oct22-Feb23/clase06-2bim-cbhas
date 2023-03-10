package ejemplos;

import java.security.SecureRandom;

public class Ejemplo02 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int valorA = obtenerNumero(); // 3
        int valorB = obtenerNumero(); // 2
        int suma = obtnerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
    
    public static int obtenerNumero() {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(5);
        return valorAleatorio;
    }
    
    public static int obtnerSuma(int a, int b){
        return a + b;
    }
    
}
