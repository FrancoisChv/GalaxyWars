import java.util.ArrayList;

public class Espece 
{
	private int id;
	private int tauxNat;
	private int tauxProd;
	private ArrayList<Vaisseau> vaisseauPoss;
	private ArrayList<Planete> planetePoss;
	//TODO Penser � la gestion d'ajout et de suppression de vaisseau et de plan�te
	/**
	 * Accesseur
	 * @return L'identifiant de l'esp�ce
	 */
	public int getId() { return id; }
	/**
	 * Accesseur
	 * @return Le taux de natalit� de l'esp�ce
	 */
	public int getTauxNat() { return tauxNat; }
	
	/**
	 * Accesseur
	 * @return Le taux de productivit� de l'esp�ce
	 */
	public int getTauxProd() { return tauxProd; }
	
	
	//TODO Finir constructeur espece
	/**
	 * Constructeur
	 * @param i L'identifiant de l'esp�ce
	 * @param tn Le taux de natalit� de l'esp�ce
	 * @param tp Le taux de productivit� de l'esp�ce
	 */
	public Espece (int i, int tn, int tp)
	{
		id = i;
		tauxNat = tn;
		tauxProd = tp;
	}
	
	public void ajoutVaisseau (Vaisseau v)
	{
		vaisseauPoss.add(v);
	}
	
	public void ajoutPlanete (Planete p)
	{
		planetePoss.add(p);
	}
	
	
}
