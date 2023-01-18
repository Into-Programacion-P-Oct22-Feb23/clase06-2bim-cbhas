package paquete04;

import java.security.SecureRandom;

public class OperadorUno {
    
    public static int obtenerNumero(int limite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(limite); // 0 - 99
                                                                // 0 - 9
        return valorAleatorio;
    }
    
}
