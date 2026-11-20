package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class JIFMedicamentsFamilles extends JInternalFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	//private ArrayList<Medicament> lesMedicaments;
	private HashMap<String,Medicament> diccoMedicament;
	private ArrayList<String> diccoFamille;

	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JLabel JLFamille;
	protected JComboBox<String> JCFamille;
	protected JButton JBafficherFiche;
	protected MenuPrincipal fenetreContainer;
	protected JTable table;
	protected ArrayList<String> options = new ArrayList<>();

	public JIFMedicamentsFamilles(MenuPrincipal uneFenetreContainer) {

		fenetreContainer = uneFenetreContainer;
		// recuperation des donnees Medicament dans la collection
		//lesMedicaments = MedicamentDao.retournerCollectionDesMedicaments();

		//int nbLignes = lesMedicaments.size();

		
		p = new JPanel(); // panneau principal de la fenetre
		
		pSaisie = new JPanel();
		JLFamille = new JLabel("Famille");
		diccoFamille = MedicamentDao.listerFamilleMedic();
		
		for (int i = 0; i < diccoFamille.size(); i++) {
			
			options.add(diccoFamille.get(i).toString());
			
		}
		
		JCFamille = new JComboBox<String>(options.toArray(new String[0]));
		JCFamille.setMaximumSize(JCFamille.getPreferredSize());
		
		diccoMedicament = MedicamentDao.selectionnerFamilleMedic(JCFamille.getSelectedItem().toString());
		
		
		pSaisie.add(JLFamille);
		pSaisie.add(JCFamille);
		p.add(pSaisie);
		
		/*int nbLignes= diccoMedicament.size();
		
		int i=0;
		String[][] data = new String[nbLignes][6] ;
		//for(Medicament unMedicament : lesMedicaments){
		String[] columnNames = {"Dépôt Légal", "Nom Commercial","Composition","Effets","Contre Indications"};
		
		for (Map.Entry<String,Medicament> uneEntree : diccoMedicament.entrySet()){
			data[i][0] = uneEntree.getValue().getDepotLegal();
			data[i][1] = uneEntree.getValue().getNomCommercial();
			data[i][2] = uneEntree.getValue().getComposition();
			data[i][3] = uneEntree.getValue().getEffets();
			data[i][4] = uneEntree.getValue().getContreIndication();
			i++;
			}
		
		table = new JTable(data, columnNames);
		table.getSelectionModel().addListSelectionListener(table);*/
		
		JCFamille.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				diccoMedicament = MedicamentDao.selectionnerFamilleMedic(JCFamille.getSelectedItem().toString());
				
				String[] columnNames = {"Dépôt Légal", "Nom Commercial","Composition","Effets","Contre Indications"};
				
				String[][] data = null;
				int i=0;
				
				if(diccoMedicament == null) {
					int nbLignes= 1;
					
					data = new String[nbLignes][6] ;
					data[i][0] = "Aucun médicament dans cette Famille.";
					
				}
				else {
					int nbLignes= diccoMedicament.size();
					
					data = new String[nbLignes][6] ;
					for (Map.Entry<String,Medicament> uneEntree : diccoMedicament.entrySet()){
						System.out.println(uneEntree.getValue().getDepotLegal());
						data[i][0] = uneEntree.getValue().getDepotLegal();
						data[i][1] = uneEntree.getValue().getNomCommercial();
						data[i][2] = uneEntree.getValue().getComposition();
						data[i][3] = uneEntree.getValue().getEffets();
						data[i][4] = uneEntree.getValue().getContreIndication();
						i++;
					}
				}
				
				
				
				
				
				table = new JTable(data, columnNames);
				table.getSelectionModel().addListSelectionListener(table);
				scrollPane.setViewportView(table);

				
				// mise en forme de la fenetre
				Container contentPane = getContentPane();
				contentPane.add(p);
			}
		});
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		
		// mise en forme de la fenetre
		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		
	}
	
}
