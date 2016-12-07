import java.util.Random;

public class Planete extends Entite
{
	private int taille;
	private int population;
	private boolean possedeConstruction;
	private int posX;
	private int posY;
	
	
	/**
	 * Constructeur 
	 * @param taille Taille de la plan�te
	 * @param population Population de la plan�te.
	 */
	public Planete (int id,Espece e,int x, int y)
	{
		super(id,e);
		Random r = new Random();
		taille = Math.abs(r.nextInt())%(Constantes.PlaneteTailleMax-Constantes.PlaneteTailleMin)+Constantes.PlaneteTailleMin+1;
		population = 0;
		possedeConstruction = false;
		posX = x;
		posY = y;
	}
	
	/**
	 * Augmente la population
	 * @param tauxNat Taux de natalit� de l'esp�ce � laquelle la plan�te appartient.
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
		Vaisseau v = new Vaisseau(id, )
	}
	
	/**
	 * Vérifie si la planète est colonisable
	 * @return true si la planète est colonisable et faux sinon
	 */
	public boolean estColonisable()
	{
		if (population == 0)
				return true;
		else 
			return false;
	}
}