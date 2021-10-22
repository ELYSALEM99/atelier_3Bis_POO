package atelier_3;

public class Proprietaire {
	private String nom;
	private String adresse;
	
	public Proprietaire(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String toString() {
		return nom+"("+adresse+")";
	}

}
