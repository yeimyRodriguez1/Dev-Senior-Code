package Tutorias.Modulo2.Tuto02;

public class Videojuego extends Producto {

    private String plataforma;
    private String genero;
    private double tamañoGigas;

    public Videojuego(String nombre, int id, double precioBase, String plataforma, String genero, double tamañoGigas) {
        super(nombre, id, precioBase);
        this.plataforma = plataforma;
        this.genero = genero;
        this.tamañoGigas = tamañoGigas;

    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTamañoGigas() {
        return tamañoGigas;
    }

    public void setTamañoGigas(double tamañoGigas) {
        this.tamañoGigas = tamañoGigas;
    }

    @Override
    public double calcularPrecioFinal() {
        double recargo = 0;
        switch (plataforma.toLowerCase()) {
            case "PlayStation":
            case "Xbox":
                recargo = precioBase * 0.10;
                break;
            case "Nintengo":
                recargo = precioBase * 0.05;
                break;
            case "PC":
            default:
                recargo = 0;
                break;
        }
        return precioBase + recargo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Género: " + genero);
        System.out.println("Tamaño (GB): " + tamañoGigas);
        System.out.println("Precio Final: $" + calcularPrecioFinal());

    }

    public void iniciarJuego() {
        System.out.println("Iniciando " + getNombre() + " en " + plataforma + "...");
        System.out.println("   Disfruta tu partida!");
    }

}
