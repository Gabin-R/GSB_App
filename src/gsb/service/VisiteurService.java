package gsb.service;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

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
	
	
}
