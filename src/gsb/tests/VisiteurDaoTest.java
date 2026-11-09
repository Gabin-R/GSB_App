package gsb.tests;

import java.util.HashMap;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

public class VisiteurDaoTest {

	public static void main(String[] args) {
		
		HashMap<String,Visiteur> unDicco = new HashMap<String,Visiteur>();
		unDicco =	VisiteurDao.retournerDictionnaireDesVisiteurs();
		if (unDicco.containsKey("f21")){
			System.out.println(unDicco.get("f21").getNom());
		}

	}
	
}
