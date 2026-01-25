package Tutorias.Modulo2.Tuto02;

public interface Reproducible {
    void reproducir();

    void pausar();

    default void detener() {
        System.out.println("Reproducción detenida.");
    }
}
