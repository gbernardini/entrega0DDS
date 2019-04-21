package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipoTorso;

public class PrendaTorso extends Prenda {

    public PrendaTorso(String nombre) {
        super(nombre);
        this.tipo = new RopaTipoTorso();
    }
}
