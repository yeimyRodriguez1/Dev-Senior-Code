package Clases.src.Modulo02.Clase02.ReproductorSpotify;

public class Cancion extends ContenidoSpotify {

    public Cancion(String nombre) {
        super(nombre);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la cancion: " + getnombre());
    }
}
