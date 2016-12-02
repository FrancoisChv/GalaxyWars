
public class Entite 
{
	private int id;
	private Espece estPoss;
	
	public Entite(int i, Espece e)
	{
		id = i;
		estPoss = e;
	}
	
	public int getEntite() { return id;}
	public Espece getEstPoss() { return estPoss; }

}
