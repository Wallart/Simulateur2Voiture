package AppliSimu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import DomaineVoiture.Voiture;
import DomaineRoute.*;

public class ProtoSimu {

	public static final int dureeUneSecondeEnMilliSecondes = 1000;

	public static void main(String[] args) {

		final Voiture maVoiture = new Voiture (100, 0, 10);
        final Route maRouteHorizontale = new Route(0, 295, 505, 30);
        final Route maRouteVerticale = new Route(400, 0, 30, 505);

        final Routes mesRoutes = new Routes();
        mesRoutes.ajouterRoute(maRouteHorizontale);
        mesRoutes.ajouterRoute(maRouteVerticale);

		IHMVoiture monTriangle = new IHMVoiture(maVoiture, mesRoutes);
		
		Timer timerAvancer = new Timer(dureeUneSecondeEnMilliSecondes, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				maVoiture.miseAJourPosition();
			}
		});
		
		timerAvancer.start();
		
		while(true){
		}

	}

}
