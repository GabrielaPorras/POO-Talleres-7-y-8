package taller7.ejercicio2;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria miCuenta = new CuentaBancaria("123456789", 500000, "Ahorros");

        System.out.println("--- Detalles Iniciales ---");
        miCuenta.mostrarDetalles();

        System.out.println("\nModificando tipo de cuenta (Atributo publico):");
        miCuenta.tipoCuenta = "Corriente";
        System.out.println("Nuevo tipo: " + miCuenta.tipoCuenta);

        System.out.println("\nIntentando cambiar saldo mediante el metodo set:");
        miCuenta.setSaldo(650000);
        System.out.println("Saldo actualizado: $" + miCuenta.getSaldo());

        // La siguiente linea generaria un error de compilacion porque numeroCuenta es private.
        // miCuenta.numeroCuenta = "987654321";

        System.out.println("\nNota: No se pudo acceder directamente a 'numeroCuenta' por ser privada.");
    }
}