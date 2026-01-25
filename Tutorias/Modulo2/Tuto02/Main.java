package Tutorias.Modulo2.Tuto02;

public class Main {

        public static void main(String[] args) {

                System.out.println("===== PRODUCTO GENERICO =====");
                Producto producto = new Producto("Producto Base", 1, 10000);
                producto.mostrarInfo();
                System.out.println();

                System.out.println("===== PELICULA =====");
                Pelicula pelicula = new Pelicula(
                                "Inception",
                                "2",
                                15000,
                                148,
                                "Christopher Nolan",
                                "HD");
                pelicula.mostrarInfo();
                pelicula.verTrailer();
                System.out.println();

                System.out.println("===== PELICULA STREAMING =====");
                PeliculaStreaming peliculaStreaming = new PeliculaStreaming(
                                "Interstellar",
                                "3",
                                18000,
                                169,
                                "Christopher Nolan",
                                "4K");

                peliculaStreaming.mostrarInfo();
                System.out.println();

                peliculaStreaming.reproducir();
                peliculaStreaming.pausar();
                peliculaStreaming.reproducir();
                peliculaStreaming.detener();
                peliculaStreaming.cambiarCalidad("HD");
                System.out.println();

                System.out.println("===== VIDEOJUEGO FISICO =====");
                Videojuego videojuego = new Videojuego(
                                "Zelda Breath of the Wild",
                                4,
                                200000,
                                "Nintendo",
                                "Aventura",
                                14.5);
                videojuego.mostrarInfo();
                videojuego.iniciarJuego();
                System.out.println();

                System.out.println("===== VIDEOJUEGO DIGITAL =====");
                VideojuegoDigital videojuegoDigital = new VideojuegoDigital(
                                "Elden Ring",
                                5,
                                250000,
                                "PlayStation",
                                "RPG",
                                60.0);

                // Intentar jugar sin descargar
                videojuegoDigital.reproducir();
                System.out.println();

                // Verificar espacio
                double espacioDisponible = 80.0;
                videojuegoDigital.verificarEspacio(espacioDisponible);
                System.out.println();

                // Descargar
                videojuegoDigital.descargar();
                System.out.println();

                // Jugar después de descargar
                videojuegoDigital.reproducir();
                videojuegoDigital.pausar();
                videojuegoDigital.detener();
        }
}
