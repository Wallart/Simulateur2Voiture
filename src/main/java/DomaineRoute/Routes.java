package DomaineRoute;

import java.util.ArrayList;

/**
 * Created by wallart on 24/03/15.
 */
public class Routes {

    private ArrayList<Route> listeRoutes;

    public Routes(){
        this.listeRoutes = new ArrayList<Route>() {
        };
    }

    public void ajouterRoute(Route r){
        this.listeRoutes.add(r);
    }

    public void effacerRoute(Route r){
        this.listeRoutes.remove(r);
    }

    public int getSize(){
        return this.listeRoutes.size();
    }

    public Route getRouteAt(int index){
        return this.listeRoutes.get(index);
    }
}
