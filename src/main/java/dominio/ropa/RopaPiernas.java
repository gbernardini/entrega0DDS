package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoPiernas;

public class RopaPiernas extends Ropa{

    public RopaPiernas (String nombre) {
        super(nombre);
        this.tipo = new RopaTipoPiernas();
    }
}

