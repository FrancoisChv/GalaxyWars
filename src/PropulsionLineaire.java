
public class PropulsionLineaire extends Propulsion
{
	public PropulsionLineaire()
	{
		super();
	}
	
	public int deplacement (int distance)
	{		
		if ((Math.abs(distance) > Constantes.PropulsionPorteeMin) &&(Math.abs(distance) > Constantes.PropulsionPorteeMax))  
			return distance;	
		else 
			return 0;
	}
	
	
}
