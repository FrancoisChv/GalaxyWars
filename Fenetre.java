import javax.swing.JFrame;

/**
 * @brief Classe engendrant une fen�tre principale d'application associ�e � un panneau
 */
public class Fenetre extends JFrame {
	private static final long serialVersionUID = 1L;

	public Fenetre(Affichage pan) {
		// titrage de la fen�tre
		super("Galaxy Wars (alpha)");
		
		// r�glage des param�tres
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);

		// ajout de la grille
		getContentPane().add(pan);
		pack();
		
		// affichage centr�
		setVisible(true);
		setLocationRelativeTo(null);
	}
}