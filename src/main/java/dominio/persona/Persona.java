package dominio.persona;

public class Persona {
    public String nombre;
    public String[] ropa;

    public Persona (String unNombre) {
        this.nombre = unNombre;
    }

    public String[] obtenerRecomendaciones () {
        return ropa;
    }


    // GETTER

    public String getNombre() {
        return nombre;
    }

    public String[] getRopa() {
        return ropa;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRopa(String[] ropa) {
        this.ropa = ropa;
    }
}

