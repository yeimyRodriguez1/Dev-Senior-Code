package Clases.src.Modulo02.Clase02.MetodosPago;

public class PagoCriptomonedas implements MetodPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Criptomonedas por un monto de: $" + monto);
    }
}
