package Tutorias.Modulo2.Tuto02;

public interface Descargable {

    double VELOCIDAD_DESCARGA_MBPS = 50.0;

    void descargar();

    boolean verificarEspacio(double espacioDisponibleGB);

}
