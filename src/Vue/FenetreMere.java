package Vue;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Outil.MethodePourFichier;
import classe.DonneesGraphe;
import javafx.scene.chart.Chart;
import javafx.scene.control.DialogEvent;



/**
 * ici la fenetre mere qui contient la fenetreJFrame
 * @author Antoine_Berthier et fahem
 *
 */

public class FenetreMere implements ActionListener  {
	private static Chart chart;
	private static JFrame frame;
	private static PanelContentPane panel;
	private static DonneesGraphe graphe;
	
	/**
	 * Construction de la Fenetre d'afichage
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void initAndShowGUI() throws FileNotFoundException, IOException  { // This method is invoked on the EDT thread
		JFileChooser fileChooser = new JFileChooser();
		File fichier = new File("Fichier_obj");
		fileChooser.setCurrentDirectory(fichier);
		int result = fileChooser.showOpenDialog(fileChooser);
		if (result == JFileChooser.APPROVE_OPTION) {
		   File selectedFile = fileChooser.getSelectedFile();
		   if(selectedFile.exists() == true){
			   graphe = (DonneesGraphe) MethodePourFichier.lecture(selectedFile);
		   }
		   else{
			   
			   //Panel d'option pour crée le nouveau graph
			  JOptionPane mees = new JOptionPane();
			  mees.showConfirmDialog(null,new PanelSaisie(panel));
				
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						try {
							initAndShowGUI();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					});
		   }
		}
		else if(result == JFileChooser.CANCEL_OPTION){
			System.exit(0);
		}
		panel = new PanelContentPane(chart,graphe,0);
		frame = new FenetreJFrame(chart,graphe,panel);		
		frame.setContentPane(panel);
		frame.setSize(1200, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			try {
				initAndShowGUI();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		});
	}

	/**
	 * @return the graphe
	 */
	public static DonneesGraphe getGraphe() {
		return graphe;
	}

	/**
	 * @param graphe the graphe to set
	 */
	public static void setGraphe(DonneesGraphe graphe) {
		FenetreMere.graphe = graphe;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
