import java.util.Random;

public class Vaisseau extends Entite
{
	private int resistance; // Resistance du vaisseau
	private int integrite;  // Intégrité du vaisseau (compris entre 0 et resistance)
	private Propulsion propulseur; // Type de réacteur possédé
	private Equipement equipement; // Type d'équipement

	
	/**
	 * Constructeur
	 * @param p Type de propulseur
	 * @param e Type d'équipement
	 */
	public Vaisseau(int i,Espece esp,int x, int y, Propulsion p, Equipement e)
	{
		super(i,esp,x,y);
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
	 * Diminution de l'intégrité
	 * @param dommage Dommage reçu
	 */
	public void perteIntegrite(int dommage)
	{
		integrite -= dommage;
	}
	
	/**
	 * Déplace le vaisseau
	 * @param x Valeur du déplacement en absisse
	 * @param y Valeur du déplacement en ordonnée
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