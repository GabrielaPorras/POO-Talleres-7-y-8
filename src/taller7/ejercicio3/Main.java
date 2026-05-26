package taller7.ejercicio3;

public class Main {
    public static void main(String[] args) {

        double numero1 = 20.0;
        double numero2 = 4.0;

        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma: " + Utilidades.sumar(numero1, numero2));
        System.out.println("Resta: " + Utilidades.restar(numero1, numero2));
        System.out.println("Multiplicacion: " + Utilidades.multiplicar(numero1, numero2));
        System.out.println("Division: " + Utilidades.dividir(numero1, numero2));

        System.out.println("\nProbando validacion de division:");
        Utilidades.dividir(15.0, 0);
    }
}
