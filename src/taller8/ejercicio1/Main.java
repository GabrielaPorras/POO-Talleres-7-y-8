package taller8.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Vehiculo unVehiculo = new Vehiculo("Toyota", 180.0);
        System.out.println("--- Datos del Vehiculo Base ---");
        unVehiculo.mostrarInformacion();

        Coche unCoche = new Coche("Mazda", 220.0, 4);
        System.out.println("\n--- Datos del Coche ---");
        unCoche.mostrarInformacionCoche();
    }
}
