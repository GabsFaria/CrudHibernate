package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesListar {
    PainelListar pl = new PainelListar();
    private JButton editar;
    private JButton excluir;
    private Integer row;

    public BotoesListar() {
        editar = new JButton("Editar");
        editar.setBounds(10,500,40,40);
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BotoesEditar botoesEditar = new BotoesEditar();
                botoesEditar.selectItem(pl.getTable().getSelectedRow(),(Integer) pl.getTable().getValueAt(pl.getTable().getSelectedRow(),0));
                botoesEditar.iniciaBotoes();
                pl.getWindow().setVisible(false);
            }
        });

        excluir = new JButton("Excluir");
        excluir.setBounds(50,500,40,40);
        excluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BotoesDeletar botoesDeletar = new BotoesDeletar();
                botoesDeletar.selectItem(pl.getTable().getSelectedRow(),(Integer) pl.getTable().getValueAt(pl.getTable().getSelectedRow(),0));
                botoesDeletar.iniciaBotoes();
                pl.getWindow().setVisible(false);

            }
        });


        pl.getPanel().add(editar);
        pl.getPanel().add(excluir);
    }

    public Integer getRow() {
        return row;
    }
}
