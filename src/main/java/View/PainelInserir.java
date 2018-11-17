package View;

import javax.swing.*;

public class PainelInserir extends JDialog {
    private JDialog janela;
    private JFrame janelaInserir;

    public PainelInserir() {
        janelaInserir = new JFrame();
        janela = new JDialog(janelaInserir,"Cadastro", true);
        janela.setContentPane(janelaInserir.getContentPane());
        janelaInserir.setLayout(null);
        janelaInserir.pack();
        janelaInserir.setSize(250,220);
        janela.setBounds(janelaInserir.getBounds());
        janelaInserir.setLocationRelativeTo(null);
        janela.setModal(true);
        janela.setVisible(true);
        janelaInserir.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public JFrame getJanelaInserir() {
        return janelaInserir;
    }

    public JDialog getJanela() {
        return janela;
    }
}
