import java.util.Random;


public class Propulsion 
{
	private int porteeMin;
	private int porteeMax;
	private int carburantCour; //Quantité de carburant 
	private int carburantMax; //Quantité maximum de carburant
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
	 * @return La portÃ©e minimal de la propulsion
	 */
	public int getPorteeMin() { return porteeMin; }
	
	/**
	 * Accesseur
	 * @return La portée maximal de la propulsion
	 */
	public int getPorteeMax() { return porteeMax; }
	
	/**
	 * Accesseur
	 * @return La quantitÃ© de carburant
	 */
	public int getCarburantCour() { return carburantCour; }
	
	/**
	 * Utilisation du carburant
	 * Un déplacement d'une case correspond à l'utilisation d'un point de carburant
	 * @param distance La distance parcourue grâce à la propulsion
	 */
	public void utilisationCarburant (int distance)
	{
		carburantCour -= distance;
	}
	
	public void rechargeCarburant (int recharge)
	{
		int c = carburantCour + recharge;
		if (c > carburantMax)
			carburantCour = carburantMax;
		else
			carburantCour = c;
	}
}