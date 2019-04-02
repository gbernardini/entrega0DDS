package dominio.ropa;

public abstract class Ropa {
    protected String nombre;
    protected TipoIndumentaria tipo;

    enum TipoIndumentaria {
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

    public TipoIndumentaria getTipo() {
        return tipo;
    }

    public void TipoIndumentaria(TipoIndumentaria tipo) {
        this.tipo = tipo;
    }
}
