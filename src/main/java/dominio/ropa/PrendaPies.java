package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoPies;

public class PrendaPies extends Prenda {

    public PrendaPies(String nombre) {
        super(nombre);
        this.tipo = new RopaTipoPies();
    }
}
