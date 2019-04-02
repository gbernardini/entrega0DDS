package dominio.ropa.ropaTipo;

import dominio.ropa.Ropa;

public class RopaTipoPiernas implements RopaTipo {


    @Override
    public Boolean sirvePara(Ropa.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Ropa.TipoIndumentaria.PIERNAS;
    }
}
