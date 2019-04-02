package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoTorso;

public class RopaTorso extends Ropa{

    public RopaTorso (String nombre) {
        super(nombre);
        this.tipo = new RopaTipoTorso();
    }
}
