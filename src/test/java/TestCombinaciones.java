import dominio.persona.Persona;
import dominio.ropa.*;
import junit.framework.TestCase;

import java.util.ArrayList;

public class TestCombinaciones extends TestCase {

    private Persona carlos;
    private Persona pedro;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

//        ROPA

        RopaTorso remeraCorta = new RopaTorso("remera manga corta");
        RopaTorso remeraLarga = new RopaTorso("remera manga larga");

        RopaPiernas pantalonCorto = new RopaPiernas("pantalon corto");
        RopaPiernas pantalonLargo = new RopaPiernas("pantalon largo");

        RopaPies zapatos = new RopaPies("zapatos");
        RopaPies zapatillas = new RopaPies("zapatillas");

        RopaAccesorio collar = new RopaAccesorio("collar");
        RopaAccesorio aros = new RopaAccesorio("aros");

//        PERSONAS
        carlos = new Persona("Carlos");
        pedro = new Persona("Pedro");

        ArrayList<Ropa> ropaCarlos = new ArrayList<>();
        ropaCarlos.add(remeraCorta);
        ropaCarlos.add(remeraLarga);
        ropaCarlos.add(pantalonCorto);
        ropaCarlos.add(zapatillas);
        ropaCarlos.add(zapatos);
        ropaCarlos.add(aros);

        ArrayList<Ropa> ropaPedro = new ArrayList<>();
        ropaCarlos.add(remeraCorta);
        ropaCarlos.add(remeraLarga);
        ropaCarlos.add(pantalonCorto);
        ropaCarlos.add(pantalonLargo);
        ropaCarlos.add(zapatos);
        ropaCarlos.add(zapatillas);
        ropaCarlos.add(collar);


        carlos.setRopa(ropaCarlos);
        pedro.setRopa(ropaPedro);

    }

    public void testPruebaUsoRemera() {
        assertEquals(carlos.getRopa().get(0).sePuedeUsarPara(Ropa.TipoIndumentaria.ACCESORIO),Boolean.FALSE);
    }

    public void testPruebaUsoPantalon() {
        assertEquals(carlos.getRopa().get(2).sePuedeUsarPara(Ropa.TipoIndumentaria.PIERNAS),Boolean.TRUE);

    }
}
