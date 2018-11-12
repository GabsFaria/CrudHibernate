package View;

import javax.swing.*;

public class BotoesPrincipais extends PainelPrincipal{

    public void botaoInserir(){
        JButton inserir = new JButton("Novo Carro");
        inserir.setBounds(10,10,120,120);
        janela.add(inserir);
    }

}
