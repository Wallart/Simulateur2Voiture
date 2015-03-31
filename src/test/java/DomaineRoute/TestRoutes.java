package DomaineRoute;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRoutes {

    private Routes mesRoutes;

    @Before
    public void setUp(){
        mesRoutes = new Routes();
    }

    @Test
    public void testAjouterRoute() {
        Route r = new Route(0, 0, 0, 0);

        mesRoutes.ajouterRoute(r);
        assertEquals(1, mesRoutes.getSize());
    }

    @Test
    public void testEffacerRoute() throws Exception {
        Route r = new Route(0, 0, 0, 0);

        mesRoutes.ajouterRoute(r);
        mesRoutes.effacerRoute(r);
        assertEquals(0, mesRoutes.getSize());
    }

    @Test
    public void testGetSize() throws Exception {
        Route r1 = new Route(0, 0, 0, 0);
        Route r2 = new Route(0, 0, 0, 0);

        mesRoutes.ajouterRoute(r1);
        mesRoutes.ajouterRoute(r2);

        assertEquals(2, mesRoutes.getSize());
    }

    @Test
    public void testGetRouteAt(){
        Route r1 = new Route(0, 0, 0, 0);
        Route r2 = new Route(0, 0, 0, 0);

        mesRoutes.ajouterRoute(r1);
        mesRoutes.ajouterRoute(r2);

        assertEquals(r2, mesRoutes.getRouteAt(1));
    }
}