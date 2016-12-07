
public class Entite 
{
	private int id;
	private Espece estPoss;
	private int posX;// Position en abscisse du vaisseau
	private int posY;// Position en ordonnée du vaisseau
	
	public Entite(int i, Espece e, int x, int y)
	{
		id = i;
		estPoss = e;
		posX = x;
		posY = y;
	}
	
	public int getEntite() { return id; }
	public Espece getEstPoss() { return estPoss; }
	public int getPosX() { return posX; }
	public int getPosY() { return posY; }

}
