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
                System.out.println(botoesEditar.pe.getRow());
                System.out.println(botoesEditar.pe.getId());
                botoesEditar.refresh(pl.getTable().getSelectedRow(),(Integer) pl.getTable().getValueAt(pl.getTable().getSelectedRow(),0));
                botoesEditar.iniciaBotoes();
                System.out.println(botoesEditar.pe.getRow());
                System.out.println(botoesEditar.pe.getId());
            }
        });

        excluir = new JButton("Excluir");
        excluir.setBounds(50,500,40,40);


        pl.getPanel().add(editar);
        pl.getPanel().add(excluir);
    }

    public Integer getRow() {
        return row;
    }
}
