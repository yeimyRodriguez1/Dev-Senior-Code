package Clases.src.Modulo02.Clase02.MetodosPago;

public class PagoTarjeta implements MetodPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por un monto de: $" + monto);
    }

}
