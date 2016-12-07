import java.util.Random;


public class Propulsion 
{
	private int porteeMin;
	private int porteeMax;
	private int carburantCour; //Quantit� de carburant 
	private int carburantMax; //Quantit� maximum de carburant
	public Propulsion()
	{
		porteeMin = Constantes.PropulsionPorteeMin;
		porteeMax = Constantes.PropulsionPorteeMax;
		Random r = new Random();
		carburantMax = Math.abs(r.nextInt())%Constantes.CarburantMax+Constantes.CarburantMin;
		carburantCour = carburantMax;
	}

	/**
	 * Accesseur 
	 * @return La portée minimal de la propulsion
	 */
	public int getPorteeMin() { return porteeMin; }
	
	/**
	 * Accesseur
	 * @return La portée maximal de la propulsion
	 */
	public int getPorteeMax() { return porteeMax; }
	
	/**
	 * Accesseur
	 * @return La quantité de carburant
	 */
	public int getCarburantCour() { return carburantCour; }
	
	/**
	 * Utilisation du carburant
	 * Un d�placement d'une case correspond � l'utilisation d'un point de carburant
	 * @param distance La distance parcourue gràce � la propulsion
	 */
	public void utilisationCarburant (int distance)
	{
		carburantCour -= distance;
	}
	
	public void rechargeCarburant ()
	{
		int c = carburantCour + Constantes.Recharge;
		if (c > carburantMax)
			carburantCour = carburantMax;
		else
			carburantCour = c;
	}
}