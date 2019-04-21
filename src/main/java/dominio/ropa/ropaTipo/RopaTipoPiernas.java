package dominio.ropa.ropaTipo;

import dominio.ropa.Prenda;

public class RopaTipoPiernas implements RopaTipo {


    @Override
    public Boolean sirvePara(Prenda.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Prenda.TipoIndumentaria.PIERNAS;
    }
}
