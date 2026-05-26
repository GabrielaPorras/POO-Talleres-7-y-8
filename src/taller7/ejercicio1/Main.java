package taller7.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan Perez", 1500000);

        System.out.println("Nombre del empleado: " + empleado1.nombre);

        empleado1.nombre = "Juan C. Perez";
        System.out.println("Nombre modificado: " + empleado1.nombre);

        System.out.println("Salario actual: " + empleado1.getSalario());

        empleado1.setSalario(-500000);

        empleado1.setSalario(1800000);
        System.out.println("Nuevo salario: " + empleado1.getSalario());
    }
}
