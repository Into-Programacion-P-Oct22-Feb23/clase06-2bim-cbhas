package paquete03;

import java.util.Scanner;

public class DatosUbicacion {
    
    public static String obtenerCiudad(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de ciudad:");
        String nombreCiudad = entrada.nextLine();
        
        return nombreCiudad;
    }
}
