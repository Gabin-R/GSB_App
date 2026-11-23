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
	
	public static int verifInput(String unMatricule, String unNom, String unPrenom, String unLogin, String unMotDePasse, String unTel, String uneAdresse, String uneDateEntree, String unePrime, String unCodeUnite, String unNomUnite){
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
				throw new Exception("Type Invalide : Mot de Passe doit contenir 8 charactères minimum");
			}
			else if(!ValidationUtils.isString(unTel)) {
				throw new Exception("Type Invalide : Téléphone doit contenir un chiffre");
			}
			else if(!ValidationUtils.isString(uneAdresse)) { 
				throw new Exception("Donnée Invalide : Adresse doit avoir une taille max de 3");
			}
			else if(!ValidationUtils.isString(uneDateEntree)) {
				throw new Exception("Type Invalide : Date d'Entrée doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unePrime)) {
				throw new Exception("Type Invalide : Prime doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unCodeUnite)) {
				throw new Exception("Type Invalide : Code Unité doit contenir du texte");
			}
			else if(!ValidationUtils.isString(unNomUnite)) {
				throw new Exception("Type Invalide : Nom Unité doit contenir du texte");
			}
			return VisiteurDao.ajouterNouveauVisiteur(unMatricule.toLowerCase(),unNom,unPrenom,unLogin,unMotDePasse,unTel,uneAdresse,uneDateEntree,unePrime,unCodeUnite,unNomUnite); // TODO : Ajouter code Postal entre Tel et Adresse

		}
		catch(Exception e){
			System.out.println( e.getMessage());
			return 0;
		}
	}
	
	
}
