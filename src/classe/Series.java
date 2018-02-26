package classe;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
/**
 * Cette class stock les donnees
 * @author Antoine_Berthier et fahem
 *
 */
public class Series implements Serializable {
	private String nomDeLaSerie;
	private TreeMap<String,Integer> treeMapDonnees;
	// Dans la TreeMap le String est la valeur des ordonnée du graph et le Integer la valeur des abscisse
	
	
	/**
	 * Class's Constructor
	 * @param parTitre
	 * @param parNomX
	 * @param parnomY
	 */
	public Series(String parNom){
		nomDeLaSerie = parNom;
		treeMapDonnees = new TreeMap<String,Integer>();
	}
	/**
	 * Ajout d'ellements dans les donnees
	 * @param parX
	 * @param parY
	 */
	public void ajoutDeDonnees(String parX, Integer parY){
		treeMapDonnees.put(parX, parY);
	}

	/**
	 * Getter pour treeMapDonner
	 * @return the treeMapDonnees
	 */
	public TreeMap<String,Integer> getTreeMapDonnees() {
		return treeMapDonnees;
	}

	/**
	 * Setter pour treeMapDonner
	 * @param treeMapDonnees the treeMapDonnees to set
	 */
	public void setTreeMapDonnees(TreeMap<String,Integer> treeMapDonnees) {
		this.treeMapDonnees = treeMapDonnees;
	}
	
	/**
	 * permet de dire se que contient la classe
	 */
	public String toString(){
		String message = new String();
		message = "Les donnes de la serie "+nomDeLaSerie+" sont :";
		Set set = treeMapDonnees.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			message += "\n"+iterator.next().toString();
		}
		return message;
	}
	/**
	 * @return the nomDeLaSerie
	 */
	public String getNomDeLaSerie() {
		return nomDeLaSerie;
	}
	/**
	 * @param nomDeLaSerie the nomDeLaSerie to set
	 */
	public void setNomDeLaSerie(String nomDeLaSerie) {
		this.nomDeLaSerie = nomDeLaSerie;
	}
}
