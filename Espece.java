import java.util.ArrayList;

public class Espece 
{
	private int id;
	private int tauxNat;
	private int tauxProd;
	private ArrayList<Entite> e;
	
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
	
	
}
