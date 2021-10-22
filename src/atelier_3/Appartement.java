package atelier_3;

public abstract class Appartement {
	private static int nbAppartements;
	private Proprietaire proprietaire;
	private String code;
	public Appartement(Proprietaire p) {
		this.proprietaire = p;
		nbAppartements++;
		code="APP"+nbAppartements;
	}
	public abstract double loyer();
	public String toString() {
		return code + " Appartenant à "+ proprietaire ;
	} 
	
}
