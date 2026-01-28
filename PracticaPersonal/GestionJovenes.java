package PracticaPersonal;

import java.util.ArrayList;

public class GestionJovenes {

    private ArrayList<Joven> listaJovenes;
    

    public GestionJovenes() {
        listaJovenes = new ArrayList<>();
    }


    /*
     * para cada joven en la lista
     * si identificación es igual
     * no registrar
     * si no se encontró ninguno
     * registrar
     */
    public boolean registrarJoven(Joven joven) {
        for (Joven jovencito : listaJovenes) {
            if (jovencito.getNumeroIdentificacion().equals(joven.getNumeroIdentificacion())) {
                return false;
            }
        }
        listaJovenes.add(joven);
        return true;
    }

    public ArrayList<Joven> getListaJovenes() {
        return listaJovenes;
    }

}
