
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
	 * Identifiant d'une entité
	 * @return l'indentifiant de l'entité
	 */
	public int getId()
	{
		return identifiant;
	}
	
	/**
	 * Position en abscisse d'une entité
	 * @return La position en abscisse de l'entité
	 */
	public int getPosAbs()
	{
		return posAbs;
	}
	
	/**
	 * Position en ordonnée d'uneentité
	 * @return La position en abscisse de l'entité
	 */
	public int getPosOrd()
	{
		return posOrd;
	}
	
	/**
	 * Etat de la planete
	 * @return Un booléen indiquant si la planète est occupée ou non
	 */
	public boolean getOccupation()
	{
		return estOccupe;
	}
}
