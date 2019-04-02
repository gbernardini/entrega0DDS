package dominio.ropa.ropaTipo;

import dominio.ropa.Ropa;

public class RopaTipoAccesorio implements RopaTipo {


    @Override
    public Boolean sirvePara(Ropa.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Ropa.TipoIndumentaria.ACCESORIO;
    }
}
