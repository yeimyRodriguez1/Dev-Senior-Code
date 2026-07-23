
public class App{
    public static void ejemplo1() {
        try{
            int division = 10/0;
            System.out.println("El resultado es: ");
        }catch(Exception e){
            System.out.println("Se ha producido un error: "+e.getMessage());
        }

        System.out.println("Aqui continua el programa...");
    }
}