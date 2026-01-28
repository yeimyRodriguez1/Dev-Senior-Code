package Tutorias.Modulo2.Tuto01;
public class Estudiante {

    // Atributos del Estudiante
    private String nombre;
    private int edad;
    private double promedio;
    private String estado; // Activo, inactivo, graduado
    private int creditosAprobados;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
        this.estado = "Inactivo";
        this.creditosAprobados = 0;
    }

    // Constructor con parametros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.estado = "Activo";
        this.creditosAprobados = 0;
    }

    // Constructor con todos los parametros
    public Estudiante(String nombre, int edad, double promedio, String estado, int creditosAprobados) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.estado = estado;
        this.creditosAprobados = creditosAprobados;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 15 y 100 años.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio debe estar entre 0.0 y 5.0.");
        }

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        switch (estado) {
            case "Activo":
            case "Inactivo":
            case "Graduado":
                this.estado = estado;
                break;

            default:
                System.out.println("Error: Estado invalido.");
                break;
        }

    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = (creditosAprobados >= 0) ? creditosAprobados : 0;
    }

    public void actualizarEstadoPorPromedio() {
        if (this.promedio >= 3.0) {
            this.estado = "Activo";
        } else if (this.promedio >= 2.0) {
            System.out.println("El estudiante tiene un promedio bajo.");
        } else {
            this.estado = "Inactivo";
            System.out.println("Cuidado, el estudiante está en riesgo academico.");
        }
    }

    public String obtenerCalificacion() {
        String calificacion;
        int promedioEntero = (int) this.promedio;
        switch (promedioEntero) {
            case 5:
                calificacion = "Excelente";
                break;
            case 4:
                calificacion = "Muy Bueno";
                break;
            case 3:
                calificacion = "Bueno";
                break;
            case 2:
                calificacion = "Regular";
                break;
            default:
                calificacion = "Deficiente";

        }
        return calificacion;
    }

    public boolean esAprobado() {
        return (this.promedio >= 3.0) ? true : false;
    }

    public String obtenerEstadoAcademico() {
        return (this.promedio >= 3.0) ? "Aprobado" : "Reprobado";
    }

    public boolean puedeGraduarse() {
        return (this.creditosAprobados >= 120 && this.promedio >= 3.0) ? true : false;
    }

    public void mostrarInformacionEstudiante(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Promedio: " + this.promedio);
        System.out.println("Estado: " + this.estado);
        System.out.println("Créditos Aprobados: " + this.creditosAprobados);
        System.out.println("Calificación: " + obtenerCalificacion());
        System.out.println("Estado Académico: " + obtenerEstadoAcademico());
        System.out.println("Puede Graduarse: " + (puedeGraduarse() ? "Sí" : "No"));

    }
}