import java.util.Random;

public class Planete extends Entite
{
	private int taille;
	private int population;
	private boolean possedeConstruction;
	
	// Caract�ristiques des plan�tes
	public static final int PlaneteTailleMin = 10; // taille minimale d'une plan�te
	public static final int PlaneteTailleMax = 100; // taille maximale d'une plan�te
	
	/**
	 * Constructeur 
	 * @param taille Taille de la plan�te
	 * @param population Population de la plan�te.
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
	 * M�thode
	 * @param tauxNat Taux de natalit� de l'esp�ce � laquelle la plan�te appartient.
	 */
	public void augmentePopulation (int tauxNat)
	{
		tauxNat = tauxNat/100;
		population = Math.min(taille, population*(1+tauxNat));
	}
	
}