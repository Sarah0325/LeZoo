import java.util.Random;
public class Girafe extends Mammifere{
	static enum PrenomF{Sophie,Sonia,Sarah,Sandy,Sylvie};
	static enum PrenomM{Stan,Saul,Sydney,Stuart,Stephane};
	static float POIDS_MAX=1200;
	static float POIDS_MIN =830;
	static float TAILLE_MAX=4.6f;
	static float TAILLE_MIN =6.00f;
	static int AGE_MAX=34;
	static int AGE_MIN=1;
	

	public Girafe() {
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
