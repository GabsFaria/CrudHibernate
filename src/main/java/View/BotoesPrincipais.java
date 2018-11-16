package View;

import javax.swing.*;

public class BotoesPrincipais{
    PainelPrincipal pp = new PainelPrincipal();
    JFrame painel = pp.getJanela();

    public void botaoInserir(){
        JButton inserir = new JButton("Novo Carro");
        inserir.setBounds(10,100,150,40);
        painel.add(inserir);
    }

    public void botaoLer(){
        JButton ler = new JButton("Mostrar carros");
        ler.setBounds(200,100,150,40);
        painel.add(ler);
    }

    public void botaoEditar(){
        JButton editar = new JButton("Editar Carros");
        editar.setBounds(10,160,150,40);
        painel.add(editar);
    }

    public void botaoDeletar(){
        JButton deletar = new JButton("Excluir carro");
        deletar.setBounds(200,160,150,40);
        painel.add(deletar);
    }

}
