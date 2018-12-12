package Enclos;

public class Aquarium extends Enclos{
	public Aquarium(String nom, float superficie, String espece) {
		super(nom, superficie, espece);
		}
		@Override
		public boolean ajouterAnimal(Animal animal) {
		if (animals.size() < getQuantiteMax(animal)) {
		if (!animal.isAquatique() ) {    
		return false;
		}
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
}
