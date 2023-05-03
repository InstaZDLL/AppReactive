package testappreactive;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Font.BOLD;

public class Fenetre extends JFrame {


    // Attribus
    private JPanel mainPanel = new JPanel();
    private JPanel centerPanel = new JPanel();
    private  JPanel southPanel = new JPanel();
    private JLabel label = new JLabel("Boujour ;)");
    private JButton bouton1 = new JButton("Bouton No 1");
    private JButton bouton2 = new JButton("Bouton No 2");

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
            mainPanel.setLayout(new BorderLayout());

                // NORD
                label.setFont(new Font("Verdana", BOLD, 16));
                label.setForeground(blue);
                label.setHorizontalAlignment(JLabel.CENTER);
                mainPanel.add(label, BorderLayout.NORTH);

                // CENTRE

                // SUD

            // Coller sur le ContentPane
            this.setContentPane(mainPanel);
        // Visible ?
        this.setVisible(true);
    }

}
