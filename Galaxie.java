import java.util.ArrayList;

public class Galaxie 
{
	private ArrayList<Vaisseau> vaisseauPres;
	private ArrayList<Planete> planetePres;
	
	public void ajoutPlanete(Planete p)
	{
		planetePres.add(p);
	}
	
	public void ajoutVaisseau(Vaisseau v)
	{
		vaisseauPres.add(v);
	}
}
