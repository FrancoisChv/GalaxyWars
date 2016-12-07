import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @brief Classe permettant de r�aliser un affichage graphique de la galaxie
 * 
 * La grille galactique est repr�sent�e graphiquement dans un panneau, les 
 * cases �tant num�rot�es � partir du coin sup�rieur gauche (0,0) jusqu'au
 * coin inf�rieur droit (Largeur,Hauteur) 
 */
public final class Affichage extends JPanel {
	private static final long serialVersionUID = 1L;

	// Largeur et hauteur du panel graphique, calcul�s une seule fois � la construction
	private int larg, haut;

	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	// CODE FACTICE POUR ILLUSTRER LE MECANISME D'AFFICHAGE
	private ArrayList<int[]> lesPlanetes;
	private ArrayList<int[]> lesVaisseaux;
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	
	/**
	 * @brief Constructeur initialisant le panneau d'affichage
	 */
	// TODO : � compl�ter pour faire le lien entre la galaxie et le panneau d'affichage ...
	public Affichage() {
		// calcul des dimensions du panneau en fonction des param�tres de la galaxie
		larg = Constantes.Largeur*Constantes.GfxCase;
		haut = Constantes.Hauteur*Constantes.GfxCase;
		setPreferredSize(new Dimension(larg,haut));
	}

	/**
	 * @brief Efface le contenu du panneau en red�ssiantn le fond et la grille
	 * @param g Objet graphique permettant de dessiner dans le panneau
	 */
	public void efface(Graphics g) {
		// espace galactique : fond noir
		g.setColor(Color.BLACK);
		g.fillRect(0,0,larg,haut);
		// grille galactique : lignes grises
		g.setColor(Color.GRAY);
		for (int x=Constantes.GfxCase ; x<larg; x+=Constantes.GfxCase) {
			// affichage des lignes verticales
			g.drawLine(x, 0, x, haut);
		}
		for (int y=Constantes.GfxCase ; y<haut; y+=Constantes.GfxCase) {
			// affichage des lignes horizontales
			g.drawLine(0, y, larg, y);
		}
	}

	/**
	 * @brief Affiche une plan�te selon ses caract�ristiques
	 * @param g Objet graphique permettant de dessiner dans le panneau
	 * @param x Abcisse de la case contenant la plan�te 
	 * @param y Ordonn�e de la case contenant la plan�te
	 * @param t Taille de la plan�te
	 * @param c Couleur de la plan�te
	 */
	public void affichePlanete(Graphics g, int x, int y, int t, Color c) {
		// calcul des coordonn�es graphiques du centre de la plan�te
		int xg = x*Constantes.GfxCase + Constantes.GfxCase/2;
		int yg = y*Constantes.GfxCase + Constantes.GfxCase/2;
		// calcul du rayon de la plan�te selon sa taille
		int tg = Constantes.GfxPlaneteBase + t/Constantes.GfxPlaneteFacteur;
		// affichage
		g.setColor(c);
		g.fillOval(xg-tg/2,yg-tg/2,tg,tg);
	}
	
	/**
	 * @brief Affiche un vaisseau selon ses caract�ristiques
	 * @param g Objet graphique permettant de dessiner dans le panneau
	 * @param x Abcisse de la case contenant le vaisseau 
	 * @param y Ordonn�e de la case contenant le vaisseau
	 * @param r R�sistance du vaisseau
	 * @param s Cha�ne symbolisant la propulsion et l'�quipement du vaisseau
	 * @param c Couleur du vaisseau
	 */
	public void afficheVaisseau(Graphics g, int x, int y, int r, String s, Color c) {
		// calcul des coordonn�es graphiques du centre de la plan�te
		int xg = x*Constantes.GfxCase + Constantes.GfxCase/2;
		int yg = y*Constantes.GfxCase + Constantes.GfxCase/2;
		// calcul du c�t� du vaisseau selon sa taille
		int tg = Constantes.GfxVaisseauBase + r/Constantes.GfxVaisseauFacteur;
		// affichage du carr�
		g.setColor(c);
		g.fillRect(xg-tg/2,yg-tg/2,tg,tg);
		// calcul des dimensions graphiques de la cha�ne � afficher
		int lg = (int)Math.ceil(g.getFont().getStringBounds(s,((Graphics2D)g).getFontRenderContext()).getWidth());
		int hg = (int)Math.ceil(g.getFont().getStringBounds(s,((Graphics2D)g).getFontRenderContext()).getHeight());
		// affichage de la cha�ne sur le carr�
		g.setColor(Color.WHITE);
		g.drawString(s, xg-lg/2, yg+hg/2);
	}

	/**
	 * @brief Provoque le rafraichissement du panneau
	 */
	// TODO : modifier la signature au besoin 
	@SuppressWarnings("unchecked")
	public void rafraichir(ArrayList<int[]> planetes, ArrayList<int[]> vaisseaux) {
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		// CODE FACTICE POUR ILLUSTRER LE MECANISME D'AFFICHAGE
		lesPlanetes = (ArrayList<int[]>) planetes.clone(); // recopie la liste pour �viter des probl�mes de synchronisation
		lesVaisseaux =(ArrayList<int[]>) vaisseaux.clone(); // recopie la liste pour �viter des probl�mes de synchronisation
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		repaint();
	}

	/**
	 * @brief R�affiche le panneau � la demande
	 * @param g Objet graphique permettant de dessiner dans le panneau
	 */
	// @override
	public void paintComponent(Graphics g) {
		// affichage par d�faut
		super.paintComponent(g);

		// l'espace et la grille galactique
		efface(g);
		
		g.setXORMode(Color.BLACK);

		// affichage des plan�tes et vaisseaux
		// TODO : � compl�ter
		
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		// CODE FACTICE POUR ILLUSTRER LE MECANISME D'AFFICHAGE
		for (int[] p : lesPlanetes) {
			affichePlanete(g,p[0],p[1],p[2],new Color(p[3],p[4],p[5]));
		}
		for (int[] p : lesVaisseaux) {
			afficheVaisseau(g,p[0],p[1],p[2],"+p",new Color(p[3],p[4],p[5]));
		}
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////
	}
	
}