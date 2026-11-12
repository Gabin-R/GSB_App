package gsb.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import gsb.service.MedicamentService;

public class JIFMedicamentAjout extends JIFMedicament  implements ActionListener{

	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private JButton ajouter;
    //private int importValide;
        
    public JIFMedicamentAjout() {
        super();
        ajouter = new JButton("Ajouter");
        pBoutons.add(ajouter);
        // declaration des sources d'evenements
        ajouter.addActionListener(this);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Ajouter un Médicament");
        
        
        // recuperation des donnees Medicament dans la collection
        
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

   			MedicamentService.verifInput(JTdepotLegal.getText(),JTnomCom.getText(),JTcomposition.getText(),JTeffet.getText(),JTcontreIndication.getText(),JTprixEchantillon.getText(),JTcodeFamille.getText(),JTlibelleFamille.getText());
		}
	}
 } // fin actionPerformed
