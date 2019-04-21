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
    private Persona juan;
    private PrendaTorso torso;
    private PrendaPiernas piernas;
    private PrendaPies pies;
    private PrendaAccesorio accesorio;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

//        ROPA

        PrendaTorso remeraCorta = new PrendaTorso("remera manga corta");
        torso = new PrendaTorso("remera manga larga");

        PrendaPiernas pantalonCorto = new PrendaPiernas("pantalon corto");
        piernas = new PrendaPiernas("pantalon largo");

        PrendaPies zapatos = new PrendaPies("zapatos");
        pies = new PrendaPies("zapatillas");

        PrendaAccesorio collar = new PrendaAccesorio("collar");
        accesorio = new PrendaAccesorio("aros");

//        PERSONAS

        List<Prenda> prendaCarlos = new ArrayList<>();
        prendaCarlos.add(remeraCorta);
        prendaCarlos.add(torso);
        prendaCarlos.add(pantalonCorto);
        prendaCarlos.add(pies);
        prendaCarlos.add(zapatos);
        prendaCarlos.add(accesorio);

        List<Prenda> prendaPedro = new ArrayList<>();
        prendaPedro.add(torso);
        prendaPedro.add(piernas);
        prendaPedro.add(pies);
        prendaPedro.add(accesorio);


        List<Prenda> prendaJuan = new ArrayList<>();
        prendaCarlos.add(remeraCorta);
        prendaCarlos.add(pantalonCorto);

        carlos = new Persona("Carlos",prendaCarlos);
        pedro = new Persona("Pedro",prendaPedro);
        juan = new Persona("juan",prendaJuan);
    }

    public void testPruebaUsoRemera() {
        assertEquals(carlos.getPlacard().getPrendas().get(0).sePuedeUsarPara(Prenda.TipoIndumentaria.ACCESORIO),Boolean.FALSE);
    }

    public void testPruebaUsoPantalon() {
        assertEquals(carlos.getPlacard().getPrendas().get(2).sePuedeUsarPara(Prenda.TipoIndumentaria.PIERNAS),Boolean.TRUE);
    }

    public void testPruebaRecomendacion () throws  RecomendacionInvalidaException {
        assertEquals(pedro.obtenerRecomendacion(),new Recomendacion(torso,piernas,pies,accesorio));
    }

    public void testPruebaExcepcion() throws RecomendacionInvalidaException {
        try{
            juan.obtenerRecomendacion();
        } catch (RecomendacionInvalidaException exception){
            assertEquals(1,1);
        }
    }
}
