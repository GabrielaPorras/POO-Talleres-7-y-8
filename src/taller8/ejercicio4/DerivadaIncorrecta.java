package taller8.ejercicio4;

// public class DerivadaIncorrecta extends Base, OtraClase { }
// Arriba: Java no permite herencia multiple

public class DerivadaIncorrecta extends Base {

    public void intentarAcceder() {
        // System.out.println(secreto);
        // Arriba: Esto daria error de compilacion porque 'secreto' es private en la clase Base
    }
}