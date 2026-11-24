package gsb.vue;

import gsb.modele.Visiteur;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class JIFVisiteur extends JInternalFrame implements ActionListener{
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	
	protected JLabel JLmatricule;
	protected JLabel JLnom;
	protected JLabel JLprenom;
	protected JLabel JLtelephone;
	protected JLabel JLadresse;
    protected JLabel JLdateEntree;
    protected JLabel JLprime;
    protected JLabel JLcodeUnite;
    protected JLabel JLnomUnite;
    
	protected JTextField JTmatricule;
	protected JTextField JTnom;
	protected JTextField JTprenom;
	protected JTextField JTtelephone;
	protected JTextField JTadresse;
    protected JFormattedTextField JTdateEntree;
    protected JTextField JTprime;
    protected JTextField JTcodeUnite;
    protected JTextField JTnomUnite;
    
    protected JButton JBfermer;
    
    DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
	
    public JIFVisiteur() {
    	p = new JPanel();  // panneau principal de la fenetre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(12,2));
    	
    	 JLmatricule = new JLabel("Matricule");
         JLnom = new JLabel("Nom");
         JLprenom = new JLabel("Prénom");
         JLtelephone = new JLabel("Téléphone");
         JLadresse = new JLabel("Adresse");
         JLdateEntree = new JLabel("(?) Date entrée");
         JLprime = new JLabel("Prime");
         JLcodeUnite = new JLabel("Code Unité");
         JLnomUnite = new JLabel("Nom Unité");
         
         JTmatricule = new JTextField(20);
         JTmatricule.setMaximumSize(JTmatricule.getPreferredSize());
         JTnom = new JTextField(20);
         JTprenom = new JTextField(20);
         JTtelephone = new JTextField(20);    
         JTadresse = new JTextField(20);
         
         JTdateEntree = new JFormattedTextField(formatDate);
         JTdateEntree.setColumns(10);
         
         JTprime = new JTextField(20);
         JTcodeUnite = new JTextField(20);
         JTnomUnite = new JTextField(20);
         
         JLdateEntree.setToolTipText("Sous le format : AAAA-MM-DD");
         JLdateEntree.setCursor(new Cursor(Cursor.HAND_CURSOR));
         
         pTexte.add(JLmatricule);
         pTexte.add(JTmatricule);
         pTexte.add(JLnom);
         pTexte.add(JTnom);
         pTexte.add(JLprenom);
         pTexte.add(JTprenom);
         pTexte.add(JLtelephone);
         pTexte.add(JTtelephone);
         pTexte.add(JLadresse);
         pTexte.add(JTadresse);
         pTexte.add(JLdateEntree);
         pTexte.add(JTdateEntree);
         pTexte.add(JLprime);
         pTexte.add(JTprime);
         pTexte.add(JLcodeUnite);
         pTexte.add(JTcodeUnite);
         pTexte.add(JLnomUnite);
         pTexte.add(JTnomUnite);
		
        // mise en forme de la fenetre

         p.add(pTexte);
         p.add(pBoutons);
         
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Visiteur unVisiteur) 	
    {  // methode qui permet de remplir les zones de texte a partir des valeurs passees en parametres
        JTmatricule.setText(unVisiteur.getMatricule());        
        JTnom.setText(unVisiteur.getNom());
        JTprenom.setText(unVisiteur.getPrenom());
        JTtelephone.setText(unVisiteur.getTelephone());    
        JTadresse.setText(unVisiteur.getAdresse());
        JTdateEntree.setText(unVisiteur.getDateEntre());
        JTprime.setText(unVisiteur.getCodeUnite());
        JTcodeUnite.setText(unVisiteur.getCodeUnite());
        JTnomUnite.setText(unVisiteur.getNomUnite());
     }
     
    public void viderText() 	
    {  // methode qui permet de vider les zones de texte 
        JTmatricule.setText("");        
        JTnom.setText("");
        JTprenom.setText("");
        JTtelephone.setText("");    
        JTadresse.setText("");
        JTdateEntree.setText("");
        JTprime.setText("");
        JTcodeUnite.setText("");
        JTnomUnite.setText("");
     }
    
    public void actionPerformed(ActionEvent evt) { 
		Object source = evt.getSource();
	}
}
