package dominio;

import dominio.ropa.Prenda;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Placard {
    List<Prenda> prendas;

    public Placard (List<Prenda> items) {
        this.prendas = items;
    }

    public Prenda obtenerUnaPrendaDelTipo(Prenda.TipoIndumentaria tipo) {
        Random random = new Random();

        List<Prenda> items = prendas.stream().filter(item -> item.sePuedeUsarPara(tipo)).collect(Collectors.toList());

        if (items.size() == 0) {
            return null;
        }
        return items.get(random.nextInt(items.size()));
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }
}
