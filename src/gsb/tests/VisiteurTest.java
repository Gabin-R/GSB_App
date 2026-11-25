package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

public class VisiteurTest {
	public static void main(String[] args) {
		
		Localite uneLocalite = new Localite("44000","Nantes");
			
		Visiteur unVisiteur = new Visiteur("a56","Rivière", "Gabin", "griviere", "password", "2 rue Dupont", uneLocalite, "0622334455", "2026-11-25", 150,"BO","Bourdin");
		
		System.out.println(unVisiteur.getMatricule());
		System.out.println(unVisiteur.getNom());
		System.out.println(unVisiteur.getPrenom());
		System.out.println(unVisiteur.getLogin());
		System.out.println(unVisiteur.getMdp());
		System.out.println(unVisiteur.getAdresse());
		System.out.println(unVisiteur.getUneLocatlite());
		System.out.println(unVisiteur.getTelephone());
		System.out.println(unVisiteur.getDateEntre());
		System.out.println(unVisiteur.getPrime());
		System.out.println(unVisiteur.getCodeUnite());
		System.out.println(unVisiteur.getNomUnite());
		
	}
}
