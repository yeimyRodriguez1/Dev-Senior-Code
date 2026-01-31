package Clases.src.Modulo02.Clase02.MetodosPago;

public class PagoPayPal implements MetodPago{
    @Override
    public void procesarPago(double monto){
        System.out.println("Procesando pago con PayPal por un monto de: $" + monto);
    }
}
