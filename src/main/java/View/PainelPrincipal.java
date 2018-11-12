package View;

import javax.swing.*;
import java.awt.*;

public class PainelPrincipal {

    JFrame janela;

    public void painel(){
        janela = new JFrame("Carro");
        Container container = janela.getContentPane();
        SpringLayout layout = new SpringLayout();
        container.setLayout(layout);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setSize(600,600);
        janela.setVisible(true);
    }

    public void botoes(){
        BotoesPrincipais botton = new BotoesPrincipais();
        botton.botaoInserir();
    }

}
