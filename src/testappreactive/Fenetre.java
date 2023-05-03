package testappreactive;

import javax.swing.*;

public class Fenetre extends JFrame {


    // Attribus
    private JPanel mainPanel = new JPanel();
    private JPanel centerPanel = new JPanel();
    private  JPanel southPanel = new JPanel();
    private JLabel label = new JLabel();
    private JButton bouton1 = new JButton();
    private JButton bouton2 = new JButton();

    // Méthodes
    public Fenetre () {
        // Titre
        this.setTitle("App Reactive");

        // Dimension
        this.setSize(500, 300);

        // Position
        this.setLocationRelativeTo(null);

        // Sur fermeture
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Contenu de la fenêtre
            // Grille
                // NORD

                // CENTRE

                // SUD

            // Coller sur le ContentPane

        // Visible ?
        this.setVisible(true);
    }

}
