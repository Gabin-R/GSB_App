package gsb.tests;

import gsb.modele.Medicament;

public class MedicamentTest {
	public static void main(String[] args) {
		
			
		Medicament unMedicament = new Medicament("pm","Doliprane", "Beaucoup", "vomissement", "", 5, "CRT", "Le médicamment");
		
		System.out.println(unMedicament.getDepotLegal());
		System.out.println(unMedicament.getNomCommercial());
		System.out.println(unMedicament.getEffets());
		System.out.println(unMedicament.getContreIndication());
		System.out.println(unMedicament.getPrixEchantillon());
		System.out.println(unMedicament.getCodeFamille());
		System.out.println(unMedicament.getLibelleFamille());
		
	}
}
