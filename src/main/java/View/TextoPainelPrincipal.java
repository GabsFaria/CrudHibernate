package View;

import javax.swing.*;

public class TextoPainelPrincipal {
    BotoesPrincipais b = new BotoesPrincipais();

    public void inserirTexto(){
        JLabel text = new JLabel();
        text.setText("Sistema de gerenciamente de carros ");
        text.setBounds(10,15,300,15);
        b.painel.add(text);
        b.botaoInserir();
        b.botaoLer();
    }

}
