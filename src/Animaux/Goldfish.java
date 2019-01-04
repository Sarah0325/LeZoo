package Animaux;
import java.util.Random;
public class Goldfish extends Ovipare{
	static enum PrenomM{Ange,Andree,Alan,Artur,Alfred,Aristide,Armand,Aymeric,Adam,Archie,Anton};	
	static enum PrenomF{Astrid,Alex,Abby,Angela,Anita,Ariana,Aude,Amanda,};
	static float POIDS_MAX=1.5f;
	static float POIDS_MIN =0.1f;
	static float TAILLE_MAX=0.40f;
	static float TAILLE_MIN =0.02f;
	static int AGE_MAX=15;
	static int AGE_MIN=1;

	public Goldfish() {
		super(nom,sexe, POIDS_MAX, POIDS_MIN ,TAILLE_MAX, TAILLE_MIN, AGE_MAX, AGE_MIN);
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
