package Clases.src.Modulo02.Clase02.EnviosAmazon;

public class EnvioPrime extends Amazon {

    public EnvioPrime(String nombreProducto, String direccionEnvio, double pesoProducto) {
        super(nombreProducto, direccionEnvio, pesoProducto);
    }

    @Override
    public void CalcularCosto() {
        double costoEnvio;
        if (getPesoProducto() <= 15.0) {
            costoEnvio = 5.0;
        } else {
            costoEnvio = 20.0;
        }
        System.out.println("El costo de envío prime para el producto " + getNombreProducto() + " es de: $" + costoEnvio);
    }

}
