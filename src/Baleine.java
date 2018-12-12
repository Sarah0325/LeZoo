import java.util.Random;
public class Baleine extends Mammifere{
	static enum PrenomF{Betty, Brita, Brandine};	
	static enum PrenomM{Bobby, Billy,Barry};
	static float POIDS_MAX=100000;
	static float POIDS_MIN =50000;
	static float TAILLE_MAX=25f;
	static float TAILLE_MIN =18f;
	static int AGE_MAX=110;
	static int AGE_MIN=1;
	
	public Baleine() {
		super();
		aquatique = true;
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
