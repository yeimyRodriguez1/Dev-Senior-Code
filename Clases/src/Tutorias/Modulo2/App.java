import java.net.Socket;

public class App {
    public static void main(String[] args) {
        System.out.println("Constructores");

        // Constructor vacio
        Estudiante estudiante1 = new Estudiante();
        System.out.println("Constructor vacio:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());

        // Constructor con parametros
        Estudiante estudiante2 = new Estudiante("Ana", 20, 4.5);
        System.out.println("\nConstructor con parametros:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Promedio: " + estudiante2.getPromedio());

        // Constructor completo
        Estudiante estudiante3 = new Estudiante("Luis", 22, 3.8, "Activo", 60);
        System.out.println("\nConstructor completo:");
        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.println("Edad: " + estudiante3.getEdad());
        System.out.println("Promedio: " + estudiante3.getPromedio());
        System.out.println("Estado: " + estudiante3.getEstado());
        System.out.println("Créditos Aprobados: " + estudiante3.getCreditosAprobados());

        // Demostracion por el setter con validaciones
        Estudiante estudiante = new Estudiante();
        System.out.println("\nDemostracion del setter con validaciones:");
        System.out.println("Probando el setter del nombre ");
        estudiante.setNombre("Yeimy");
        System.out.println("Nombre establecido: " + estudiante.getNombre());

        System.out.println("\nProbando el setter de la edad ");
        estudiante.setEdad(19);
        System.out.println("Edad establecida: " + estudiante.getEdad());

        System.out.println("\nProbando el setter del promedio ");
        estudiante.setPromedio(4.2);
        System.out.println("Promedio establecido: " + estudiante.getPromedio());

        // Demostracion del metodo obtenerCalificacion
        System.out.println("\nDemostracion del metodo obtenerCalificacion:");
        System.out.println("Probando setEstado");
        estudiante.setEstado("Activo");
        System.out.println("Estado establecido: " + estudiante.getEstado());

        // Calificaciones por promedio

        System.out.println("Calificaciones por promedio:");
        Estudiante test1 = new Estudiante("test1", 21, 4.7);
        Estudiante test2 = new Estudiante("test2", 22, 3.5);
        Estudiante test3 = new Estudiante("test3", 23, 2.8);
        Estudiante test4 = new Estudiante("test4", 24, 1.9);
        Estudiante test5 = new Estudiante("test5", 25, 0.5);

        System.out.println(
                test1.getNombre() + "promedio" + test1.getPromedio() + "calificacion: " + test1.obtenerCalificacion());
        System.out.println(
                test2.getNombre() + "promedio" + test2.getPromedio() + "calificacion: " + test2.obtenerCalificacion());
        System.out.println(
                test3.getNombre() + "promedio" + test3.getPromedio() + "calificacion: " + test3.obtenerCalificacion());
        System.out.println(
                test4.getNombre() + "promedio" + test4.getPromedio() + "calificacion: " + test4.obtenerCalificacion());
        System.out.println(
                test5.getNombre() + "promedio" + test5.getPromedio() + "calificacion: " + test5.obtenerCalificacion());

        System.out.println("\nDemostracion de metodos ternarios:");
        System.out.println("Evaluame el estado academico de un estudiante:");
        System.out.println("Nombre " + test1.getNombre() + ": " + test1.obtenerEstadoAcademico() + "("
                + (test1.esAprobado() ? "Si" : "No") + ")");
        System.out.println("Nombre " + test2.getNombre() + ": " + test2.obtenerEstadoAcademico() + "("
                + (test2.esAprobado() ? "Si" : "No") + ")");
        System.out.println("Nombre " + test3.getNombre() + ": " + test3.obtenerEstadoAcademico() + "("
                + (test3.esAprobado() ? "Si" : "No") + ")");
        System.out.println("Nombre " + test4.getNombre() + ": " + test4.obtenerEstadoAcademico() + "("
                + (test4.esAprobado() ? "Si" : "No") + ")");
        System.out.println("Nombre " + test5.getNombre() + ": " + test5.obtenerEstadoAcademico() + "("
                + (test5.esAprobado() ? "Si" : "No") + ")");

                
    }

}
