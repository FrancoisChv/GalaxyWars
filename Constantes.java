
public class Constantes {
	// Caract�ristiques de la galaxie
	public static final int Largeur = 20; // largeur de la grille galactique (en nombre de cases)
	public static final int Hauteur = 15; // hauteur de la grille galactique (en nombre de cases)
	
	// Caract�ristiques des plan�tes
	public static final int PlaneteTailleMin = 10; // taille minimale d'une plan�te
	public static final int PlaneteTailleMax = 100; // taille maximale d'une plan�te
	
	// Caracteristiques des equipements
	// Dommages sur vaisseaux ennemis
	public static final int DmgVaissMin = 1;
	public static final int DmgVaissMax = 3;
	// Dommages sur planete
	public static final int DmgPlaneteMin = 5;
	public static final int DmgPlaneteMax = 10;
	
	// Caract�ristiques des vaisseaux
	public static final int VaisseauResistanceMin = 1; // r�sistance minimale d'un vaisseau
	public static final int VaisseauResistanceMax = 10; // r�sistance maximale d'un vaisseau
	
	// Caract�ristiques des propulsions
	public static final int PropulsionPorteeMin = 1; // port�e minimal d'une propulsion
	public static final int PropulsionPorteeMax = 5; // port�e maximal d'une propulsion
	
	//Quantité de carburant 
	public static final int CarburantMin = 10;
	public static final int CarburantMax = 20;
	// Param�tres de la simulation
	public static final int TourMax = 30; // nombre de tours maximum
	public static final int TourMs = 2000; // dur�e d'un tour en millisecondes
	
	// Param�tres d'affichage
	public static final int GfxCase = 40; // taille des cases en pixel
	public static final int GfxPlaneteBase = 20; // taille de base des plan�tes en pixels
	public static final int GfxPlaneteFacteur = 5; // proportion des plan�tes relative � leur taille
	public static final int GfxVaisseauBase = 5; // taille de base des vaisseaux en pixels
	public static final int GfxVaisseauFacteur = 1; // proportion des vaisseaux relative � leur r�sistance
}