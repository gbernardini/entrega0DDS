package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoPies;

public class RopaPies extends Ropa{

    public RopaPies (String nombre) {
        super(nombre);
        this.tipo = new RopaTipoPies();
    }
}
