package ex2cour;

import java.util.ArrayList;
import java.util.List;

public class GPS {
	  private String position;
	    private int precision;
	    private List<Observateur> observateurs = new ArrayList<Observateur>();

	    public void ajouterObservateur1(Observateur o) {
	        observateurs.add(o);
	    }
	    
	    public void ajouterObservateur(Observateur o) {
	        observateurs.add(o);
	    }

	    public void setMesures(String position, int precision) {
	        this.position = position;
	        this.precision = precision;
	        notifierObservateurs();
	    }

	    private void notifierObservateurs() {
	        for (Observateur o : observateurs) {
	            o.miseAJour(position, precision);
	        }
	    }
	}

