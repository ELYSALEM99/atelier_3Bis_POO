package atelier_3;

public class Testtp3 {

	public static void main(String[] args) {
		Proprietaire p1=new Proprietaire("Toto","Corte");
		Appartement s1=new Studio(p1);
		MultiPiece m1=new MultiPiece(p1);
		m1.setNbPieces(2);
		Agence a=new Agence("AGENCE ESPADONBLEU –");
		a.ajoutAppartement(s1);
		a.ajoutAppartement(m1);
		Proprietaire p2=new Proprietaire("Titi","Ajaccio");
		MultiPiece m2=new MultiPiece(p2);
		m2.setNbPieces(4);
		a.ajoutAppartement(m2);
		a.afficher();
		Agence b=new Agence("Agence 2 -");
		Proprietaire p3=new Proprietaire("lili","Ajaccio");
		MultiPiece m3=new MultiPiece(p3);
		m3.setNbPieces(4);
		b.ajoutAppartement(m3);
		b.afficher();
		System.out.println("les nbres total des appartements "+Agence.getNbAppTotal());
	}

}
