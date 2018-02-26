/**
 * 
 */
package Vue;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import classe.*;

/**
 * ici la classe qui genere le tableau affiché pres du graphe
 * @author Antoine_Berthier et fahem
 *
 */
public class PanelTable extends JPanel {
	JTable	tableDesDonnees;

	/**
	 * ici le constructeur de la classe paneltable
	 * @param parGraphe
	 */
	public PanelTable(DonneesGraphe parGraphe){
		tableDesDonnees = new JTable();
		tableDesDonnees.setModel(new ModeleDonneTable(parGraphe));
		
		//Option pour les têtes du tableau
		tableDesDonnees.getTableHeader().setBackground(new java.awt.Color(202, 229, 86) );
		tableDesDonnees.getTableHeader().setFont(new Font("Arial",Font.BOLD,20) );
		tableDesDonnees.getTableHeader().setForeground( new java.awt.Color(180, 100, 40) );

		
		tableDesDonnees.getTableHeader().setResizingAllowed(false);
		// pour empêcher les réordonnancements
		tableDesDonnees.getTableHeader().setReorderingAllowed(false); 
		// la hauteur des lignes
		tableDesDonnees.setRowHeight(20);
				
		// l’ascenseur sur la table        
		tableDesDonnees.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scroll = new JScrollPane(tableDesDonnees,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		
		// la taille de la table      
		scroll.setPreferredSize(new Dimension (300,400));
		
		// les tailles des colonnes      
		tableDesDonnees.getColumnModel().getColumn(0).setPreferredWidth(180);
		for (int i = 0 ; i <parGraphe.getHashMapSerie().keySet().size()+1 ; i++) {
			tableDesDonnees.getColumnModel().getColumn(i).setPreferredWidth(150);
		}
		
		
		this.add(scroll);
		
	}
	
}
