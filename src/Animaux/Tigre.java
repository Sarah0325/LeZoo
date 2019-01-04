package Animaux;
import java.util.Random;
public class Tigre extends Mammifere {
	static enum PrenomF{Daria,Dora,Dina,Dolly,Diane,Doris,Donia};	
	static enum PrenomM{Dante,Daniel,Derek,David,Dean,Dorian};
	static float POIDS_MAX=7;
	static float POIDS_MIN =5;
	static float TAILLE_MAX=0.85f;
	static float TAILLE_MIN =0.75f;
	static int AGE_MAX=26;
	static int AGE_MIN=1;

	public Tigre() {
		super(nom,sexe, POIDS_MAX, POIDS_MIN ,TAILLE_MAX, TAILLE_MIN, AGE_MAX, AGE_MIN);
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
