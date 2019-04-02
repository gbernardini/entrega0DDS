package dominio.recomendador;

import dominio.ropa.Ropa;

public class Recomendador {

    private static Recomendador single_instance = null;

    public static Recomendador getInstance() {
        if (single_instance == null)
            single_instance = new Recomendador();

        return single_instance;
    }

    private Ropa[] obtenerRecomendaciones (Ropa[] ropa) {
        return null;
    }
}
