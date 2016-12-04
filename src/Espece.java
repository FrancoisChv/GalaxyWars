import java.util.ArrayList;

public class Espece 
{
	private int id;
	private int tauxNat;
	private int tauxProd;
	private ArrayList<Vaisseau> vaisseauPoss;
	private ArrayList<Planete> planetePoss;
	//TODO Penser à la gestion d'ajout et de suppression de vaisseau et de planète
	/**
	 * Accesseur
	 * @return L'identifiant de l'espèce
	 */
	public int getId() { return id; }
	/**
	 * Accesseur
	 * @return Le taux de natalité de l'espèce
	 */
	public int getTauxNat() { return tauxNat; }
	
	/**
	 * Accesseur
	 * @return Le taux de productivité de l'espèce
	 */
	public int getTauxProd() { return tauxProd; }
	
	
	//TODO Finir constructeur espece
	/**
	 * Constructeur
	 * @param i L'identifiant de l'espèce
	 * @param tn Le taux de natalité de l'espèce
	 * @param tp Le taux de productivité de l'espèce
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
