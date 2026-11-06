
package gsb.tests;

import gsb.modele.Medecin;
import gsb.service.MedecinService;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class MedecinServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Medecin unMedecin = MedecinService.rechercherMedecin("m002");
		System.out.println(unMedecin.getNom());
		System.out.println(unMedecin.getPrenom());
		System.out.println(unMedecin.getAdresse());
		System.out.println(unMedecin.getLaLocalite().getCodePostal());
		System.out.println(unMedecin.getLaLocalite().getVille());
		System.out.println(unMedecin.getTelephone());
		System.out.println(unMedecin.getPotentiel());
		System.out.println(unMedecin.getSpecialite());
		
		

	}

}
