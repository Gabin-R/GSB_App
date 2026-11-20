
package gsb.modele.dao;

import gsb.modele.Localite;
import gsb.modele.Medicament;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class LocaliteDao {
	
	public static Localite rechercher(String codeLocalite){
		Localite uneLocalite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = new Localite(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneLocalite;
	}
	
	public static HashMap<String,Localite> retournerDictionnaireDesLocalites(){
		HashMap<String, Localite> diccoDesLocalites = new HashMap<String, Localite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from LOCALITE");
		try{
		while (reqSelection.next()) {
			String codeLocalites = reqSelection.getString(1);
		    diccoDesLocalites.put(codeLocalites, LocaliteDao.rechercher(codeLocalites));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedicament()");
		}
		return diccoDesLocalites;
	}

}
