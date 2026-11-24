package gsb.vue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import gsb.service.VisiteurService;

public class JIFVisiteurAjout extends JIFVisiteur implements ActionListener{

	/*
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private JButton ajouter;
	
	private JLabel JLlogin;
	private JLabel JLmdp;
	private JLabel JLcodePostal;
	
	private JTextField JTlogin;
	private JPasswordField JPmdp;
	private JTextField JTcodePostal;
	
	//TODO : Faire l'interface et l'ajout.
        
    public JIFVisiteurAjout() {
        super();
        
        JLlogin = new JLabel("Login");
        JLmdp = new JLabel("Mot de Passe");
        JLcodePostal = new JLabel("Code Postal");
        
        JTlogin = new JTextField(20);
        JPmdp = new JPasswordField(20);
        JTcodePostal = new JTextField(20);
        		
        ajouter = new JButton("Ajouter");
        
        pTexte.add(JLcodePostal);
        pTexte.add(JTcodePostal);
        pTexte.add(JLlogin);
        pTexte.add(JTlogin);
        pTexte.add(JLmdp);
        pTexte.add(JPmdp);
        
        pBoutons.add(ajouter);
        // declaration des sources d'evenements
        ajouter.addActionListener(this);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Ajouter un Visiteur");
        
        
        // recuperation des donnees Visiteur dans la collection
        
        // ajout d'un ecouteur d'evenement pour la fermeture de la fenetre
        addInternalFrameListener(new InternalFrameAdapter(){
            public void  internalFrameClosing(InternalFrameEvent e) {
                          //le code que tu veux executer a la fermeture de la JInternalFrame
            }
        });
    }
	
    public void actionPerformed(ActionEvent evt) { 
		Object source = evt.getSource();
   		if (source == ajouter){
   			char[] pswd = JPmdp.getPassword();
   			String password = new String(pswd);
   			VisiteurService.verifInput(JTmatricule.getText(),JTnom.getText(),JTprenom.getText(),JTlogin.getText(),password,JTtelephone.getText(),JTadresse.getText(),JTcodePostal.getText(),JTdateEntree.getText(),JTprime.getText(),JTcodeUnite.getText().toUpperCase(),JTnomUnite.getText().toUpperCase());
		}
	}
 } // fin actionPerformed
