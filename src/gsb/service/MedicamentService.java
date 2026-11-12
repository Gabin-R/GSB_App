package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
import gsb.utils.ValidationUtils;

public class MedicamentService {

	public static Medicament rechercherMedicament(String unCodeMedicament){
		Medicament unMedicament = null;
		try{
			if (unCodeMedicament==null) {
	            throw new Exception("Donnee obligatoire : code");
	        }
				unMedicament = MedicamentDao.rechercher(unCodeMedicament.toUpperCase());
			}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedicament;
	}
	
	public static int verifInput(String unDepotLegal, String unNomCommercial, String uneComposition, String unEffet, String uneContreIndication, String unPrixEchantillon, String unCodeFamille, String unLibelleFamille){
		try{
			if (unDepotLegal == null) {
	            throw new Exception("Donnee obligatoire : Dépôt Légal");
	        }
			else if(!ValidationUtils.isString(unNomCommercial)) {
				throw new Exception("Type Invalide : Nom Commercial doit contenir du texte");
			}
			else if(!ValidationUtils.isString(uneComposition)) {
				throw new Exception("Type Invalide : Composition doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unEffet)) {
				throw new Exception("Type Invalide : Effet doit contenir du texte");
			}
			else if(!ValidationUtils.isString(uneContreIndication)) {
				throw new Exception("Type Invalide : Contre Indication doit contenir du texte");
			}
			else if(!ValidationUtils.isFloat(unPrixEchantillon)) {
				throw new Exception("Type Invalide : Prix Echantillon doit contenir un chiffre");
			}
			else if(!ValidationUtils.verifTailleMax(unCodeFamille, 3)) {
				throw new Exception("Donnée Invalide : Code Famille doit avoir une taille max de 3");
			}
			else if(!ValidationUtils.isString(unCodeFamille)) {
				throw new Exception("Type Invalide : Code Famille doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unLibelleFamille)) {
				throw new Exception("Type Invalide : Libellé Famille doit contenir du texte");
			}
			return MedicamentDao.ajouterNouveauMedicament(unDepotLegal.toUpperCase(),unNomCommercial,uneComposition,unEffet,uneContreIndication,Float.parseFloat(unPrixEchantillon),unCodeFamille.toUpperCase(),unLibelleFamille);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
			return 0;
		}
	}

}
