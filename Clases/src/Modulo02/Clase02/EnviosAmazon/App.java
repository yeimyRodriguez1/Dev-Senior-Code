package Clases.src.Modulo02.Clase02.EnviosAmazon;

public class App {
    public static void main(String[] args) {

        Amazon envio01 = new EnvioNormal("PC", "Génova", 4.3);
        envio01.CalcularCosto();

        Amazon envio02 = new EnvioPrime("Laptop", "Calle 8", 10.0);
        envio02.CalcularCosto();

        Amazon envio03 = new EnvioInternacional("Smartphone", "Nueva York", 16.5);
        envio03.CalcularCosto();

    }

}
