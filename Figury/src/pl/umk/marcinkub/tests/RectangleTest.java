package pl.umk.marcinkub.tests;

import org.junit.Test;
import pl.umk.marcinkub.figury.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void oblicz_powierzchnie() throws Exception {
        Rectangle r = new Rectangle(6.7,8.9);
        assertEquals(r.oblicz_powierzchnie(), 6.7*8.9,0.1);
    }

}