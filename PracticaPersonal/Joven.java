package PracticaPersonal;

public class Joven {

    // Atributos
    private String numeroIdentificacion;
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String telefono;
    private String estado; // Activo o Inactivo

    // Constructor con todos los parámetros
    public Joven(String numeroIdentificacion, String nombre, int edad, String correoElectronico, String telefono,
            String estado) {

        this.numeroIdentificacion = numeroIdentificacion;
        setNombre(nombre);
        setEdad(edad);
        setCorreoElectronico(correoElectronico);
        setTelefono(telefono);
        setEstado(estado);

    }

    // Constructor vacio
    public Joven() {
        this.numeroIdentificacion = "Desconocido";
        this.nombre = "Desconocido";
        this.edad = 0;
        this.correoElectronico = "Desconocido";
        this.telefono = "Desconocido";
        this.estado = "Inactivo"; // Inactivo por defecto
    }

    // Constructor con algunos parámetros
    public Joven(String numeroIdentificacion, String nombre, int edad, String estado) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = "Desconocido";
        this.telefono = "Desconocido";
        this.estado = estado;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

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
        if (edad >= 14 && edad <= 28) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 14 y 28 años.");
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Error: El correo electrónico no es válido.");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{10}")) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: El teléfono debe tener 10 dígitos.");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        switch (estado) {
            case "Activo":
            case "Inactivo":
                this.estado = estado;
                break;
            default:
                System.out.println("Error: Estado inválido. Debe ser 'Activo' o 'Inactivo'.");
                break;
        }
    }

    // Mostrar información del joven
    public void mostrarInformacion() {
        System.out.println("====INFORMACIÓN DEL JOVEN====");
        System.out.println("Número de Identificación: " + numeroIdentificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Estado: " + estado);
    }

}
