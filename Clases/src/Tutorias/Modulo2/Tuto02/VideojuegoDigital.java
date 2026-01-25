package Tuto02;

public class VideojuegoDigital extends Videojuego implements Reproducible, Descargable {

    private boolean descargado;
    private boolean enReproduccion;

    public VideojuegoDigital(String nombre, int id, double precioBase,
            String plataforma, String genero, double tamañoGigas) {
        super(nombre, id, precioBase, plataforma, genero, tamañoGigas);
        this.descargado = false;
        this.enReproduccion = false;
    }

    public boolean estaDescargado() {
        return descargado;
    }

    @Override
    public void reproducir() {
        if (!descargado) {
            System.out.println("Error: " + getNombre() + " no esta descargado.");
            System.out.println("   Por favor, descarga el juego primero.");
            return;
        }

        if (enReproduccion) {
            System.out.println(getNombre() + " ya esta en ejecucion.");
            return;
        }

        enReproduccion = true;
        System.out.println("Iniciando " + getNombre() + "...");
        System.out.println("   Juego en ejecucion! Disfruta tu partida.");
    }

    @Override
    public void pausar() {
        if (!enReproduccion) {
            System.out.println(getNombre() + " no esta en ejecucion.");
            return;
        }

        enReproduccion = false;
        System.out.println(getNombre() + " pausado.");
        System.out.println("   Juego en espera...");
    }

    @Override
    public void descargar() {
        if (descargado) {
            System.out.println(getNombre() + " ya esta descargado.");
            return;
        }

        System.out.println("Iniciando descarga de " + getNombre() + "...");
        System.out.printf("   Tamano: %.1f GB%n", getTamañoGigas());

        double tamanoMb = getTamañoGigas() * 8000;
        double tiempoSegundos = tamanoMb / VELOCIDAD_DESCARGA_MBPS;
        double tiempoMinutos = tiempoSegundos / 60;

        System.out.printf("   Velocidad: %.1f Mbps%n", VELOCIDAD_DESCARGA_MBPS);
        System.out.printf("   Tiempo estimado: %.1f minutos%n", tiempoMinutos);

        descargado = true;
        System.out.println("Descarga completada!");
    }

    @Override
    public boolean verificarEspacio(double espacioDisponibleGB) {
        boolean hayEspacio = espacioDisponibleGB >= getTamañoGigas();

        if (hayEspacio) {
            System.out.printf("Espacio suficiente. Disponible: %.1f GB, Requerido: %.1f GB%n",
                    espacioDisponibleGB, getTamañoGigas());
        } else {
            System.out.printf("Espacio insuficiente. Disponible: %.1f GB, Requerido: %.1f GB%n",
                    espacioDisponibleGB, getTamañoGigas());
            System.out.printf("   Necesitas liberar: %.1f GB%n", getTamañoGigas() - espacioDisponibleGB);
        }

        return hayEspacio;
    }
}
