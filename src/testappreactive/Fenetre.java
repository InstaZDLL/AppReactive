package testappreactive;

import javax.swing.*;

public class Fenetre extends JFrame {


    // Attribus


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
