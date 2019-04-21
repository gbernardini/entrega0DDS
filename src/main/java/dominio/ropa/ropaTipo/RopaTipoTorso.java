package dominio.ropa.ropaTipo;

import dominio.ropa.Prenda;

public class RopaTipoTorso implements RopaTipo {


    @Override
    public Boolean sirvePara(Prenda.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Prenda.TipoIndumentaria.TORSO;
    }
}
