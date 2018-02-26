package classe;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 * Cette classe permetra de cree une table a partire d'un objet de classe DonneesGraphe
 * @author Antoine_Berthier et fahem
 *
 */
public class ModeleDonneTable extends DefaultTableModel {
	/**
	 * Constructeur pour construire la table ou seront affichés les données
	 * @param donnees
	 */
	public ModeleDonneTable(DonneesGraphe graphe){
			
			String n[] = new String[graphe.getHashMapSerie().keySet().size()+1];
			n[0] = "X";
			int cont = 1;
			for( String m : graphe.getHashMapSerie().keySet()){
				n[cont++]=m;
			}
			
			this.setColumnIdentifiers(n);
			this.setColumnCount(graphe.getHashMapSerie().keySet().size()+1);
			//le nobre de serie +1 define le nombre de colonnes
			Set m = graphe.getHashMapSerie().keySet();
			this.setRowCount(graphe.getHashMapSerie().get(m.iterator().next().toString()).getTreeMapDonnees().size());
			//le nombre de x def le nombre de ligne
			
			Set<Entry<String,Series>> entreesGraph = graphe.getHashMapSerie().entrySet();
			Iterator<Entry<String, Series>> iteratorGraph = entreesGraph.iterator();
			int indiceCol = 0;
			while(iteratorGraph.hasNext()){
				Set<Entry<String,Integer>> entrees = iteratorGraph.next().getValue().getTreeMapDonnees().entrySet();
			
				Iterator<Entry<String,Integer>>iterator = entrees.iterator();
			
				int indiceLigne = 0;
				indiceCol++;			
				Entry <String,Integer> entree;
			
				Integer valeur;
			
				while(iterator.hasNext()){
					entree = iterator.next();
					valeur = entree.getValue();
					setValueAt(entree.getKey(), indiceLigne,0);
					setValueAt(valeur, indiceLigne++,indiceCol);
				}//While2
			}//while1
	}//ModeleDonneTable()
	
	/**
	 * Empeche l'edition des cellules
	 * @return false
	 */
	public boolean isCellEditable(int indiceLigne, int indiceColonne){
		return false;
	}
	
	/**
	 * renvoie la classe des valeurs des cdiferentes collonnes
	 * @param indiceColonne
	 * @return Integer.class
	 * @return String.class
	 */
	public Class getColumn(int indiceColonne){
		if(indiceColonne == 0){
			return String.class;
		}
		else{
			return Integer.class;
		}
	}
	
}//ModelDonneeTable
