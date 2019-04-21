package dominio.ropa;

import dominio.RecomendacionInvalidaException;

public class Recomendacion {
    Prenda prendaTorso;
    Prenda prendaPiernas;
    Prenda prendaPies;
    Prenda prendaAccesorio;

    public Recomendacion (Prenda torso, Prenda piernas, Prenda pies, Prenda accesorio) throws RecomendacionInvalidaException {

        this.prendaTorso = torso;
        this.prendaPiernas = piernas;
        this.prendaPies = pies;
        this.prendaAccesorio = accesorio;

        this.esValida();

    }

    public Boolean esValida() throws RecomendacionInvalidaException {
        return this.esValidaPrenda(this.prendaTorso, Prenda.TipoIndumentaria.TORSO) &&
                this.esValidaPrenda(this.prendaPiernas, Prenda.TipoIndumentaria.PIERNAS) &&
                this.esValidaPrenda(this.prendaPies, Prenda.TipoIndumentaria.PIES);
    }

    public Boolean esValidaPrenda(Prenda prenda, Prenda.TipoIndumentaria tipoIndumentaria) throws RecomendacionInvalidaException {

        try {
            return prenda.sePuedeUsarPara(tipoIndumentaria);

        } catch (NullPointerException e){
            throw new RecomendacionInvalidaException("invalido");
        }

    }

    @Override
    public boolean equals(Object obj) {

        return  this.getPrendaTorso() == ((Recomendacion) obj).getPrendaTorso() &&
                this.getPrendaPiernas() == ((Recomendacion) obj).getPrendaPiernas() &&
                this.getPrendaPies() == ((Recomendacion) obj).getPrendaPies() &&
                this.getPrendaAccesorio() == ((Recomendacion) obj).getPrendaAccesorio() ;
    }

    public Prenda getPrendaTorso() {
        return prendaTorso;
    }

    public void setPrendaTorso(Prenda prendaTorso) {
        this.prendaTorso = prendaTorso;
    }

    public Prenda getPrendaPiernas() {
        return prendaPiernas;
    }

    public void setPrendaPiernas(Prenda prendaPiernas) {
        this.prendaPiernas = prendaPiernas;
    }

    public Prenda getPrendaPies() {
        return prendaPies;
    }

    public void setPrendaPies(Prenda prendaPies) {
        this.prendaPies = prendaPies;
    }

    public Prenda getPrendaAccesorio() {
        return prendaAccesorio;
    }

    public void setPrendaAccesorio(Prenda prendaAccesorio) {
        this.prendaAccesorio = prendaAccesorio;
    }
}
