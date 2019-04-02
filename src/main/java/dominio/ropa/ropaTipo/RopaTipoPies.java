package dominio.ropa.ropaTipo;

import dominio.ropa.Ropa;

public class RopaTipoPies implements RopaTipo {


    @Override
    public Boolean sirvePara(Ropa.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Ropa.TipoIndumentaria.PIES;
    }
}
