package taller8.ejercicio3;

public class Main {
    public static void main(String[] args) {

        Empleado empleadoBase = new Empleado("Carlos Ruiz", 1200000);
        System.out.println("--- Detalles del Empleado ---");
        empleadoBase.mostrarDetalles();

        Gerente gerenteVentas = new Gerente("Laura Gomez", 3500000, "Ventas");
        System.out.println("\n--- Detalles del Gerente ---");
        gerenteVentas.mostrarDetalles();
    }
}
