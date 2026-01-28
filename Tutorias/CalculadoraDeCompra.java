package Tutorias;

import java.util.Scanner;

public class CalculadoraDeCompra {
    public static final double IVA = 0.19;
    public static final double DESCUENTO_VIP = 0.10;
    public static final String MONEDA = "COP";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CALCULADORA DE COMPRA =======");
        
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine(); 
        
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Es cliente VIP? (true/false): ");
        boolean esClienteVIP = scanner.nextBoolean();

        System.out.println("Ingrese el precio del producto: ");
        int PrecioProducto = scanner.nextInt();

        System.out.println("Ingrese la cantidad a comprar: ");
        int cantidad = scanner.nextInt();
        
        System.out.println("======= PROCESO DE COMPRA =======");
        //operadores aritmeticos
        double subtotal = PrecioProducto * cantidad; 
        System.out.println("Subtotal: " + subtotal + " " + MONEDA);

        //operadores de asignación compuesta 
        double total = 0; 
        total += subtotal;

        //Operadores lógicos 
        boolean aplicaDescuento = esClienteVIP &&(edad>=18);
        System.out.println("Aplica descuento VIP: " + aplicaDescuento);

        //Calcular descuento
        double descuento = total * DESCUENTO_VIP;
        total -= descuento; 

        System.out.println("Descuento aplicado (10%)" +descuento);

        //Calcular IVA
        double impuesto = total * IVA; 
        total += impuesto;
        System.out.println("IVA (19%): " + impuesto);

        //Casteo implicito 
        double cantidadDouble = cantidad; //int a double
        System.out.println("Casteo implicito");
        System.out.println("Cantiad (int): " + cantidad);
        System.out.println("Cantidad (double): " + cantidadDouble);


        //Casteo explicito
        int totalSinDecimal = (int) total; //double a int
        System.out.println("Casteo explicito");
        System.out.println("Total con decimales: " + total);
        System.out.println("Total sin decimales: " + totalSinDecimal);

        //Operadores de acumulación
        int puntosGanados = 0;
        puntosGanados ++; 
        puntosGanados += totalSinDecimal / 1000;
        puntosGanados --;
        puntosGanados ++; 

        //Operador logico (OR) 
        boolean envioGratis = (total >= 50000) || esClienteVIP; 
        System.out.println("Calculos adicionales");
        System.out.println("Envio gratis: " + envioGratis);

        //Operadores de modulo y operadores aritmeticos 
        int cuotas = 3; 
        total *= 1; 
        double valorCuota = total / cuotas; 
        double residuo = total % cuotas;

        //Operadores de asignación 
        int contador = 100; 
        contador /=2; //50 
        contador %=30; //20
        contador *=3;  //60
        
        System.out.println("Valor del contador: "+contador);

        //Operador logico (NOT)
        boolean noEsVip = !esClienteVIP; 
        System.out.println("No es cliente VIP: " + noEsVip);

        double promedio = (PrecioProducto + total) / 2; 
        char calificacion = 'A';
        System.out.println("======= RESUMEN DE COMPRA =======");
        System.out.println("Nombre cliente: " + nombreCliente);
        System.out.println("Edad en años: "+edad);
        System.out.println("Es cliente VIP: " + esClienteVIP);
        System.out.println("Total a pagar: " + total + " " + MONEDA);
        System.out.println("Puntos ganados: " + puntosGanados);
        System.out.println("Calificacion de compra: " + calificacion);
        System.out.println("\n Opción"+cuotas+" de pago de: " + valorCuota + " " + MONEDA + " con un residuo de: " + residuo);
        System.out.println("Promedio entre precio del producto y total a pagar: " + promedio);
        System.out.println("===================================");
        System.out.println("Gracias por su compra, " + nombreCliente + "!");
        scanner.close();
    }
}