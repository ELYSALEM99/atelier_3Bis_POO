package atelier_3;

import java.util.ArrayList;

public class Agence {
	private String Nom;
	private int nbApp;
	static int nbAppTo=0;
	private ArrayList<Appartement> appartements;

	public Agence(String nom) {
		Nom=nom;
		nbApp=0;
		appartements=new ArrayList<Appartement>();
	}
	
    public void ajoutAppartement(Appartement a) {
    	appartements.add(a);
    	nbApp++;
    	nbAppTo++;
	}
    
    private int totalLoyer() {
    	int result=0;
    	for(Appartement e:appartements)
    	{
    		result+=e.loyer();
    	}
    	return result; 	
    }
    public void afficher() {
    	System.out.println(Nom+" "+nbApp+" appartements");
    	System.out.println("LISTE DES APPARTEMENTS ");
    	for(Appartement e:appartements) 
    	{
    		System.out.println(e);
    	}
    	System.out.println("Total des loyers de l’agence "+totalLoyer()+" euros");
    }
    
    static int getNbAppTotal() {
    	return nbAppTo;
    }
}
