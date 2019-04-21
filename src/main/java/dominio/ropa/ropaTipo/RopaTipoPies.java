package dominio.ropa.ropaTipo;

import dominio.ropa.Prenda;

public class RopaTipoPies implements RopaTipo {


    @Override
    public Boolean sirvePara(Prenda.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Prenda.TipoIndumentaria.PIES;
    }
}
