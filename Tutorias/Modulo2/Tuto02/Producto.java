package Tuto02;

public class Producto {
    private String nombre;
    private int id;
    protected double precioBase;

    public Producto(String nombre, int id, double precioBase) {
        this.nombre = nombre;
        this.id = id;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase;
    }

    public void mostrarInfo() {
        System.out.println("Producto ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Base: $" + precioBase);
        System.out.println("Precio Final: $" + calcularPrecioFinal());
    }

    public void mostrarInfo(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
        mostrarInfo();
    }

    public double aplicarDescuento(double porcentaje) {
        double descuento = precioBase * (porcentaje / 100);
        return precioBase - descuento;
    }

    public double aplicarDescuento(int montoFijo) {
        double resultado = precioBase - montoFijo;
        return resultado > 0 ? resultado : 0;
    }

    public double aplicarDescuento(double porcentaje, double descuentoMaximo) {
        double descuento = precioBase * (porcentaje / 100);
        descuento = Math.min(descuento, descuentoMaximo);
        return precioBase - descuento;
    }


}
