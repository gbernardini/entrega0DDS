import dominio.persona.Persona;
import dominio.ropa.*;
import junit.framework.TestCase;

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

        carlos.setRopa(new Ropa[]{remeraCorta, remeraLarga, pantalonCorto, zapatillas, zapatos, aros});
        pedro.setRopa(new Ropa[]{remeraCorta,remeraLarga,pantalonCorto,pantalonLargo,zapatillas,zapatos,collar});

    }

    public void testPruebaUsoRemera() {
        assertEquals(carlos.getRopa()[0].sePuedeUsarPara(Ropa.TipoIndumentaria.ACCESORIO),Boolean.FALSE);
    }

    public void testPruebaUsoPantalon() {
        assertEquals(carlos.getRopa()[2].sePuedeUsarPara(Ropa.TipoIndumentaria.PIERNAS),Boolean.TRUE);

    }
}
