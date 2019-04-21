package dominio.recomendador;

import dominio.Placard;
import dominio.RecomendacionInvalidaException;
import dominio.ropa.Prenda;
import dominio.ropa.Recomendacion;

public class Recomendador {

    private static Recomendador single_instance = null;

    public static Recomendador getInstance() {
        if (single_instance == null)
            single_instance = new Recomendador();

        return single_instance;
    }

    public Recomendacion obtenerRecomendacion (Placard placard) throws RecomendacionInvalidaException {
        Recomendacion recomendacion = new Recomendacion(placard.obtenerUnaPrendaDelTipo(Prenda.TipoIndumentaria.TORSO),
                                                    placard.obtenerUnaPrendaDelTipo(Prenda.TipoIndumentaria.PIERNAS),
                                                    placard.obtenerUnaPrendaDelTipo(Prenda.TipoIndumentaria.PIES),
                                                    placard.obtenerUnaPrendaDelTipo(Prenda.TipoIndumentaria.ACCESORIO));

        return recomendacion;
    }
}
