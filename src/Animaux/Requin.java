package Animaux;
import java.util.Random;

public class Requin extends Ovipare {
	static enum PrenomM {
		Oscar, Oswald, Octave, Ouarrede, Owen, Olivier
	};

	static enum PrenomF {
		Odile, Olga, Olivia, Oceane
	};
	static String nom="Kriyo";
	static float POIDS_MAX = 1100;
	static float POIDS_MIN = 600;
	static float TAILLE_MAX = 6f;
	static float TAILLE_MIN = 4f;
	static int AGE_MAX = 30;
	static int AGE_MIN = 1;

	public Requin() {
		super(nom, sexe, POIDS_MAX, POIDS_MAX, AGE_MAX, aerien, aerien, aerien);
		aquatique = true;
		Random r = new Random();
		if (sexe == Sexe.FEMELLE) {
			nom = PrenomF.values()[r.nextInt(PrenomF.values().length)].toString();
		} else if (sexe == Sexe.MALE) {
			nom = PrenomM.values()[r.nextInt(PrenomM.values().length)].toString();
		}
		afficher();
	}

}
