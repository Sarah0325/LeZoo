package Animaux;
import java.util.Random;
public class Ours extends Mammifere {
	static enum PrenomM{Tony,Teddy,Tommy,Todd,Tibald,Theo};	
	static enum PrenomF{Terri,Tania,Tina,Tonya};
	static float POIDS_MAX=82;
	static float POIDS_MIN =60;
	static float TAILLE_MAX=1.6f;
	static float TAILLE_MIN =0.7f;
	static int AGE_MAX=25;
	static int AGE_MIN=1;

	public Ours() {
		super(nom, sexe, POIDS_MAX, POIDS_MAX, AGE_MAX, aerien, aerien, aerien);
		Random r = new Random(); 
		if (sexe == Sexe.FEMELLE ) {
			nom = PrenomF.values()[r.nextInt(PrenomF.values().length)].toString();
		}
		else if (sexe == Sexe.MALE ) {
			nom = PrenomM.values()[r.nextInt(PrenomM.values().length)].toString();
		}		
		afficher();
	}

	@Override
	public float getTailleMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getTailleMin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPoidsMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPoidsMin() {
		// TODO Auto-generated method stub
		return 0;
	}
}
