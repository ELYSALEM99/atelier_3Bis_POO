package atelier_3;

public class MultiPiece extends Appartement{
	static final double LOYERPIECE=200;
	private int nbPieces;
	
	public MultiPiece(Proprietaire p) {
		super(p);
	}
	
	public double loyer() {
		return this.getNbPieces()*LOYERPIECE;	
	}
	
	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	@Override
	public String toString() {
		return this.getNbPieces()+" pièce(s) " + super.toString();
	}
	

}
