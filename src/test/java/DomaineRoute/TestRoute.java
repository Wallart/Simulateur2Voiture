package DomaineRoute;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestRoute {

    private Route maRoute;

    @Before
    public void setUp(){
        maRoute = new Route(0, 0, 200, 30);
    }

    @Test
    public void testPosition() {

        assertEquals(0, maRoute.getX());
        assertEquals(0, maRoute.getY());
    }

    @Test
    public void testSize() {

        assertEquals(200, maRoute.getWidth());
        assertEquals(30, maRoute.getHeight());
    }
}