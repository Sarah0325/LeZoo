package Enclos;

import java.util.ArrayList;
import java.util.Arrays;
public class Enclos {
	protected static int RATIO_TAILLE = 3;
	protected String nom;
	protected float superficie;
	protected ArrayList<Animal> animals;
	protected final String[] etatEnclos = { "mauvais", "à surveiller", "bon" };
	protected String etat = etatEnclos[2];
	protected String espece ;

	public Enclos(String nom, float superficie,String espece) {
	this.nom = nom;
	this.superficie = superficie;
	this.espece = espece;
	animals = new ArrayList<>();
	System.out.println(this.toString());
	}

	public boolean ajouterAnimal(Animal animal) {
	if (animals.size() < getQuantiteMax(animal)) {
	if (animal.getClass().getSimpleName().equals(getEspece()) || "".equals(getEspece())) {
	getAnimals().add(animal);
	return true;
	} else {
	System.out.println("On ne mélange pas les espèces!");
	}
	} else {
	System.out.println("L'enclos est déja plein!");
	}
	return false;
	}

	public void supprAnimal(Animal anim) {
	if (animals.size() == 0) {
	System.out.println("enclos deja vide !");
	return;
	} else {
	if (animals.remove(anim))
	System.out.println("un animal enlevé de l'enclos ");
	}
	}

	public String getNom() {
	return nom;
	}

	public void setNom(String nom) {
	this.nom = nom;
	}

	public float getSuperficie() {
	return superficie;
	}

	public void setSuperficie(float superficie) {
	this.superficie = superficie;
	}

	public int getQuantiteMax() {
	if(animals.size() > 0)
	return (int) (superficie / animals.get(0).getTailleMax() / RATIO_TAILLE);
	else 
	return 1;
	}

	public int getQuantiteMax(Animal anim) {
	return (int) (superficie / anim.getTailleMax() / 3);
	}


	public int getNombreAnimaux() {
	return animals.size();
	}

	public String getEspece() {
	return espece;
	}

	public ArrayList<Animal> getAnimals() {
	return animals;
	}

	public void setAnimals(ArrayList<Animal> animal) {
	this.animals = animal;
	}

	public String[] getEtatEnclos() {
	return etatEnclos;
	}

	public String getEtat() {
	return etat;
	}

	public void setEtat(String etat) {
	this.etat = etat;
	}

	@Override
	public String toString() {
	return "Enclos [nom=" + nom + ", superficie=" + superficie + ", quantiteMax=" + getQuantiteMax() + ", nombreAnimaux="
	+ animals.size() + ", espece=" + getEspece() + ", animal=" + animals + ", etatEnclos="
	+ Arrays.toString(etatEnclos) + "]";
	}

	@Override
	public String Caracteristique() {
	String carac = this.toString();
	return carac;
	}

	@Override
	public String Caracteristique(ArrayList<Animal> animals) {
	String result = "";
	for (Animal animal : animals) {
	result += animal.toString() + "\n";
	}
	return result;
	}

	public void NourrirAnimal() {

	for (int i = 0; i < getAnimals().size(); i++) {

	if (getAnimals().get(i).isFaim()) {
	System.out.println("Je donne a manger à : " + getAnimals().get(i).getNom());

	}

	}

	}

	public void Nettoyage() {
	if(getEtat() == getEtatEnclos()[0]) {
	System.out.println("Il faut nettoyer l'enclos");
	}
	else
	System.out.println("L'etat de l'enclos est acceptable ");
	}
}
