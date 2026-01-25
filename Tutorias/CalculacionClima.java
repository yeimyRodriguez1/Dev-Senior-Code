import java.util.Scanner;

/*Aplicación que calcula que clima vamos a tener mañana*/
public class CalculacionClima {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        /*
         * Las constantes son aquellas que no van a cambiar durante la ejecución del
         * programa
         * Las constantes en java son definidades por "final"
         */

        //Constantes del programa
        final String FECHA_MEDICION = "22/11/2025";
        final String NOMBRE_CANAL = "INFORMANDO";
        final int TEMPERATURA_ALERTA_CALOR = 35;
        final int TEMPERATURA_ALERTA_FRIO = 5;
        final double VIENTOS_FUERTES = 30.0;

        //Variables del programa
        double fuerzaViento;
        boolean lluviaDiaAnterior;
        boolean posiblesPrecipitaciones;
        double temperaturaMaximaDiaAnterior;
        double temperaturaMinimaDiaAnterior;
        double promedioTemperatura;
        String horaMedicion;
        double visibilidadKm;
        int temperaturaExacta;
        double temperaturaHoy;

        // Entrada de los datos
        System.out.println("========================================");
        System.out.println("REPORTE DEL CLIMA - " + NOMBRE_CANAL);
        System.out.println("========================================");

        System.out.println("Temperatura máxima del día anterior (°C): ");
        temperaturaMaximaDiaAnterior = entrada.nextDouble();

        System.out.println("Temperatura mínima del día anterior (°C): ");
        temperaturaMinimaDiaAnterior = entrada.nextDouble();

        System.out.println("Fuerza del viento (km/h): ");
        fuerzaViento = entrada.nextDouble();

        System.out.println("¿Hubo lluvia el día anterior? Responde: (true/false): ");
        lluviaDiaAnterior = entrada.nextBoolean();

        System.out.println("Hubo posibles precipitaciones hoy? Responde: (true/false): ");
        posiblesPrecipitaciones = entrada.nextBoolean();

        System.out.println("Visibilidad en km:");
        visibilidadKm = entrada.nextDouble();

        System.out.println("Hora de la medición (HH:MM): ");
        horaMedicion = entrada.next();

        // Calculo con operadores aritmeticos
        promedioTemperatura = (temperaturaMaximaDiaAnterior + temperaturaMinimaDiaAnterior) / 2.0;

        // casting double a int 
        temperaturaExacta = (int) promedioTemperatura;

        /*
         * la programación se escribe de izquierda a derecha y se lee de derecha a
         * izquierda
         */

        // Calcular la temperatura de hoy
        temperaturaHoy = promedioTemperatura;

        // Operadores lógicos para las alertas
        boolean hayAlertaCalor = temperaturaHoy >= TEMPERATURA_ALERTA_CALOR;
        boolean hayAlertaFrio = temperaturaHoy <= TEMPERATURA_ALERTA_FRIO;
        boolean hayVientosFuertes = fuerzaViento >= VIENTOS_FUERTES;
        boolean hayCondicionesLluvia = lluviaDiaAnterior && posiblesPrecipitaciones;
        boolean hayCondicionesExtremas = hayAlertaCalor || hayAlertaFrio || hayVientosFuertes;

        // Operadores relacionales
        boolean visibilidadBuena = visibilidadKm >= 10.0;
        boolean visibilidadMala = visibilidadKm < 5.0;
        boolean temperaturaIdeal = temperaturaHoy >= 18.0 && temperaturaHoy <= 25.0;

        // Calculos adicionales
        double variacionTemperatura = temperaturaMaximaDiaAnterior - temperaturaMinimaDiaAnterior;
        double promedioVientoTemperatura = (fuerzaViento + temperaturaHoy) / 2.0;
        int temperaturaRedondeada = (int) temperaturaHoy;

        // Mostrar los resultados
        System.out.println("========================================");
        System.out.println("       Resultados del analisis          ");
        System.out.println("========================================");
        System.out.println("Fecha de la medición: " + FECHA_MEDICION);
        System.out.println("Hora de la medición: " + horaMedicion);
        System.out.println("========================================");
        System.out.println("\n --- Datos del día anterior ---");
        System.out.println("========================================");
        System.out.println("Temperatura máxima del día anterior: " + temperaturaMaximaDiaAnterior + " °C");
        System.out.println("Temperatura mínima del día anterior: " + temperaturaMinimaDiaAnterior + " °C");
        System.out.println("Promedio " + promedioTemperatura + " °C");
        System.out.println("Promedio exacto: " + temperaturaExacta + " °C");
        System.out.println("Variación de temperatura: " + variacionTemperatura + " °C");
        System.out.println("\nCondiciones actuales");
        System.out.println("Fuerza del viento: " + fuerzaViento + " km/h");
        System.out.println("Lluvia el día anterior: " + lluviaDiaAnterior);
        System.out.println("Posibles precipitaciones hoy: " + posiblesPrecipitaciones);
        System.out.println("\nTemperatura pronosticada para hoy es: ");
        System.out.println("Temperatura hoy: " + temperaturaHoy + " °C");
        System.out.println("Temperatura redondeada: " + temperaturaRedondeada + " °C");
        System.out.println("\nAnalisis con operadores logicos");
        System.out.println("Alerta de calor: " + hayAlertaCalor);
        System.out.println("Alerta de frío: " + hayAlertaFrio);
        System.out.println("Vientos peligrosos: " + hayVientosFuertes);
        System.out.println("Condiciones para lluvia: " + hayCondicionesLluvia);
        System.out.println("Condiciones extremas: " + hayCondicionesExtremas);
        System.out.println("Visibilidad buena: " + visibilidadBuena);
        System.out.println("Visibilidad mala: " + visibilidadMala);
        System.out.println("Temperatura ideal: " + temperaturaIdeal);
        System.out.println("\nCalculos adicionales");
        System.out.println("Promedio entre viento y temperatura: " + promedioVientoTemperatura);
        System.out.println("========================================");
        System.out.println("Reporte generado por " + NOMBRE_CANAL);
        System.out.println("========================================");

        entrada.close();
    }
}
