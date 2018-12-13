package View;

import javax.swing.*;
import java.awt.*;

public class PainelPrincipal {

    private JFrame janela;

    public PainelPrincipal() {
        janela = new JFrame("Carros");
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setSize(350,130);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    public JFrame getJanela() {
        return janela;
    }
}
