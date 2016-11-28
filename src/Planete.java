import java.util.Random;

public class Planete extends Entite
{
	private int taille;
	private int population;
	private boolean possedeConstruction;
	
	// Caractéristiques des planètes
	public static final int PlaneteTailleMin = 10; // taille minimale d'une planète
	public static final int PlaneteTailleMax = 100; // taille maximale d'une planète
	
	/**
	 * Constructeur 
	 * @param taille Taille de la planète
	 * @param population Population de la planète.
	 */
	public Planete (int taille, int population)
	{
		this.taille = taille;
		this.population = population;
		possedeConstruction = false;
	}

	public Planete ()
	{
		Random r = new Random();
		taille = Math.abs(r.nextInt())%90+PlaneteTailleMin+1;
		population = 0;
		possedeConstruction = false;
	}
	
	/**
	 * Méthode
	 * @param tauxNat Taux de natalité de l'espèce à laquelle la planète appartient.
	 */
	public void augmentePopulation (int tauxNat)
	{
		tauxNat = tauxNat/100;
		population = Math.min(taille, population*(1+tauxNat));
	}
	
}