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
	
	public void perteIntegrite(int dommage)
	{
		integrite -= dommage;
	}
	
	public void deplacement(int x, int y)
	{
		if (propulseur instanceof PropulsionLineaire)
		{	
			if (x == 0)
			{
				//TODO Changer fonctionnement propulseur
					PropulsionLineaire p = (PropulsionLineaire) propulseur;
					posY += p.deplacementVertical(y);
			}
		}
	}
	
}