package dominio.persona;

import dominio.recomendador.Recomendador;
import dominio.ropa.Ropa;

import java.util.ArrayList;

public class Persona {
    public String nombre;
    public ArrayList<Ropa> ropa;

    public Persona (String unNombre) {
        this.nombre = unNombre;
    }

    public ArrayList<ArrayList<Ropa>> obtenerRecomendaciones () {
        return Recomendador.getInstance().obtenerRecomendaciones(this.ropa);
    }


    // GETTER

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ropa> getRopa() {
        return ropa;
    }

    // SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRopa(ArrayList<Ropa> ropa) {
        this.ropa = ropa;
    }
}

