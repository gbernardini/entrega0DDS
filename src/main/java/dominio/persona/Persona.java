package dominio.persona;

import dominio.ropa.Ropa;

public class Persona {
    public String nombre;
    public Ropa[] ropa;

    public Persona (String unNombre) {
        this.nombre = unNombre;
    }

    public Ropa[] obtenerRecomendaciones () {
        return ropa;
    }


    // GETTER

    public String getNombre() {
        return nombre;
    }

    public Ropa[] getRopa() {
        return ropa;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRopa(Ropa[] ropa) {
        this.ropa = ropa;
    }
}

