package Tuto02;

public class Pelicula extends Producto {

    private int duracionMinutos;
    private String director;
    private String calidad;

    public Pelicula(String nombre, String id, double precioBase,
            int duracionMinutos, String director, String calidad) {
        super(nombre, Integer.parseInt(id), precioBase);
        this.duracionMinutos = duracionMinutos;
        this.director = director;
        this.calidad = calidad;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    @Override
    public double calcularPrecioFinal() {
        double recargo = 0;
        switch (calidad.toLowerCase()) {

            case "4K":
                recargo = 5.0;
                break;
            case "HD":
                recargo = 2.0;
                break;
            case "SD":
            default:
                recargo = 0;
                break;
        }
        return precioBase + recargo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Duración (minutos): " + duracionMinutos);
        System.out.println("Director: " + director);
        System.out.println("Calidad: " + calidad);
        System.out.println("Precio Final: $" + calcularPrecioFinal());
    }

    public void verTrailer() {
        System.out.println("Reproduciendo trailer de: " + getNombre());
        System.out.println("   Dirigida por: " + director);
        System.out.println("   Proximamente en tu pantalla!");
    }

}
