package Vue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import classe.DonneesGraphe;

/**
 * ici la fenetre qui contient le panelsaisie
 * @author fahem et Antoine_Berthier
 *
 */
public class OuvertureSaisie extends JFrame {
	
	/**
	 * constructeur de la classe ouverturesaisie
	 * @param panel
	 */
public OuvertureSaisie(PanelContentPane panel){
		
		super("Panel de saisie");
		PanelSaisie panelSaisie =new PanelSaisie(this,panel);
		JScrollPane scrollPanelSaisie = new JScrollPane(panelSaisie, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setContentPane(scrollPanelSaisie);
		panelSaisie.setBackground(new Color(230,67,98));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400,600);setVisible(true);setLocation(200,100);
	}///FenetreMere
}