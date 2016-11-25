
public class Entite 
{
	private int identifiant;
	private int posAbs;
	private int posOrd;
	private boolean estOccupe;
	
	/**
	 * Constructeur d'entité
	 * @param id L'identifiant de l'entité
	 * @param x La position en abscisse de l'entité
	 * @param y La position en ordonnée de l'entité
	 */
	public Entite(int id, int x, int y)
	{
		identifiant = id;
		posAbs = x;
		posOrd = y;
		estOccupe = false;
	}
	
	/**
	 * Accesseur donnant l'identifiant de l'entité
	 * @return
	 */
	public int getId()
	{
		return identifiant;
	}
	
	public int getPosAbs()
	{
		return posAbs;
	}
	
	public int getPosOrd()
	{
		return posOrd;
	}
	
	public boolean getOccupation()
	{
		return estOccupe;
	}

}
