package Animaux;

public abstract class Animal {

	static enum Sexe {
		MALE, FEMELLE
	};

	protected static float POIDS_MAX;
	protected static float POIDS_MIN;
	protected static float TAILLE_MAX;
	protected static float TAILLE_MIN;
	protected static int AGE_MAX;
	protected static int AGE_MIN;

	protected static String nom;
	protected static Sexe sexe;
	protected static float poids;
	protected static float taille;
	protected static int age;
	protected static boolean faim;
	protected static boolean sommeil;
	protected static boolean sante;
	protected static boolean aerien;
	protected static boolean aquatique;

	public Animal(String nom, Sexe sexe, float poids, float taille, int age, boolean faim, boolean sommeil,
			boolean sante) {
		super();
		this.nom = nom;
		this.sexe = Math.random() < 0.5 ? Sexe.MALE : Sexe.FEMELLE;
		this.poids = (float) (Math.random() * (getPoidsMax() - getPoidsMin()) + getPoidsMin());
		this.taille = (float) (Math.random() * (getTailleMax() - getTailleMin()) + getTailleMin());
		this.age = (int) (Math.random() * (AGE_MAX - AGE_MIN) + AGE_MIN);
		this.faim = false;
		this.sommeil = false;
		this.sante = true;
	}

	public boolean isAerien() {
		return aerien;
	}

	public void setAerien(boolean aerien) {
		this.aerien = aerien;
	}

	public boolean isAquatique() {
		return aquatique;
	}

	public void setAquatique(boolean aquatique) {
		this.aquatique = aquatique;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [nom=" + nom + ", sexe=" + sexe + ", poids=" + poids + ", taille="
				+ taille + ", age=" + age + ", faim=" + faim + ", sommeil=" + sommeil + ", sante=" + sante + "]";
	}

	public void afficher() {
		System.out.println(this.toString());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {

		this.poids = poids;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public float getTailleMax() {
		return 0;
	}

	public float getTailleMin() {
		return 0;
	}

	public float getPoidsMax() {
		return 0;
	}

	public float getPoidsMin() {
		return 0;
	}

	public boolean isFaim() {
		return false;
	}


}
