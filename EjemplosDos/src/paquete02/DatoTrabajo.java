package paquete02;

import java.util.Scanner;

public class DatoTrabajo {

    public static String nombreEmpresa() {
        Scanner entrada = new Scanner(System.in);

        String nombreEmpresa;

        System.out.println("Ingrese el nombre de la empresa:");
        nombreEmpresa = entrada.nextLine();
        return nombreEmpresa;

    }

    public static String direccionEmpresa() {
        Scanner entrada = new Scanner(System.in);

        String direccionEmpresa;

        System.out.println("Ingrese la dirección de la empresa:");
        direccionEmpresa = entrada.nextLine();
        return direccionEmpresa;

    }
}
