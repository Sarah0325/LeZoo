package Animaux;
import java.util.ArrayList;
import java.util.Scanner;

import Enclos.Aquarium;
import Enclos.Enclos;
import Enclos.Voliere;
public class MonZoo {
	
	public final static int MAX_ENCLOS = 60;
	public final static int NB_ENCLOS = 20;
	public final static int NB_AQUARIUM = 20;
	public final static int NB_VOLIERE = 20;
	public final static int MAX_SUPERFICIE = 200;
	public final static int MIN_SUPERFICIE = 25;
	private final static String DEFAUT_ENCLOS = "Enclos";
	private final static String DEFAUT_AQUARIUM = "Aquarium";
	private final static String DEFAUT_VOLIERE = "Voliere";
	private ArrayList<Voliere> lesvolieres = new ArrayList<Voliere>();
	private ArrayList<Aquarium> lesaquariums = new ArrayList<Aquarium>();
	private ArrayList<Enclos> lesenclos = new ArrayList<Enclos>();

	public MonZoo(int nbEnclos, int nbAquarium, int nbVoliere) {
		
	}

	public static void main(String[] args) {
		
		int valeur = 0;

		MonZoo zoo = new MonZoo(MonZoo.NB_ENCLOS, MonZoo.NB_AQUARIUM, MonZoo.NB_VOLIERE);

		Scanner scan = new Scanner(System.in);

		System.out.println("Binevenue au Zoo de la derniere chance  : tapez 0 pour commencer !");

		valeur = scan.nextInt();
		while (valeur == 0) {
			System.out.println("Choissisez 1 pour ajouter un enclos, 2 pour ajouter un animal ,"
					+ " 3 pour ajouter un employé \n et 4 pour faire une action. ");
			valeur = scan.nextInt();
			switch (valeur) {
			case 1:
				creerEnclos(zoo);
				break;
			case 2:
				ajouterAnimal(zoo);
				break;
			case 3:
				ajouterTravailleur();
				break;
			case 4:
				faireAction();
				break;
			default:
				System.out.println("Valeur inconnue :" + valeur);

			}

			System.out.println(zoo.toString());

			System.out.println("Tapez 0 pour continuer, un autre nombre pour sortir ");
			valeur = scan.nextInt();

		}

		System.out.println("Au revoir !");
	}

	private static void faireAction() {
		int action;
		Scanner scan = new Scanner(System.in);
		action = scan.nextInt();
		switch (action) {
		case 1 : 
			//nettoyer un enclos
			break;
		case 2 :
			//nourrir les animaux 
			break;
		}

	}

	private static void ajouterTravailleur() {
		// ajouter travailleur ,

	}

	private static void ajouterAnimal(MonZoo zoo) {
		int choix;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"1 pour un aigle ,\n 2 pour une baleine,\n 3 pour une girafe,\n 4 pour un poisson rouge (goldfish),\n"
						+ "5 pour un lion,\n 6 pour un loup,\n 7 pour un ours,\n 8 pour un pingouin,\n 9 un pour requin,\n 10 pour un tigre,\n 11 pour un éléphant,  ");
		choix = scan.nextInt();
		switch (choix) {
		case 1:
			Aigle a = new Aigle();
			System.out.println("Coucou , je suis un " + a.toString());
			for (Voliere voliere : zoo.lesvolieres) {
				if (voliere.ajouterAnimal(a)) {
					break;
				}
			}

		case 2:
			Baleine b = new Baleine();
			System.out.println("Coucou , je suis une " + b.toString());
			 for (Aquarium aquarium : zoo.lesaquariums) {
			 if (aquarium.ajouterAnimal(b)) {
			 break;
			 }
			 }
			
			
			break;
		case 3:
			Girafe g = new Girafe();
			System.out.println("Coucou , je suis une " + g.toString());
			for (Enclos enclos : zoo.lesenclos) {
				if (enclos.ajouterAnimal(g)) {
					break;
				}
			}

			break;
		case 4:

			break;
		case 5:
			Lion l = new Lion();
			System.out.println("Coucou , je suis un " + l.toString());
			for (Enclos enclos : zoo.lesenclos) {
				if (enclos.ajouterAnimal(l)) {
					break;
				}
			}

			break;
		case 6:
			Loup lo = new Loup();
			System.out.println("Coucou , je suis un " + lo.toString());
			for (Enclos enclos : zoo.lesenclos) {
				if (enclos.ajouterAnimal(lo)) {
					break;
				}
			}

			break;
		case 7:
			Ours o = new Ours();
			System.out.println("Coucou , je suis un " + o.toString());
			for (Enclos enclos : zoo.lesenclos) {
				if (enclos.ajouterAnimal(o)) {
					break;
				}
			}

			break;
		case 8:
			// pingouin
			break;
		case 9:
			Requin r = new Requin();
			System.out.println("Coucou , je suis un " + r.toString());
			for (Aquarium aquarium : zoo.lesaquariums) {
			if (aquarium.ajouterAnimal(r)) {
					break;
				}
			}
					break;
					// requin

		case 10:
			Tigre t = new Tigre();
			System.out.println("Coucou , je suis un " + t.toString());
			for (Enclos enclos : zoo.lesenclos) {
				if (enclos.ajouterAnimal(t)) {
					break;
				}
			}

	
		default:
			System.out.println("Valeur inconnue :" + choix);
		}

	}

	private static void creerEnclos(MonZoo zoo) {
		int choix;
		String nom;
		String espece;

		float superficie = (float) (Math.random() * (MonZoo.MAX_SUPERFICIE - MonZoo.MIN_SUPERFICIE) + Zoo.MIN_SUPERFICIE);
		Scanner scan = new Scanner(System.in);
		System.out.println("1 pour enclos standard , 2 pour aquarium, 3 pour voliere ");
		choix = scan.nextInt();
		switch (choix) {
		case 1:
			System.out.println("Tapez le nom de l'enclos");
			nom = scan.next();
			System.out.println("Tapez le nom de l'espece, Premiere lettre en majuscule");
			espece = scan.next();
			Enclos e = new Enclos(nom, superficie, espece);
			zoo.ajouterEnclos(e);

			break;
		case 2:
			System.out.println("Tapez le nom de l'aquarium");
			nom = scan.next();
			System.out.println("Tapez le nom de l'espece, Premiere lettre en majuscule");
			espece = scan.next();
			Aquarium a = new Aquarium(nom, superficie, espece);
			zoo.ajouterAquarium(a);
			
			break;
		case 3:

			System.out.println("Tapez le nom de la voliere");
			nom = scan.next();
			System.out.println("Tapez le nom de l'espece, Premiere lettre en majuscule");
			espece = scan.next();
			Voliere v = new Voliere(nom, superficie, espece);
			zoo.ajouterVoliere(v);
			
			break;
		default:
			System.out.println("Valeur inconnue :" + choix);
		}
		

	}

	private void ajouterVoliere(Voliere v) {
		// TODO Auto-generated method stub
		
	}

	private void ajouterAquarium(Aquarium a) {
		// TODO Auto-generated method stub
		
	}

	private void ajouterEnclos(Enclos e) {
		// TODO Auto-generated method stub
		
	}

}
