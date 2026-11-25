package gsb.tests;

import gsb.modele.Localite;
import gsb.modele.Medecin;

public class MedecinTest {
	public static void main(String[] args) {
		
		Localite uneLocalite = new Localite("44000","Nantes");
			
		Medecin unMedecin = new Medecin("a55","Dupont", "George", "2 rue Dupont", uneLocalite, "0622334455", "important", "Dentition");
		
		System.out.println(unMedecin.getCodeMed());
		System.out.println(unMedecin.getNom());
		System.out.println(unMedecin.getPrenom());
		System.out.println(unMedecin.getAdresse());
		System.out.println(unMedecin.getLaLocalite());
		System.out.println(unMedecin.getTelephone());
		System.out.println(unMedecin.getPotentiel());
		System.out.println(unMedecin.getPotentiel());
		
	}
}
