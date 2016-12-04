import java.util.Random;

public class Vaisseau
{
	private int resistance; // Resistance du vaisseau
	private int integrite;  // IntÃ©gritÃ© du vaisseau (compris entre 0 et resistance)
	private Propulsion propulseur; // Type de rÃ©acteur possÃ©dÃ©
	private Equipement equipement; // Type d'Ã©quipement
	private int posX;// Position en abscisse du vaisseau
	private int posY;// Position en ordonnÃ©e du vaisseau
	
	/**
	 * Constructeur
	 * @param p Type de propulseur
	 * @param e Type d'équipement
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
			//TODO Refléchir à la gestion des déplacements en diagonal
		}
	}
	
}