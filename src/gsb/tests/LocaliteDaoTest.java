package gsb.tests;

import java.util.HashMap;

import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;

public class LocaliteDaoTest {

	public static void main(String[] args) {
			
		HashMap<String,Localite> unDicco = new HashMap<String,Localite>();
		unDicco =	LocaliteDao.retournerDictionnaireDesLocalites();
		if (unDicco.containsKey("13015")){
			System.out.println(unDicco.get("13015").getVille());
		}

	}
}
