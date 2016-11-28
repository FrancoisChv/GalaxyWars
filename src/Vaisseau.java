import java.util.Random;

public class Vaisseau 
{
	private int resistance; //Resistance du vaisseau
	private int integrite;  //Int�grit� du vaisseau (compris entre 0 et resistance)
	private Propulsion reacteur; //Type de r�acteur poss�d�
	private Equipement equipement; //Type d'�quipement
	// Caract�ristiques des vaisseaux
	public static final int VaisseauResistanceMin = 1; // r�sistance minimale d'un vaisseau
	public static final int VaisseauResistanceMax = 10; // r�sistance maximale d'un vaisseau
	
	/**
	 * Constructeur
	 * @param r Type de reacteur
	 * @param e Type d'�quipement
	 */
	//TODO Changer nom variable Propulsion et Equipement
	public Vaisseau(Propulsion re, Equipement e)
	{
		Random r = new Random();
		resistance = Math.abs(r.nextInt())%10+1;
		integrite = resistance;
		reacteur = re;
		equipement = e;
	}
	
	public void perteIntegrite(int dommage)
	{
		integrite -= dommage;
	}
	
	
	
}