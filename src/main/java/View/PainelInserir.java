package View;

import javax.swing.*;

public class PainelInserir {
    private JFrame janelaInserir;

    public PainelInserir(){
        janelaInserir = new JFrame("Cadastro");
        janelaInserir.setLayout(null);
        janelaInserir.pack();
        janelaInserir.setSize(250,200);
        janelaInserir.setVisible(true);
        janelaInserir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getJanelaInserir() {
        return janelaInserir;
    }
}
