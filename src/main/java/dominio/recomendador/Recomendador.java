package dominio.recomendador;

import dominio.ropa.Ropa;
import java.util.ArrayList;

public class Recomendador {

    private static Recomendador single_instance = null;

    public static Recomendador getInstance() {
        if (single_instance == null)
            single_instance = new Recomendador();

        return single_instance;
    }

    public ArrayList<ArrayList<Ropa>> obtenerRecomendaciones (ArrayList<Ropa> ropa) {
//        ArrayList<Ropa> recomendacion = new ArrayList<>();

        ArrayList<ArrayList<Ropa>> recomendaciones = new ArrayList<>();
        return recomendaciones;
    }
}
