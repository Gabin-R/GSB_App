package gsb.service;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;
import gsb.utils.ValidationUtils;

public class VisiteurService {

	public static Visiteur rechercherVisiteur(String unMatriculeVisiteur){
		Visiteur unVisiteur = null;
		try{
		if (unMatriculeVisiteur==null) {
            throw new Exception("Donnee obligatoire : code");
        }
		unVisiteur = VisiteurDao.rechercher(unMatriculeVisiteur);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unVisiteur;
	}
	
	public static int verifInput(String unMatricule, String unNom, String unPrenom, String unLogin, String unMotDePasse, String unTel, String uneAdresse, String unCodePostal, String uneDateEntree, String unePrime, String unCodeUnite, String unNomUnite){
		try{
			if (unMatricule == null) {
	            throw new Exception("Donnée obligatoire : Matricule");
	        }
			else if(!ValidationUtils.isString(unNom)) {
				throw new Exception("Type Invalide : Nom doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unPrenom)) {
				throw new Exception("Type Invalide : Prenom doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unLogin)) {
				throw new Exception("Type Invalide : Login doit contenir du texte");
			}
			else if(!ValidationUtils.verifTailleMin(unMotDePasse,8)) {
				throw new Exception("Type Invalide : Mot de Passe doit contenir 8 caractères minimum");
			}
			else if(!ValidationUtils.isInt(unTel)) {
				throw new Exception("Type Invalide : Téléphone doit contenir des chiffres (XXXXXXXXXX)");
			}
			else if(!ValidationUtils.verifTailleMax(unTel,10)) {
				throw new Exception("Type Invalide : Téléphone doit contenir 10 caratères maximum");
			}
			else if(!ValidationUtils.verifTailleMin(unTel,10)) {
				throw new Exception("Type Invalide : Téléphone doit contenir 10 caractères");
			}
			else if(!ValidationUtils.isInt(unCodePostal)) {
				throw new Exception("Type Invalide : Code Postal doit contenir des chiffres (XXXXX)");
			}
			else if(!ValidationUtils.verifTailleMax(unCodePostal,5)) { 
				throw new Exception("Donnée Invalide : Code Postal doit avoir une taille max de 5");
			}
			else if(!ValidationUtils.verifTailleMin(unCodePostal,5)) { 
				throw new Exception("Donnée Invalide : Code Postal doit avoir une taille 5");
			}
			else if(!ValidationUtils.isString(uneAdresse)) { 
				throw new Exception("Donnée Invalide : Adresse doit contenir du texte");
			}
			else if(!ValidationUtils.isString(uneDateEntree)) {
				throw new Exception("Type Invalide : Date d'Entrée doit contenir du texte");
			}
			else if(!ValidationUtils.isInt(unePrime)) {
				throw new Exception("Type Invalide : Prime doit contenir un chiffre");
			}
			else if(!ValidationUtils.isString(unCodeUnite)) {
				throw new Exception("Type Invalide : Code Unité doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unNomUnite)) {
				throw new Exception("Type Invalide : Nom Unité doit contenir du texte");
			}
			System.out.println(unMotDePasse.length());
			return VisiteurDao.ajouterNouveauVisiteur(unMatricule.toLowerCase(),unNom,unPrenom,unLogin,unMotDePasse,unTel,uneAdresse,unCodePostal,uneDateEntree,Integer.parseInt(unePrime),unCodeUnite,unNomUnite);

		}
		catch(Exception e){
			System.out.println( e.getMessage());
			return 0;
		}
	}
	
	
}
