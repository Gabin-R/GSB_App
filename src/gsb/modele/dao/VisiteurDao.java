package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

public class VisiteurDao {

	public static Visiteur rechercher(String matriculeVisiteur){
		Visiteur unVisiteur=null;
		Localite uneLocalite= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE ='"+matriculeVisiteur+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = LocaliteDao.rechercher(reqSelection.getString(5));
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5), reqSelection.getString(6), uneLocalite, reqSelection.getString(8), reqSelection.getString(9), reqSelection.getInt(10), reqSelection.getString(11), reqSelection.getString(12) );	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from VISITEUR where MATRICULE ='"+matriculeVisiteur+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs(){
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try{
		while (reqSelection.next()) {
			String matVisiteur = reqSelection.getString(6);
		    collectionDesVisiteurs.add(VisiteurDao.rechercher(matVisiteur));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}
	
	public static HashMap<String,Visiteur> retournerDictionnaireDesVisiteurs(){
		HashMap<String, Visiteur> diccoDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try{
		while (reqSelection.next()) {
			String matVisiteur = reqSelection.getString(1);
		    diccoDesVisiteurs.put(matVisiteur, VisiteurDao.rechercher(matVisiteur));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisiteurs()");
		}
		return diccoDesVisiteurs;
	}
	
}
