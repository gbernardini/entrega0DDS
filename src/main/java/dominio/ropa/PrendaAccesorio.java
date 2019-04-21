package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoAccesorio;

public class PrendaAccesorio extends Prenda {

    public PrendaAccesorio(String nombre) {
        super(nombre);
        this.tipo = new RopaTipoAccesorio();
    }
}

