package Vue;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import Outil.MethodePourFichier;
import classe.Series;
import classe.DonneesGraphe;

/**
 * ici le panel d'insertion
 * @author fahem et Antoine_Berthier
 *
 */
public class PanelInsertion extends JPanel implements ActionListener,Serializable{

		GridBagLayout gestionnaireGrid = new GridBagLayout();
		GridBagConstraints contrainte = new GridBagConstraints();


		//attentions les x et y on etait inversais 
		JTextField serie1 = new JTextField("nom serie 1");
		JTextField ch1X = new JTextField("entrée la valeur Y");
		JTextField ch1Y = new JTextField("entrée la valeur X");
		JTextField ch2X = new JTextField("entrée la valeur Y");
		JTextField ch2Y = new JTextField("entrée la valeur X");
		JButton add1 = new JButton("ajouter points");
		
		JTextField serie2 = new JTextField("nom serie 2");
		JTextField ch1X2 = new JTextField("entrée la valeur Y");
		JTextField ch1Y2 = new JTextField("entrée la valeur X");
		JTextField ch2X2 = new JTextField("entrée la valeur Y");
		JTextField ch2Y2 = new JTextField("entrée la valeur X");
		JButton add2 = new JButton("ajouter points");
		
		JTextField serie3 = new JTextField("nom serie 3");
		JTextField ch1X3 = new JTextField("entrée la valeur Y");
		JTextField ch1Y3 = new JTextField("entrée la valeur X");
		JTextField ch2X3 = new JTextField("entrée la valeur Y");
		JTextField ch2Y3 = new JTextField("entrée la valeur X");
		JButton add3 = new JButton("ajouter points");
		
		JTextField serie4 = new JTextField("nom serie 4");
		JTextField ch1X4 = new JTextField("entrée la valeur Y");
		JTextField ch1Y4 = new JTextField("entrée la valeur X");
		JTextField ch2X4 = new JTextField("entrée la valeur Y");
		JTextField ch2Y4 = new JTextField("entrée la valeur X");
		JButton add4 = new JButton("ajouter points");
		
		JTextField serie5 = new JTextField("nom serie 5");
		JTextField ch1X5 = new JTextField("entrée la valeur Y");
		JTextField ch1Y5 = new JTextField("entrée la valeur X");
		JTextField ch2X5 = new JTextField("entrée la valeur Y");
		JTextField ch2Y5 = new JTextField("entrée la valeur X");
		JButton add5 = new JButton("ajouter points");
		
		JTextField serie6 = new JTextField("nom serie 6");
		JTextField ch1X6 = new JTextField("entrée la valeur Y");
		JTextField ch1Y6 = new JTextField("entrée la valeur X");
		JTextField ch2X6 = new JTextField("entrée la valeur Y");
		JTextField ch2Y6 = new JTextField("entrée la valeur X");
		JButton add6 = new JButton("ajouter points");
		
		
		
		/*JLabel valX = new JLabel("valeur en x"); // au cas ou 
		JTextField chValX = new JTextField();
		
		JLabel valY = new JLabel("valeur en y");
		JTextField chValY = new JTextField();*/
		
		JButton ajouter = new JButton("ajoute");
		
