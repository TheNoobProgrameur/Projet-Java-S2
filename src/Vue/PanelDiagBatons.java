package Vue;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import classe.Series;
import classe.DonneesGraphe;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * ici la classe qui genere la diagramme en batons
 * @author fahem et Antoine_Berthier
 *
 */
public class PanelDiagBatons{

		final CategoryAxis axeX = new CategoryAxis();
		final NumberAxis axeY = new NumberAxis();
		final BarChart <String,Number> diagBaton =
		new BarChart<String,Number>(axeX,axeY);
		
		/**
		 * constructeur de la classe paneldiagbaton
		 * @param graphe
		 */
	public PanelDiagBatons(DonneesGraphe graphe) {
		diagBaton.setTitle(graphe.getNomGraphe());
		axeX.setLabel(graphe.getNomX());
		axeY.setLabel(graphe.getNomY());
		
		//permet l'indication des noms des serie
		String n[] = new String[graphe.getHashMapSerie().keySet().size()+1];
		int cont = 0;
		for( String m : graphe.getHashMapSerie().keySet()){
			n[cont++]=m;
		}
		int nbSerie = 0;
		

		Set<Entry<String,Series>> entreesGraph = graphe.getHashMapSerie().entrySet();
		Iterator<Entry<String, Series>> iteratorGraph = entreesGraph.iterator();
		//Parcoure les dif serie de la colection de la classe DonneesGraphe
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
		
			while(iterator.hasNext()){
				//parcour les valeur des serie
				entree = iterator.next();
				valeur = entree.getValue();
				abs = entree.getKey();
				serieCourante.getData().add(new XYChart.Data(abs, valeur));
			}//While2
			diagBaton.getData().add(serieCourante);
		}//while1

	}
	
	public CategoryAxis getAxeX() {
		return axeX;
}

	public NumberAxis getAxeY() {
		return axeY;
}

	public BarChart<String, Number> getDiagBaton() {
		return diagBaton;
}
	
}
