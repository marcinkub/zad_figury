package pl.umk.marcinkub.tests;

import org.junit.Test;
import pl.umk.marcinkub.figury.Elipse;

import static org.junit.Assert.*;

public class ElipseTest {
    @Test
    public void oblicz_powierzchnie() throws Exception {
        Elipse e = new Elipse(5.0,6.7);
        assertEquals(Math.PI*5.0*6.7, e.oblicz_powierzchnie(), 0.1);
    }

}