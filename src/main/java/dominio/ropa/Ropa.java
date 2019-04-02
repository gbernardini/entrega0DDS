package dominio.ropa;

import dominio.ropa.ropaTipo.RopaTipo;

public abstract class Ropa {
    protected String nombre;
    protected RopaTipo tipo;

    public enum TipoIndumentaria {
        TORSO,
        PIERNAS,
        PIES,
        ACCESORIO;
    }

    public Ropa (String unNombre) {
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
}
