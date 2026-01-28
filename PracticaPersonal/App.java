package PracticaPersonal;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestionJovenes gestionJovenes = new GestionJovenes();

        int opcion;
        do {
            System.out.println("====GESTIÓN DE JOVENES====");
            System.out.println("1. Registrar Joven");
            System.out.println("2. Listar Jóvenes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Error: Debe ingresar un número.");
                scanner.nextLine(); 
                opcion = 0;
            }

            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número de identificación: ");
                    String numeroIdentificacion = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese correo electrónico: ");
                    String correoElectronico = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese estado (Activo/Inactivo): ");
                    String estado = scanner.nextLine();

                    Joven joven = new Joven(numeroIdentificacion, nombre, edad, correoElectronico, telefono, estado);
                    boolean registrado = gestionJovenes.registrarJoven(joven);

                    if (registrado) {
                        System.out.println("Registro completado");
                    } else {
                        System.out.println("No se pudo completar el registro");
                    }

                    break;
                case 2:
                    if (gestionJovenes.getListaJovenes().isEmpty()) {
                        System.out.println("No hay jóvenes registrados.");
                    } else {
                        for (Joven j : gestionJovenes.getListaJovenes()) {
                            j.mostrarInformacion();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }

        } while (opcion != 3);
        scanner.close();
    }
}