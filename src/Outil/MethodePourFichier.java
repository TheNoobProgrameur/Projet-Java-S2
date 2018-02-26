package Outil;


import java.io.*;
/**
 * Cette classe fournie les methode pour ecrire et lir un fichier.
 * Elle a etait fournie durent un TP
 */
public class MethodePourFichier {

	public static Object lecture (File parFichier) throws FileNotFoundException, IOException {

		ObjectInputStream flux;
		Object objetLu = null;

		try {

			flux = new ObjectInputStream(new FileInputStream(parFichier));
			objetLu = (Object)flux.readObject();
			flux.close();

		} //finTry

		catch (ClassNotFoundException parException) {

			System.err.println(parException.toString());
			System.exit(1);

		}//finCatch

		catch(IOException parException) {

			System.err.println("Erreur de lecture du fichier" + parException.toString());
			System.exit(1);

		} //finCatch

		return objetLu;

	} //finLecture



	public static void ecriture (File parFichier, Object parObjet) {

		ObjectOutputStream flux = null;

		try {

			flux = new ObjectOutputStream(new FileOutputStream(parFichier));
			flux.writeObject(parObjet);
			flux.flush();
			flux.close();

		} //finTry


		catch(IOException parException) {

			System.err.println("Probleme a l ecriture \n" + parException.toString());
			System.exit(1);

		} //FinCatch

	} //FinEcriture


}



