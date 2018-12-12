package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesPrincipais{
    PainelPrincipal pp = new PainelPrincipal();
    JFrame painel = pp.getJanela();

    public void botaoInserir(){
        JButton inserir = new JButton("Novo Carro");
        inserir.setBounds(10,40,150,40);
        inserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BotoesPainelInserir button = new BotoesPainelInserir();
                button.botoes();
            }
        });
        painel.add(inserir);
    }

    public void botaoLer(){
        JButton ler = new JButton("Mostrar carros");
        ler.setBounds(180,40,150,40);
        ler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BotoesListar bl = new BotoesListar();
            }
        });
        painel.add(ler);
    }

    public void botaoEditar(){
        JButton editar = new JButton("Editar Carros");
        editar.setBounds(10,100,150,40);
        editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BotoesEditar botoesEditar = new BotoesEditar();
            }
        });
        painel.add(editar);
    }

    public void botaoDeletar(){
        JButton deletar = new JButton("Excluir carro");
        deletar.setBounds(180,100,150,40);
        deletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BotoesDeletar botoesDeletar = new BotoesDeletar();
            }
        });
        painel.add(deletar);
    }

}
