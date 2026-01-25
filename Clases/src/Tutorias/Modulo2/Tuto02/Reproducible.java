package Tuto02;

public interface Reproducible {
    void reproducir();

    void pausar();

    default void detener() {
        System.out.println("Reproduccion detenida.");
    }
}
