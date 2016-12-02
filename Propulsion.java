import java.util.Random;


public class Propulsion 
{
	private int porteeMin;
	private int porteeMax;
	private int carburant;
	
	public Propulsion()
	{
		porteeMin = Constantes.PropulsionPorteeMin;
		porteeMax = Constantes.PropulsionPorteeMax;
		Random r = new Random();
		carburant = Math.abs(r.nextInt())%Constantes.CarburantMax+Constantes.CarburantMin;
	}

	/**
	 * Accesseur 
	 * @return La portée minimal de la propusion
	 */
	public int getPorteeMin() { return porteeMin; }
	
	public int getPorteeMax() { return porteeMax; }
	
	/**
	 * Accesseur
	 * @return La quantité de carburant
	 */
	public int getCarburant() { return carburant; }
	
}