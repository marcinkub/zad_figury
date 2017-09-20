package pl.umk.marcinkub.tests;

import org.junit.Test;
import pl.umk.marcinkub.figury.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void oblicz_powierzchnie() throws Exception {
        Triangle t = new Triangle(6.5,5.5);
        assertEquals(6.5*5.5/2,t.oblicz_powierzchnie(),0.1);
    }

}