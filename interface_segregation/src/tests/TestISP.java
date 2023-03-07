package tests;

import static org.junit.Assert.assertEquals;


import bad.AvestruzBad;
import bad.LoroBad;
import bad.PinguinoBad;
import good.Avestruz;
import good.Loro;
import good.Pinguino;
import org.junit.Test;


public class TestISP {
    
    @Test
    public void testLoro() {
        String name = "Carlos";
        LoroBad loroBad = new LoroBad(name);
        Loro loroGood = new Loro(name);

        assertEquals(name + " horario especial para comer", loroBad.eat(), loroGood.eat());
        assertEquals(name + " ave voladora", loroBad.fly(), loroGood.fly());
        //assertEquals(name + "No es un ave que nade", loroBad.swim(), loroGood);
        //assertEquals(name + " No es un ave que corra", loroBad.run(),loroGood);
    }
    
    @Test
    public void testAvestruz() {
        String name = "Frenchi";
        AvestruzBad avestruzBad = new AvestruzBad(name);
        Avestruz avestruzGood = new Avestruz(name);

        assertEquals(name + " horario especial para comer", avestruzBad.eat(), avestruzGood.eat());
        //assertEquals(name + " No es un ave que nade", avestruzBad.swim(), avestruzGood);
        //assertEquals(name + " ave voladora", avestruzBad.fly(), avestruzGood);
        assertEquals(name + " Es un ave corredora", avestruzBad.run(), avestruzGood.run());

    }


    @Test
    public void testPinguino() {
        String name = "Skipper";
        PinguinoBad pinguinoBad = new PinguinoBad(name);
        Pinguino pinguinoGood = new Pinguino(name);
        assertEquals(name + " horario especial para comer", pinguinoBad.eat(), pinguinoGood.eat());
        assertEquals(name + " No es un ave que nade", pinguinoBad.swim(),pinguinoGood.swim());
        //assertEquals(name + " no es un ave voladora", pinguinoBad.fly(), pinguinoGood);
        //assertEquals(name + " No es un ave que corra", pinguinoBad.run(), pinguinoGood);
    }
    

}
