package classe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


/**
 * la classe DonneesGraphe qui sera utilisé pour construire le 
 * graphique en un objet qui sera affiché.
 * @author fahem et Antoine_Berthier
 *
 */
public class DonneesGraphe implements Serializable {
	String nomGraphe;
	String nomX;
	String nomY;
	private HashMap <String,Series> hashMapSerie;
	//Dans la HashMAp on stock les series (leur nom est donné par la clée) et leur données (valeur).
	
	
	public DonneesGraphe(String parnomGraphe, String parNomX, String parNomY){
		
		nomGraphe = parnomGraphe;
		nomX = parNomX;
		nomY = parNomY;
		setHashMapSerie(new HashMap<String,Series>());
	}
	
	
	public void ajoutDeSerie(String nomDeLaSerie){
		hashMapSerie.put(nomDeLaSerie, new Series(nomDeLaSerie));
	}
	
	public void ajoutDeValeur(String nomDeLaSerie, String nomX, Integer valeurY){
		Series don = hashMapSerie.get(nomDeLaSerie);
		don.ajoutDeDonnees(nomX, valeurY);
	}
	
	public String getNomGraphe() {
		return nomGraphe;
	}

	public void setNomGraphe(String nomGraphe) {
		this.nomGraphe = nomGraphe;
	}

	public String getNomX() {
		return nomX;
	}

	public void setNomX(String nomX) {
		this.nomX = nomX;
	}

	public String getNomY() {
		return nomY;
	}

	public void setNomY(String nomY) {
		this.nomY = nomY;
	}

	/**
	 * @return the hashMapSerie
	 */
	public HashMap <String,Series> getHashMapSerie() {
		return hashMapSerie;
	}

	/**
	 * @param hashMapSerie the hashMapSerie to set
	 */
	public void setHashMapSerie(HashMap <String,Series> hashMapSerie) {
		this.hashMapSerie = hashMapSerie;
	}

	/**
	 * Affiche le contenu de la classe
	 */
	public String toString(){
		String message = new String();
		message = "le Graphe "+nomGraphe+" a pour abssices "+nomX+" et ordonnées "+nomY+" et comme serie :";
		Set set = hashMapSerie.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			message += "\n"+iterator.next().toString();
		}
		return message;
	}
}
