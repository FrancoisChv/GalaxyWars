import java.util.Random;

public class Planete extends Entite
{
	private int taille;
	private int population;
	private boolean possedeConstruction;
	private Vaisseau construction;
	
	/**
	 * Constructeur 
	 * @param taille Taille de la planète
	 * @param population Population de la planète.
	 */
	public Planete (int id,Espece e)
	{
		super(id,e);
		Random r = new Random();
		taille = Math.abs(r.nextInt())%(Constantes.PlaneteTailleMax-Constantes.PlaneteTailleMin)+Constantes.PlaneteTailleMin+1;
		population = 0;
		possedeConstruction = false;
	}
	
	/**
	 * Augmente la population
	 * @param tauxNat Taux de natalité de l'espèce à laquelle la planète appartient.
	 */
	public void augmentePopulation (int tauxNat)
	{
		tauxNat = tauxNat/100;
		population = Math.min(taille, population*(1+tauxNat));
	}
	
	/**
	 * Diminue la population
	 * @param dommage Dommage reçu par un vaisseau
	 */
	public void pertePopulation (int dommage)
	{
		int nouvPop = population - dommage;
		if (nouvPop < 0)
			population = 0;
		else 
			population = nouvPop;
	}
	
	/**
	 * Construction du vaisseau présent sur la planète
	 */
	public void Construit()
	{
		
	}
	
	public boolean estColonisable()
	{
		if (population == 0)
				return true;
		else 
			return false;
	}
}