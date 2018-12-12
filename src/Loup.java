import java.util.Random;
public class Loup extends Mammifere{
	static enum PrenomF{Jodie,Julie,Jaimie,Jane,Janice,Jenny};
	static enum PrenomM{Jack,James,Jarod,Jerry,John,Jimmy,Jonah};
	static float POIDS_MAX=80;
	static float POIDS_MIN =30;
	static float TAILLE_MAX=1.6f;
	static float TAILLE_MIN =1.0f;
	int AGE_MAX=8;
	int AGE_MIN=1;
	
	public Loup() {
		super();
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
