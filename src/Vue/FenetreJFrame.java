/**
 * 
 */
package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Outil.MethodePourFichier;
import classe.DonneesGraphe;
import javafx.scene.chart.Chart;

/**
 * ici la fenetre ou tout sera inséré : comme la menubar etc...
 * @author Antoine_Berthier et fahem
 *
 */
public class FenetreJFrame extends JFrame implements ActionListener{
	
	private static Chart chart;
	private DonneesGraphe graphe;
	private JMenuBar menuBar;
	private JMenu typeGraph;
	private JMenuItem itemGrapheBaton;
	private JMenuItem itemGrapheLigne;
	private JMenuItem itemGrapheAire;
	private JMenuItem itemQuiter;
	private JMenu itemSaisie;
	private JMenuItem itemSelection;
	private JMenuItem itemCreeGraph;
	private JMenuItem itemInsertionGraph;
	private PanelContentPane panel;
	/**
	 * Constructeur de la fenetre Frame
	 */
	public FenetreJFrame(Chart parchart,DonneesGraphe parGraphe,PanelContentPane parPanel){
		super("Projet S2");
		graphe = parGraphe;
		panel = parPanel;
		
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		itemSelection = new JMenuItem("Selection du fichier");
		itemSelection.addActionListener(this);
		
		typeGraph = new JMenu("Type de Graphe");
		itemGrapheBaton = new JMenuItem("Graphe Baton");
		itemGrapheBaton.addActionListener(panel);;
		itemGrapheBaton.setActionCommand("GrapheBaton");
		typeGraph.add(itemGrapheBaton);
		itemGrapheLigne = new JMenuItem("Graphe Ligne");
		itemGrapheLigne.addActionListener(panel);;
		itemGrapheLigne.setActionCommand("GrapheLigne");
		itemGrapheAire = new JMenuItem("Graphe Aire");
		itemGrapheAire.addActionListener(panel);
		itemGrapheAire.setActionCommand("GrapheAire");
		typeGraph.add(itemGrapheBaton);
		typeGraph.add(itemGrapheLigne);
		typeGraph.add(itemGrapheAire);
		
		itemSaisie = new JMenu("Saisie");
		itemCreeGraph = new JMenuItem("nouveau doc");
		itemCreeGraph.addActionListener(this);
		itemInsertionGraph = new JMenuItem("insertion");
		itemInsertionGraph.addActionListener(this);
		itemSaisie.add(itemCreeGraph);
		itemSaisie.add(itemInsertionGraph);
		
		itemQuiter = new JMenuItem("Quitter");
		itemQuiter.addActionListener(this);
		
		menuBar.add(itemSelection);
		menuBar.add(typeGraph);
		menuBar.add(itemSaisie);
		menuBar.add(itemQuiter);
	}

	@Override
	/**
	 * ActionPerformed
	 * @param evts
	 */
	public void actionPerformed(ActionEvent evts){
		// TODO Auto-generated method stub
		//ouvre la fenetre pour choisir un nouveaux fichier
		if(evts.getSource() == itemSelection){
			JFileChooser fileChooser = new JFileChooser();
			File fichier = new File("Fichier_obj");
			fileChooser.setCurrentDirectory(fichier);
			int result = fileChooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
			    File selectedFile = fileChooser.getSelectedFile();

				try {
					graphe = (DonneesGraphe) MethodePourFichier.lecture(selectedFile);
					panel.setGraphe(graphe);
					panel.mAJ();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		//permet de quiter l'appliation
		else if(evts.getSource() == itemQuiter){
			int reponse = JOptionPane.showConfirmDialog(this, "Êtes vous sur de vouloir quitter l'application ?",
					"Dialoge de confirmation",JOptionPane.OK_CANCEL_OPTION);
			switch(reponse){
			case JOptionPane.CLOSED_OPTION:break;
			case JOptionPane.OK_OPTION:System.exit(0);break;
			case JOptionPane.CANCEL_OPTION:break;
			}
		}
		//Ouvre la fenetre pour crée un nouveau graphe
		else if(evts.getSource() == itemCreeGraph){
			new OuvertureSaisie(panel);
		}
		//Ouvre la fenetre pour insere des valeur dans le graphe utilise
		else if(evts.getSource() == itemInsertionGraph){
			new OuvertureInsertion(graphe,panel);
		}
		
	}

	/**
	 * @return the chart
	 */
	public static Chart getChart() {
		return chart;
	}

	/**
	 * @param chart the chart to set
	 */
	public static void setChart(Chart chart) {
		FenetreJFrame.chart = chart;
	}
	
	
}
