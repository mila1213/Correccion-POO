package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    // Constructor sin validaciones
    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    // Verifica si cumple los requisitos del subsidio
    public boolean subsidioAprobado() {
        return ingresosMensuales >= 470 && ingresosMensuales <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador;
    }

    // Imprime el resultado
    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("Subsidio aprobado.");
        } else {
            System.out.println("Subsidio rechazado. Motivos:");
            if (ingresosMensuales < 470 || ingresosMensuales > 1200) {
                System.out.println("- Ingresos fuera del rango permitido ($470-$1200).");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Más de un vehículo registrado.");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador.");
            }
        }
    }

    // toString normal
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos mensuales: $" + ingresosMensuales +
                "\nCantidad de vehículos: " + cantidadVehiculos +
                "\nReside en Ecuador: " + (viveEnEcuador ? "Sí" : "No");
    }

    // Reglas del subsidio
    public static void mostrarReglasSubsidio() {
        System.out.println("Requisitos para recibir el subsidio:");
        System.out.println("- Ingresos mensuales entre $470 y $1200");
        System.out.println("- No más de un vehículo registrado");
        System.out.println("- Residir en Ecuador");
    }

    // Consumo mensual
    public double calcularConsumoMensual() {
        double kmMensuales = 800;
        return kmMensuales / 40;
    }

    public double calcularConsumoMensual(double kmExtra) {
        double kmMensuales = 800 + kmExtra;
        return kmMensuales / 40;
    }
}
