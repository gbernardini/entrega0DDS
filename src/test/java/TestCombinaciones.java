import dominio.Placard;
import dominio.RecomendacionInvalidaException;
import dominio.persona.Persona;
import dominio.ropa.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TestCombinaciones extends TestCase {

    private Persona carlos;
    private Persona pedro;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

//        ROPA

        PrendaTorso remeraCorta = new PrendaTorso("remera manga corta");
        PrendaTorso remeraLarga = new PrendaTorso("remera manga larga");

        PrendaPiernas pantalonCorto = new PrendaPiernas("pantalon corto");
        PrendaPiernas pantalonLargo = new PrendaPiernas("pantalon largo");

        PrendaPies zapatos = new PrendaPies("zapatos");
        PrendaPies zapatillas = new PrendaPies("zapatillas");

        PrendaAccesorio collar = new PrendaAccesorio("collar");
        PrendaAccesorio aros = new PrendaAccesorio("aros");

//        PERSONAS

        List<Prenda> prendaCarlos = new ArrayList<>();
        prendaCarlos.add(remeraCorta);
        prendaCarlos.add(remeraLarga);
        prendaCarlos.add(pantalonCorto);
        prendaCarlos.add(zapatillas);
        prendaCarlos.add(zapatos);
        prendaCarlos.add(aros);

        List<Prenda> prendaPedro = new ArrayList<>();
        prendaCarlos.add(remeraCorta);
        prendaCarlos.add(remeraLarga);
        prendaCarlos.add(zapatos);
        prendaCarlos.add(zapatillas);
        prendaCarlos.add(collar);


        carlos = new Persona("Carlos",prendaCarlos);
        pedro = new Persona("Pedro",prendaPedro);

    }

    public void testPruebaUsoRemera() {
        assertEquals(carlos.getPlacard().getPrendas().get(0).sePuedeUsarPara(Prenda.TipoIndumentaria.ACCESORIO),Boolean.FALSE);
    }

    public void testPruebaUsoPantalon() {
        assertEquals(carlos.getPlacard().getPrendas().get(2).sePuedeUsarPara(Prenda.TipoIndumentaria.PIERNAS),Boolean.TRUE);
    }

    public void testPruebaExcepcion() throws RecomendacionInvalidaException {
    }
}
