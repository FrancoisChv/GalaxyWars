
public class Propulsion 
{
	private int portee;
	private int carburant;
	
	public Propulsion(int p, int c)
	{
		portee = p;
		carburant = c;
	}

	/**
	 * Accesseur 
	 * @return La port�e de la propusion
	 */
	public int getPortee() { return portee; }
	
	/**
	 * Accesseur
	 * @return La quantit� de carburant
	 */
	public int getCarburant() { return carburant; }
	
	
	
}