import java.util.Random;

public class Vaisseau
{
	private int resistance; // Resistance du vaisseau
	private int integrite;  // Intégrité du vaisseau (compris entre 0 et resistance)
	private Propulsion propulseur; // Type de réacteur possédé
	private Equipement equipement; // Type d'équipement
	private int posX;// Position en abscisse du vaisseau
	private int posY;// Position en ordonnée du vaisseau
	
	/**
	 * Constructeur
	 * @param p Type de propulseur
	 * @param e Type d'�quipement
	 */
	public Vaisseau(Propulsion p, Equipement e,int posx, int posy)
	{
		Random r = new Random();
		resistance = Math.abs(r.nextInt())%Constantes.VaisseauResistanceMax+Constantes.VaisseauResistanceMin;
		integrite = resistance;
		propulseur = p;
		equipement = e;
		
	}
	
	public void reparation (int rep)
	{
		int nouvInte = integrite + rep;
		if (nouvInte > resistance)
			integrite = resistance;
		else
			integrite = nouvInte;
	}
	
	/**
	 * Diminution de l'int�grit�
	 * @param dommage Dommage re�u
	 */
	public void perteIntegrite(int dommage)
	{
		integrite -= dommage;
	}
	
	/**
	 * D�place le vaisseau
	 * @param x Valeur du d�placement en absisse
	 * @param y Valeur du d�placement en ordonn�e
	 */
	public void deplacement(int x, int y)
	{
		if (propulseur instanceof PropulsionLineaire)
		{	
			PropulsionLineaire p = (PropulsionLineaire) propulseur;
			if (x == 0)
					posY += p.deplacement(y);
			else if (y == 0)
					posX += p.deplacement(x);
		}
		else if (propulseur instanceof PropulsionDiagonal)
		{
			PropulsionDiagonal p = (PropulsionDiagonal) propulseur;
			//TODO Refl�chir � la gestion des d�placements en diagonal
		}
	}
	
}