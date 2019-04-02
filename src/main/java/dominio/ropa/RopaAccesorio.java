package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoAccesorio;

public class RopaAccesorio extends Ropa{

    public RopaAccesorio(String nombre) {
        super(nombre);
        this.tipo = new RopaTipoAccesorio();
    }
}

