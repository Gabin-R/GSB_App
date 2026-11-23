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

public class JIFVisiteurAjout extends JIFVisiteur implements ActionListener{

	/*
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private JButton ajouter;
	
	private JLabel JLlogin;
	private JLabel JLmdp;
	
	private JTextField JTlogin;
	private JPasswordField JPmdp;
	
	//TODO : Faire l'interface et l'ajout.
        
    public JIFVisiteurAjout() {
        super();
        
        JLlogin = new JLabel("Login");
        JLmdp = new JLabel("Mot de Passe");
        
        JTlogin = new JTextField(20);
        JPmdp = new JPasswordField(20);
        		
        ajouter = new JButton("Ajouter");
        
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

   			//VisiteurService.verifInput(JTdepotLegal.getText(),JTnomCom.getText(),JTcomposition.getText(),JTeffet.getText(),JTcontreIndication.getText(),JTprixEchantillon.getText(),JTcodeFamille.getText(),JTlibelleFamille.getText());
		}
	}
 } // fin actionPerformed
