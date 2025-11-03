package ec.gob.subsidio.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese cantidad de vehículos: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = sc.nextBoolean();

        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, viveEnEcuador);

        SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.println("\nDatos del solicitante:");
        System.out.println(solicitante.toString());

        System.out.println("\nResultado:");
        solicitante.generarResultado();

        double consumoNormal = solicitante.calcularConsumoMensual();
        double consumoExtra = solicitante.calcularConsumoMensual(200);

        System.out.println("\nConsumo mensual normal: " + consumoNormal + " galones");
        System.out.println("Consumo mensual con kilómetros extra: " + consumoExtra + " galones");
    }
}
