package Vue;

import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import classe.Series;
import classe.DonneesGraphe;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * ici la class qui genere le diagramme en aires
 * @author fahem et Antoine_Berthier
 *
 */
public class PanelDiagAir {
	


	final CategoryAxis axeX = new CategoryAxis();
	final NumberAxis axeY = new NumberAxis();
	final AreaChart <String,Number> diagAire =
	new AreaChart<String,Number>(axeX,axeY);
	
	/**
	 * constructeur de la classe paneldiagair
	 * @param graphe
	 */
	public PanelDiagAir(DonneesGraphe graphe) {
		diagAire.setTitle(graphe.getNomGraphe());
		axeX.setLabel(graphe.getNomX());
		axeY.setLabel(graphe.getNomY());
		
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
			diagAire.setCreateSymbols(false);//suprime les points sur le graph
			diagAire.getData().add(serieCourante);
		}//while1

		
	}
	
	public CategoryAxis getAxeX() {
		return axeX;
	}

	public NumberAxis getAxeY() {
		return axeY;
	}

	public AreaChart<String, Number> getDiagAire() {
		return diagAire;
	}
}
