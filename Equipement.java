import java.util.Random;

public class Equipement 
{
/*	private int dmgVaissMin;
	private int dmgVaissMax;
	private int dmgPlaneteMin;
	private int dmgPlaneteMax;
	private int recharge; */
	
	public Equipement () 
	{
		
	}
	
	public void attaqueVaisseau (Vaisseau ennemi)
	{
		Random r = new Random();
		int dmg = Math.abs(r.nextInt())%(Constantes.DmgVaissMax-Constantes.DmgVaissMin)+Constantes.DmgVaissMin+1; 
		
		ennemi.perteIntegrite(dmg);
	}
	
}
