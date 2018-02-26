package Vue;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import classe.Series;
import classe.DonneesGraphe;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * ici la classe qui genere le diagramme lineaire
 * @author fahem et Antoine_Berthier
 *
 */
public class PanelDiagLineChart {

    //defining the axes
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    //creating the chart
    final LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);
    
    /**
     * le constructeur de la classe paneldiaglinechart
     * @param graphe
     */
    public PanelDiagLineChart(DonneesGraphe graphe){
    	
    	lineChart.setTitle(graphe.getNomGraphe());
		xAxis.setLabel(graphe.getNomX());
		yAxis.setLabel(graphe.getNomY());
		
		String n[] = new String[graphe.getHashMapSerie().keySet().size()+1];
		int cont = 0;
		for( String m : graphe.getHashMapSerie().keySet()){
			n[cont++]=m;
		}
		int nbSerie = 0;
		

		Set<Entry<String,Series>> entreesGraph = graphe.getHashMapSerie().entrySet();
		Iterator<Entry<String, Series>> iteratorGraph = entreesGraph.iterator();
		//permet l'indication des noms des serie
		while(iteratorGraph.hasNext()){
			XYChart.Series serieCourante = new XYChart.Series();
			serieCourante.setName(n[nbSerie]);nbSerie++;
			Set<Entry<String,Integer>> entrees = iteratorGraph.next().getValue().getTreeMapDonnees().entrySet();
		
			Iterator<Entry<String,Integer>>iterator = entrees.iterator();
			
			Entry <String,Integer> entree;
			
			//valeur Y
			Integer valeur;
			//valeur X
			String abs;
			
			//parcour les valeur des serie
			while(iterator.hasNext()){
				entree = iterator.next();
				valeur = entree.getValue();
				abs = entree.getKey();
				serieCourante.getData().add(new XYChart.Data(abs, valeur));
			}//While2
			lineChart.setCreateSymbols(false);//suprime les points sur le graph
			lineChart.getData().add(serieCourante);
		}//while1
		
    }
}
