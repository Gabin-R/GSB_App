package gsb.vue;

import gsb.modele.Medicament;
import gsb.service.MedicamentService;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class JIFMedicament extends JInternalFrame  {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	
	protected JLabel JLdepotLegal;
	protected JLabel JLnomCom;
	protected JLabel JLcomposition;
	protected JLabel JLeffet;
	protected JLabel JLcontreIndication;
    protected JLabel JLprixEchantillon;
    protected JLabel JLcodeFamille;
    protected JLabel JLlibelleFamille;
    
	protected JTextField JTdepotLegal;
	protected JTextField JTnomCom;
	protected JTextField JTcomposition;
	protected JTextField JTeffet;
	protected JTextField JTcontreIndication;
    protected JTextField JTprixEchantillon;
    protected JTextField JTcodeFamille;
    protected JTextField JTlibelleFamille;
    
    protected JButton JBfermer;
	
    public JIFMedicament() {
    	p = new JPanel();  // panneau principal de la fenetre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(8,2));
    	
    	 JLdepotLegal = new JLabel("Depot Legal");
         JLnomCom = new JLabel("Nom Commercial");
         JLcomposition = new JLabel("Composition");
         JLeffet = new JLabel("Effet");
         JLcontreIndication = new JLabel("Contre Indication");
         JLprixEchantillon = new JLabel("Prix Echantillon");
         JLcodeFamille = new JLabel("Code Famille");
         JLlibelleFamille = new JLabel("Libellé Famille");
         
         JTdepotLegal = new JTextField(20);
         JTdepotLegal.setMaximumSize(JTdepotLegal.getPreferredSize());
         JTnomCom = new JTextField(20);
         JTcomposition = new JTextField(20);
         JTeffet = new JTextField(20);    
         JTcontreIndication = new JTextField(20);
         JTprixEchantillon = new JTextField(20);
         JTcodeFamille = new JTextField(20);
         JTlibelleFamille = new JTextField(20);
         
         pTexte.add(JLdepotLegal);
         pTexte.add(JTdepotLegal);
         pTexte.add(JLnomCom);
         pTexte.add(JTnomCom);
         pTexte.add(JLcomposition);
         pTexte.add(JTcomposition);
         pTexte.add(JLeffet);
         pTexte.add(JTeffet);
         pTexte.add(JLcontreIndication);
         pTexte.add(JTcontreIndication);
         pTexte.add(JLprixEchantillon);
         pTexte.add(JTprixEchantillon);
         pTexte.add(JLcodeFamille);
         pTexte.add(JTcodeFamille);
         pTexte.add(JLlibelleFamille);
         pTexte.add(JTlibelleFamille);
		
        // mise en forme de la fenetre

         p.add(pTexte);
         p.add(pBoutons);
         
         JBfermer = new JButton("Fermer");
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medicament unMedicament) 	
    {  // methode qui permet de remplir les zones de texte a partir des valeurs passees en parametres
        JTdepotLegal.setText(unMedicament.getDepotLegal());        
        JTnomCom.setText(unMedicament.getNomCommercial());
        JTcomposition.setText(unMedicament.getComposition());
        JTeffet.setText(unMedicament.getEffets());    
        JTcontreIndication.setText(unMedicament.getContreIndication());
        JTprixEchantillon.setText(String.valueOf(unMedicament.getPrixEchantillon()));
        JTcodeFamille.setText(unMedicament.getCodeFamille());
        JTlibelleFamille.setText(unMedicament.getLibelleFamille());
     }
     
    public void viderText() 	
    {  // methode qui permet de vider les zones de texte 
        JTdepotLegal.setText("");        
        JTnomCom.setText("");
        JTcomposition.setText("");
        JTeffet.setText("");    
        JTcontreIndication.setText("");
        JTprixEchantillon.setText("");
        JTcodeFamille.setText("");
        JTlibelleFamille.setText("");
     }
    
    public void actionPerformed(ActionEvent evt) { 
		Object source = evt.getSource();
   		if (source == JBfermer){

   			//TODO : Fermeture avec le bouton Fermer (JBfermer).
		}
	}
}
