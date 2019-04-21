package dominio.persona;

import dominio.Placard;
import dominio.RecomendacionInvalidaException;
import dominio.recomendador.Recomendador;
import dominio.ropa.Prenda;
import dominio.ropa.Recomendacion;

import java.util.List;

public class Persona {
    public String nombre;
    public Placard placard;

    public Persona (String unNombre, List<Prenda> prendas) {
        this.nombre = unNombre;
        this.placard = new Placard(prendas);
    }

    public Recomendacion obtenerRecomendacion () throws RecomendacionInvalidaException {
        return Recomendador.getInstance().obtenerRecomendacion(this.placard);
    }


    // GETTER

    public String getNombre() {
        return nombre;
    }

    public Placard getPlacard() {
        return placard;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlacard(Placard placard) {
        this.placard = placard;
    }
}

