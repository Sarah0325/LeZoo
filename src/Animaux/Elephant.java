package Animaux;
import java.util.Random;
public class Elephant extends Mammifere {
	static enum PrenomF{Jodie,Julie,Jaimie,Jane,Janice,Jenny};
	static enum PrenomM{Jack,James,Jarod,Jerry,John,Jimmy,Jonah};
	static float POIDS_MAX=2700;
	static float POIDS_MIN =6000;
	static float TAILLE_MAX=3.3f;
	static float TAILLE_MIN =2.7f;
	static int AGE_MAX=70;
	static int AGE_MIN=1;

	Elephant(){
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
