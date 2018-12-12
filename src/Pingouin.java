import java.util.Random;
public class Pingouin extends Ovipare {
	static enum PrenomM{Peter,Pablo,Piotr,Paco,Paul,Phil};	
	static enum PrenomF{Patty,Paula,Prue,Polly,Petra};
	static float POIDS_MAX=7;
	static float POIDS_MIN =5;
	static float TAILLE_MAX=0.85f;
	static float TAILLE_MIN =0.75f;
	static int AGE_MAX=20;
	static int AGE_MIN=1;

	public Pingouin() {
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
