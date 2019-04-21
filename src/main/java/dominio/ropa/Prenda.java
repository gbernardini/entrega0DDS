package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipo;

public abstract class Prenda {
    private String nombre;
    RopaTipo tipo;

    public enum TipoIndumentaria {
        TORSO,
        PIERNAS,
        PIES,
        ACCESORIO
    }

    public Prenda(String unNombre) {
        this.nombre = unNombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RopaTipo getTipo() {
        return tipo;
    }

    public void RopaTipo(RopaTipo tipo) {
        this.tipo = tipo;
    }

    public Boolean sePuedeUsarPara(TipoIndumentaria tipoIndumentaria) {
        return this.tipo.sirvePara(tipoIndumentaria);
    }
}
