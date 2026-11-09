package gsb.tests;

import java.util.HashMap;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentDaoTest {

	public static void main(String[] args) {
			
		HashMap<String,Medicament> unDicco = new HashMap<String,Medicament>();
		unDicco =	MedicamentDao.retournerDictionnaireDesMedicaments();
		if (unDicco.containsKey("CRT")){
			System.out.println(unDicco.get("CRT").getNomCommercial());
		}

	}
}
