package gsb.tests;

import gsb.modele.Localite;

public class LocaliteTest {
	public static void main(String[] args) {
		
		Localite uneLocalite = new Localite("44000","Nantes");
		
		System.out.println(uneLocalite.getCodePostal());
		System.out.println(uneLocalite.getVille());
		
	}
	
}
