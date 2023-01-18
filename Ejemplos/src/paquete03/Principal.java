package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;

public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.multiplicacion(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n"
                + "La multiplicación de %d * %d es igual a: %d\n",
                valorA,
                valorB,
                suma,
                valorA,
                valorB,
                multiplicacion);
    }
}
