package Clases.src.Modulo02.Clase02.MetodosPago;

public class PagoContraEntrega implements MetodPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago contra entrega por un monto de: $" + monto);
    }
}
