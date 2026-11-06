
package gsb.vue;



import gsb.modele.Medecin;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class JIFMedecinFiche extends JIFMedecin {

	private static final long serialVersionUID = 1L;

	public JIFMedecinFiche(Medecin unMedecin) {
		super();
		this.remplirText(unMedecin);

	}
	

}
