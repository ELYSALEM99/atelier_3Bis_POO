package atelier_3;

public class Studio extends Appartement {
	static final double LOYERSTUDIO=300;

	public Studio(Proprietaire p) {
		super(p);
	}
	
	public double loyer(){
		return LOYERSTUDIO;
	}
	
	public String toString() {
		return "Studio " + super.toString() ;
	}
}
