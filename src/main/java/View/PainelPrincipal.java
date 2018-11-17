package View;

import javax.swing.*;
import java.awt.*;

public class PainelPrincipal {

    private JFrame janela;

    public PainelPrincipal() {
        janela = new JFrame("Carro");
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setSize(400,280);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    public JFrame getJanela() {
        return janela;
    }
}
