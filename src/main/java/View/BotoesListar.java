package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesListar {
    PainelListar pl = new PainelListar();
    private JButton editar;
    private JButton excluir;

    public BotoesListar() {
        editar = new JButton("Editar");
        editar.setBounds(10,500,40,40);
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BotoesEditar botoesEditar = new BotoesEditar();
                pl.getTable();
            }
        });

        excluir = new JButton("Excluir");
        excluir.setBounds(50,500,40,40);


        pl.getPanel().add(editar);
        pl.getPanel().add(excluir);
    }

}
