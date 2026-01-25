package Tuto02;

public class PeliculaStreaming extends Pelicula implements Reproducible {

    private boolean enReproduccion;
    private int minutosReproducidos;

    public PeliculaStreaming(String nombre, String id, double precioBase,
                             int duracionMinutos, String director, String calidad) {
        super(nombre, id, precioBase, duracionMinutos, director, calidad);
        this.enReproduccion = false;
        this.minutosReproducidos = 0;
    }

    @Override
    public void reproducir() {
        if (enReproduccion) {
            System.out.println(getNombre() + " ya esta en reproduccion.");
            return;
        }

        enReproduccion = true;
        System.out.println("Reproduciendo: " + getNombre());
        System.out.println("   Director: " + getDirector());
        System.out.println("   Calidad: " + getCalidad());

        if (minutosReproducidos > 0) {
            System.out.printf("   Continuando desde minuto %d (%.1f%% visto)%n",
                    minutosReproducidos, getProgreso());
        } else {
            System.out.println("   Iniciando desde el principio...");
        }
    }

    @Override
    public void pausar() {
        if (!enReproduccion) {
            System.out.println(getNombre() + " no esta en reproduccion.");
            return;
        }

        enReproduccion = false;
        minutosReproducidos += 15;

        if (minutosReproducidos > getDuracionMinutos()) {
            minutosReproducidos = getDuracionMinutos();
        }

        System.out.println(getNombre() + " pausado.");
        System.out.printf("   Minuto actual: %d de %d (%.1f%% completado)%n",
                minutosReproducidos, getDuracionMinutos(), getProgreso());
    }

    public void cambiarCalidad(String nuevaCalidad) {
        String calidadAnterior = getCalidad();

        System.out.println("Cambiando calidad de " + getNombre() + "...");
        System.out.println("   De: " + calidadAnterior + " - A: " + nuevaCalidad);

        if (nuevaCalidad.equalsIgnoreCase("4K")) {
            System.out.println("   Disfruta la mejor calidad disponible!");
        } else if (nuevaCalidad.equalsIgnoreCase("HD")) {
            System.out.println("   Calidad optimizada para tu conexion.");
        } else {
            System.out.println("   Ahorrando datos con calidad estandar.");
        }
    }

    public double getProgreso() {
        if (getDuracionMinutos() == 0) {
            return 0;
        }
        return (double) minutosReproducidos / getDuracionMinutos() * 100;
    }

    public int getMinutosReproducidos() {
        return minutosReproducidos;
    }

    public boolean isEnReproduccion() {
        return enReproduccion;
    }
}