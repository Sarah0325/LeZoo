package Animaux;
import java.util.Random;

import Animaux.Animal.Sexe;
public class Lion extends Mammifere{
	static enum PrenomF{Mina,Mona,Maya,Maggy,Millie};
	static enum PrenomM{Mickael,Martin,Mike,Miles,Montmirail};
	static float POIDS_MAX=190;
	static float POIDS_MIN =160;
	static float TAILLE_MAX=2.5f;
	static float TAILLE_MIN =1.4f;
	static int AGE_MAX=34;
	static int AGE_MIN=1;

	public Lion() {
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
