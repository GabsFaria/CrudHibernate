package View;

import javax.swing.*;

public class PainelInserir extends JPanel{
    private JFrame janelaInserir;

    public PainelInserir() {
        criar();
    }

    private void criar() {
        janelaInserir = new JFrame("Cadastro");
        janelaInserir.setLayout(null);
        janelaInserir.pack();
        janelaInserir.setSize(250,210);
        janelaInserir.setLocationRelativeTo(null);
        janelaInserir.setVisible(true);
    }

    public JFrame getJanelaInserir() {
        return janelaInserir;
    }
}
