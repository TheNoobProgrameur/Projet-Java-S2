package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import classe.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.paint.Color;
/**
 * ici la la classe qui contient les differents elements du programme
 * @author Antoine_Berthier et fahem
 *
 */
public class PanelContentPane extends JPanel implements ActionListener {
	private static Chart chart;
	private static int typeDeGraphe;
	private JPanel panelTable;
	private final JFXPanel jfxPanel;
	private static DonneesGraphe graphe;
	/**
	 * Constructeur du Panel fils qui acceuil les elements du programme
	 */
	public PanelContentPane(Chart parChart,DonneesGraphe parGraphe,int typeGraphe) {
		typeDeGraphe = typeGraphe;
		graphe = parGraphe;
		chart = parChart;

		jfxPanel = new JFXPanel();
		this.add(jfxPanel);


		Platform.runLater(new Runnable() {
			public void run() {
				initFX(jfxPanel);
			}
		});
		panelTable = new PanelTable(graphe);
		this.add(panelTable);
	}

	/**
	 * 
	 * @param jfxPanel
	 */
	public void initFX(JFXPanel jfxPanel) { // This method is invoked on the EDT thread
		Group root = new Group();
		chart = initChart();
		chart.setLayoutX(80);
		root.getChildren().add(chart);
		Scene scene = new Scene(root, 700, 500, Color.ANTIQUEWHITE);
		jfxPanel.setScene(scene);
	}
	/**
	 * Choix entre les diferent type de graphe
	 * @return chart
	 */
	public static Chart  initChart(){
		if(typeDeGraphe == 0){
			//on rentre les donnees a aff a Data  et non a Children
			PanelDiagLineChart rest = new PanelDiagLineChart(graphe);
			return rest.lineChart;
		}
		else if(typeDeGraphe == 1){
			PanelDiagBatons rest = new PanelDiagBatons(graphe);
			return rest.diagBaton;
		}
		else if(typeDeGraphe == 3){
			PanelDiagAir rest = new PanelDiagAir(graphe);
			return rest.diagAire;
		}
		return chart;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "GrapheBaton"){
			typeDeGraphe = 1;
			Platform.runLater(new Runnable() {
			public void run() {
				initFX(jfxPanel);
				}
			});
		}
		else if(e.getActionCommand() == "GrapheLigne"){
			typeDeGraphe = 0;
			Platform.runLater(new Runnable() {
			public void run() {
				initFX(jfxPanel);
				}
			});
		}
		else if(e.getActionCommand() == "GrapheAire"){
			typeDeGraphe = 3;
			Platform.runLater(new Runnable() {
			public void run() {
				initFX(jfxPanel);
				}
			});
		}
		
		else if(e.getActionCommand() == "Insertion"){
			this.mAJ();
		}
	}
	
	public void mAJ(){
		Platform.runLater(new Runnable() {
			public void run() {
				initFX(jfxPanel);
			}
		});
		panelTable.setVisible(false);
		panelTable = new PanelTable(graphe);
		this.add(panelTable);
	}
	
	public DonneesGraphe getGraphe(){
		return graphe;
	}
	
	public void setGraphe(DonneesGraphe parGraphe){
		graphe = parGraphe;
	}
}
