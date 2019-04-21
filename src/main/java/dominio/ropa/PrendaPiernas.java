package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoPiernas;

public class PrendaPiernas extends Prenda {

    public PrendaPiernas(String nombre) {
        super(nombre);
        this.tipo = new RopaTipoPiernas();
    }
}