		JLabel resultat = new JLabel();
		DonneesGraphe graphe;
		JFrame Fx;

		
		/**
		 * Constructeur de la page d'insertion.
		 * @param parFM
		 * @param parGraphe
		 */
		public PanelInsertion(JFrame parFX,DonneesGraphe parGraphe,PanelContentPane panel){
			
			Fx = parFX;
			graphe = parGraphe;
			setLayout(gestionnaireGrid);
			contrainte.fill = GridBagConstraints.BOTH;
			contrainte.insets = new Insets(10,10,10,10);
			
			
			contrainte.gridx = 1;
			contrainte.gridy = 3;
			//contrainte.gridwidth = 2;
			this.add(serie1,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 4;
			//contrainte.gridwidth = 1;
			this.add(ch1X,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 4;
			//contrainte.gridwidth = 2;
			this.add(ch1Y,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 5;
			//contrainte.gridwidth = 1;
			this.add(ch2X,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 5;
			//contrainte.gridwidth = 2;
			this.add(ch2Y,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 3;
			//contrainte.gridwidth = 1;
			this.add(add1,contrainte);//bouton d'ajout
			add1.addActionListener(this);
			
			//-----------------
			
			contrainte.gridx = 1;
			contrainte.gridy = 6;
			//contrainte.gridwidth = 2;
			this.add(serie2,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 7;
			//contrainte.gridwidth = 1;
			this.add(ch1X2,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 7;
			//contrainte.gridwidth = 2;
			this.add(ch1Y2,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 8;
			//contrainte.gridwidth = 1;
			this.add(ch2X2,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 8;
			//contrainte.gridwidth = 2;
			this.add(ch2Y2,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 6;
			//contrainte.gridwidth = 1;
			this.add(add2,contrainte);//bouton d'ajout
			add2.addActionListener(this);
			
			//-----------------
			
			contrainte.gridx = 1;
			contrainte.gridy = 9;
			//contrainte.gridwidth = 2;
			this.add(serie3,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 10;
			//contrainte.gridwidth = 1;
			this.add(ch1X3,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 10;
			//contrainte.gridwidth = 2;
			this.add(ch1Y3,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 11;
			//contrainte.gridwidth = 1;
			this.add(ch2X3,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 11;
			//contrainte.gridwidth = 2;
			this.add(ch2Y3,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 9;
			//contrainte.gridwidth = 1;
			this.add(add3,contrainte);//bouton d'ajout
			add3.addActionListener(this);
			
			//-----------------
			
			contrainte.gridx = 1;
			contrainte.gridy = 12;
			//contrainte.gridwidth = 2;
			this.add(serie4,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 13;
			//contrainte.gridwidth = 1;
			this.add(ch1X4,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 13;
			//contrainte.gridwidth = 2;
			this.add(ch1Y4,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 14;
			//contrainte.gridwidth = 1;
			this.add(ch2X4,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 14;
			//contrainte.gridwidth = 2;
			this.add(ch2Y4,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 12;
			//contrainte.gridwidth = 1;
			this.add(add4,contrainte);//bouton d'ajout
			add4.addActionListener(this);
			
			//-----------------
			
			contrainte.gridx = 1;
			contrainte.gridy = 15;
			//contrainte.gridwidth = 2;
			this.add(serie5,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 16;
			//contrainte.gridwidth = 1;
			this.add(ch1X5,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 16;
			//contrainte.gridwidth = 2;
			this.add(ch1Y5,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 17;
			//contrainte.gridwidth = 1;
			this.add(ch2X5,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 17;
			//contrainte.gridwidth = 2;
			this.add(ch2Y5,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 15;
			//contrainte.gridwidth = 1;
			this.add(add5,contrainte);//bouton d'ajout
			add5.addActionListener(this);
			
			//-----------------
			
			contrainte.gridx = 1;
			contrainte.gridy = 18;
			//contrainte.gridwidth = 2;
			this.add(serie6,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 19;
			//contrainte.gridwidth = 1;
			this.add(ch1X6,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 19;
			//contrainte.gridwidth = 2;
			this.add(ch1Y6,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 20;
			//contrainte.gridwidth = 1;
			this.add(ch2X6,contrainte);
			
			contrainte.gridx = 1;
			contrainte.gridy = 20;
			//contrainte.gridwidth = 2;
			this.add(ch2Y6,contrainte);
			
			contrainte.gridx = 6;
			contrainte.gridy = 18;
			//contrainte.gridwidth = 1;
			this.add(add6,contrainte);//bouton d'ajout
			add6.addActionListener(this);
			
			//---------------
			
			contrainte.gridx = 0;
			contrainte.gridy = 21;
			//contrainte.gridwidth = 1;
			this.add(ajouter,contrainte);//bouton d'ajout
			ajouter.addActionListener(this);
			ajouter.addActionListener(panel);
			ajouter.setActionCommand("Insertion");
			
			//--------------
			
			contrainte.gridx = 6;
			contrainte.gridy = 21;
			//contrainte.gridwidth = 1;
			this.add(resultat,contrainte);//Affichage resultat
		}


	/**
	 * ActionPerformed qui agit en fonction des boutons pressés,
	 * ajoute des points dans les series a chaque pression et créer un obj DonneesGraphe des que
	 * le bouton ajouter.
	 */
		public void actionPerformed(ActionEvent evt) {

			if (evt.getSource() == add1){
				System.out.println("serie1 : "+serie1.getText());
				if(graphe.getHashMapSerie().containsKey(serie1.getText()) == false){		
					graphe.ajoutDeSerie(serie1.getText());
					System.out.println(graphe.toString());
				}			
				graphe.ajoutDeValeur(serie1.getText(), ch1Y.getText(), Integer.parseInt(ch1X.getText()));
				if(ch2Y.getText().equals("entrée la valeur X") != true){
					graphe.ajoutDeValeur(serie1.getText(), ch2Y.getText(), Integer.parseInt(ch2X.getText()));
				}
				System.out.println(graphe.toString());
				ch1X.setText("entrée la valeur Y");ch1Y.setText("entrée la valeur X");ch2Y.setText("entrée la valeur X");ch2X.setText("entrée la valeur Y");

			}
			
			if (evt.getSource() == add2){
				
				if(graphe.getHashMapSerie().containsKey(serie2.getText()) == false){
					graphe.ajoutDeSerie(serie2.getText());
				}			
				graphe.ajoutDeValeur(serie2.getText(), ch1Y2.getText(), Integer.parseInt(ch1X2.getText()));
				System.out.println("ch2Y : "+ch2Y2.getText());
				if(ch2Y2.getText().equals("entrée la valeur X") != true){
					
					graphe.ajoutDeValeur(serie2.getText(), ch2Y2.getText(), Integer.parseInt(ch2X2.getText()));
				}

				ch1X2.setText("entrée la valeur Y");ch1Y2.setText("entrée la valeur X");ch2X2.setText("entrée la valeur Y");ch2Y2.setText("entrée la valeur X");
				

			
			}
			
			if (evt.getSource() == add3){
				
				if(graphe.getHashMapSerie().containsKey(serie3.getText()) == false){
					graphe.ajoutDeSerie(serie3.getText());
				}			
				graphe.ajoutDeValeur(serie3.getText(), ch1Y3.getText(), Integer.parseInt(ch1X3.getText()));
				if(ch2Y3.getText().equals("entrée la valeur X") != true){
					graphe.ajoutDeValeur(serie3.getText(), ch2Y3.getText(), Integer.parseInt(ch2X3.getText()));
				}

				ch1X3.setText("entrée la valeur Y");ch1Y3.setText("entrée la valeur X");ch2X3.setText("entrée la valeur Y");ch2Y3.setText("entrée la valeur X");
			}
			
			if (evt.getSource() == add4){
				
				if(graphe.getHashMapSerie().containsKey(serie4.getText()) == false){
					graphe.ajoutDeSerie(serie4.getText());
				}			
				graphe.ajoutDeValeur(serie4.getText(), ch1Y4.getText(), Integer.parseInt(ch1X4.getText()));
				if(ch2Y4.getText().equals("entrée la valeur X") != true){
					graphe.ajoutDeValeur(serie4.getText(), ch2Y4.getText(), Integer.parseInt(ch2X4.getText()));
				}

				ch1X4.setText("entrée la valeur Y");ch1Y4.setText("entrée la valeur X");ch2X4.setText("entrée la valeur Y");ch2Y4.setText("entrée la valeur X");

			}
			
			if (evt.getSource() == add5){
				
				if(graphe.getHashMapSerie().containsKey(serie5.getText()) == false){
					graphe.ajoutDeSerie(serie5.getText());
				}			
				graphe.ajoutDeValeur(serie5.getText(), ch1Y5.getText(), Integer.parseInt(ch1X5.getText()));
				if(ch2Y5.getText().equals("entrée la valeur X") != true){
					graphe.ajoutDeValeur(serie5.getText(), ch2Y5.getText(), Integer.parseInt(ch2X5.getText()));
				}

				ch1X5.setText("entrée la valeur Y");ch1Y5.setText("entrée la valeur X");ch2X5.setText("entrée la valeur Y");ch2Y5.setText("entrée la valeur X");

			}
			
			if (evt.getSource() == add6){
				
				if(graphe.getHashMapSerie().containsKey(serie6.getText()) == false){
					graphe.ajoutDeSerie(serie6.getText());
				}			
				graphe.ajoutDeValeur(serie6.getText(), ch1Y6.getText(), Integer.parseInt(ch1X6.getText()));
				if(ch2Y6.getText().equals("entrée la valeur X") != true){
					graphe.ajoutDeValeur("serie6", ch2Y6.getText(), Integer.parseInt(ch2X6.getText()));
				}

				ch1X6.setText("entrée la valeur Y");ch1Y6.setText("entrée la valeur X");ch2X6.setText("entrée la valeur Y");ch2Y6.setText("entrée la valeur X");

			}

			if (evt.getSource() == ajouter){
				MethodePourFichier.ecriture(new File("Fichier_obj/"+graphe.getNomGraphe()), graphe);
				JOptionPane.showInternalMessageDialog(this,"Graphe ajouter");
				System.out.println(graphe.toString());
				System.out.println("graphe ajouter");
				Fx.setVisible(false);
			}
			
		}


	public DonneesGraphe getGraphe() {
		return graphe;
	}


	public void setGraphe(DonneesGraphe graphe) {
		this.graphe = graphe;
	}


	public GridBagLayout getGestionnaireGrid() {
		return gestionnaireGrid;
	}


	public void setGestionnaireGrid(GridBagLayout gestionnaireGrid) {
		this.gestionnaireGrid = gestionnaireGrid;
	}


	public GridBagConstraints getContrainte() {
		return contrainte;
	}


	public void setContrainte(GridBagConstraints contrainte) {
		this.contrainte = contrainte;
	}


	public JTextField getCh1X() {
		return ch1X;
	}


	public void setCh1X(JTextField ch1x) {
		ch1X = ch1x;
	}


	public JTextField getCh1Y() {
		return ch1Y;
	}


	public void setCh1Y(JTextField ch1y) {
		ch1Y = ch1y;
	}


	public JTextField getCh2X() {
		return ch2X;
	}


	public void setCh2X(JTextField ch2x) {
		ch2X = ch2x;
	}


	public JTextField getCh2Y() {
		return ch2Y;
	}


	public void setCh2Y(JTextField ch2y) {
		ch2Y = ch2y;
	}


	public JButton getAdd1() {
		return add1;
	}


	public void setAdd1(JButton add1) {
		this.add1 = add1;
	}





	public JTextField getCh1X2() {
		return ch1X2;
	}


	public void setCh1X2(JTextField ch1x2) {
		ch1X2 = ch1x2;
	}


	public JTextField getCh1Y2() {
		return ch1Y2;
	}


	public void setCh1Y2(JTextField ch1y2) {
		ch1Y2 = ch1y2;
	}


	public JTextField getCh2X2() {
		return ch2X2;
	}


	public void setCh2X2(JTextField ch2x2) {
		ch2X2 = ch2x2;
	}


	public JTextField getCh2Y2() {
		return ch2Y2;
	}


	public void setCh2Y2(JTextField ch2y2) {
		ch2Y2 = ch2y2;
	}


	public JButton getAdd2() {
		return add2;
	}


	public void setAdd2(JButton add2) {
		this.add2 = add2;
	}





	public JTextField getCh1X3() {
		return ch1X3;
	}


	public void setCh1X3(JTextField ch1x3) {
		ch1X3 = ch1x3;
	}


	public JTextField getCh1Y3() {
		return ch1Y3;
	}


	public void setCh1Y3(JTextField ch1y3) {
		ch1Y3 = ch1y3;
	}


	public JTextField getCh2X3() {
		return ch2X3;
	}


	public void setCh2X3(JTextField ch2x3) {
		ch2X3 = ch2x3;
	}


	public JTextField getCh2Y3() {
		return ch2Y3;
	}


	public void setCh2Y3(JTextField ch2y3) {
		ch2Y3 = ch2y3;
	}


	public JButton getAdd3() {
		return add3;
	}


	public void setAdd3(JButton add3) {
		this.add3 = add3;
	}



	public JTextField getCh1X4() {
		return ch1X4;
	}


	public void setCh1X4(JTextField ch1x4) {
		ch1X4 = ch1x4;
	}


	public JTextField getCh1Y4() {
		return ch1Y4;
	}


	public void setCh1Y4(JTextField ch1y4) {
		ch1Y4 = ch1y4;
	}


	public JTextField getCh2X4() {
		return ch2X4;
	}


	public void setCh2X4(JTextField ch2x4) {
		ch2X4 = ch2x4;
	}


	public JTextField getCh2Y4() {
		return ch2Y4;
	}


	public void setCh2Y4(JTextField ch2y4) {
		ch2Y4 = ch2y4;
	}


	public JButton getAdd4() {
		return add4;
	}


	public void setAdd4(JButton add4) {
		this.add4 = add4;
	}





	public JTextField getCh1X5() {
		return ch1X5;
	}


	public void setCh1X5(JTextField ch1x5) {
		ch1X5 = ch1x5;
	}


	public JTextField getCh1Y5() {
		return ch1Y5;
	}


	public void setCh1Y5(JTextField ch1y5) {
		ch1Y5 = ch1y5;
	}


	public JTextField getCh2X5() {
		return ch2X5;
	}


	public void setCh2X5(JTextField ch2x5) {
		ch2X5 = ch2x5;
	}


	public JTextField getCh2Y5() {
		return ch2Y5;
	}


	public void setCh2Y5(JTextField ch2y5) {
		ch2Y5 = ch2y5;
	}


	public JButton getAdd5() {
		return add5;
	}


	public void setAdd5(JButton add5) {
		this.add5 = add5;
	}



	public JTextField getCh1X6() {
		return ch1X6;
	}


	public void setCh1X6(JTextField ch1x6) {
		ch1X6 = ch1x6;
	}


	public JTextField getCh1Y6() {
		return ch1Y6;
	}


	public void setCh1Y6(JTextField ch1y6) {
		ch1Y6 = ch1y6;
	}


	public JTextField getCh2X6() {
		return ch2X6;
	}


	public void setCh2X6(JTextField ch2x6) {
		ch2X6 = ch2x6;
	}


	public JTextField getCh2Y6() {
		return ch2Y6;
	}


	public void setCh2Y6(JTextField ch2y6) {
		ch2Y6 = ch2y6;
	}


	public JButton getAdd6() {
		return add6;
	}


	public void setAdd6(JButton add6) {
		this.add6 = add6;
	}


	public JButton getAjouter() {
		return ajouter;
	}


	public void setAjouter(JButton ajouter) {
		this.ajouter = ajouter;
	}


	public JLabel getResultat() {
		return resultat;
	}


	public void setResultat(JLabel resultat) {
		this.resultat = resultat;
	}


	public JFrame getFx() {
		return Fx;
	}


	public void setFx(JFrame fM) {
		Fx = fM;
	}

}
