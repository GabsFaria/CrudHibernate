package View;

import javax.swing.*;

public class TextoPainelPrincipal {
    BotoesPrincipais b = new BotoesPrincipais();

    public void inserirTexto(){
        JLabel text = new JLabel();
        text.setText("Olá usuário, esse programa tem o intuito de facilitar ");
        text.setBounds(10,10,300,15);
        JLabel text1 = new JLabel();
        text1.setText("a sua vida, faça bom proveito.");
        text1.setBounds(10,40,300,15);
        b.painel.add(text);
        b.painel.add(text1);
        b.botaoInserir();
        b.botaoLer();
        b.botaoEditar();
        b.botaoDeletar();
    }

}
