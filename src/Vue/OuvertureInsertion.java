package Vue;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import classe.DonneesGraphe;

/**
 * ici la fenetre qui va contenir le panelinsertion
 * @author fahem et Antoine_Berthier
 *
 */
public class OuvertureInsertion extends JFrame {
	/**
	 * constructeur de la classe ouvertureInsertion
	 * @param graphe
	 * @param panel
	 */
public OuvertureInsertion(DonneesGraphe graphe,PanelContentPane panel){
		
		super("Panel de insertion");
		PanelInsertion panelSaisie =new PanelInsertion(this,graphe,panel);
		JScrollPane scrollPanelSaisie = new JScrollPane(panelSaisie, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setContentPane(scrollPanelSaisie);
		panelSaisie.setBackground(new Color(230,67,98));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400,600);setVisible(true);setLocation(200,100);
	}///FenetreMere
}
