package Animaux;
import java.util.Random;

import Animaux.Animal.Sexe;
public class Aigle extends Ovipare {
	static enum PrenomF{Rania,Rosie,Regina};
	static enum PrenomM{Rosco,Ricky,Rufus,Risky,Raoul,Rony,Ridge,Ragnar};
	static float POIDS_MAX=11;
	static float POIDS_MIN =3;
	static float TAILLE_MAX=1.10f;
	static float TAILLE_MIN =0.66f;
	static int AGE_MAX=14;
	static int AGE_MIN=1;
	
	public Aigle() {
		super(nom,sexe, POIDS_MAX, POIDS_MIN ,TAILLE_MAX, TAILLE_MIN, AGE_MAX, AGE_MIN);
		aerien = true;
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
		return 0 ;
	}
}
