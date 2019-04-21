package dominio.ropa.ropaTipo;

import dominio.ropa.Prenda;

public class RopaTipoAccesorio implements RopaTipo {


    @Override
    public Boolean sirvePara(Prenda.TipoIndumentaria tipoIndumentaria) {
        return tipoIndumentaria == Prenda.TipoIndumentaria.ACCESORIO;
    }
}
