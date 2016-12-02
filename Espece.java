import java.util.ArrayList;

public class Espece 
{
	private int id;
	private int tauxNat;
	private int tauxProd;
	private ArrayList<Entite> e;
	
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
	
	
}
