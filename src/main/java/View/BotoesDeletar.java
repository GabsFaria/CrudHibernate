package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesDeletar {
    PainelDeletar painelDeletar = new PainelDeletar();
    private JPanel panel = new JPanel();
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");

    public BotoesDeletar() {
        final CarroEntity carroEntity = new CarroEntity();

        confirmar.setBounds(240,60,100,30);
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carroEntity.setId(Integer.valueOf((String) painelDeletar.getTable().getValueAt(0,0)));
                carroEntity.setNome((String) painelDeletar.getTable().getValueAt(0,1));
                carroEntity.setMarca((String) painelDeletar.getTable().getValueAt(0,2));
                carroEntity.setAno((String) painelDeletar.getTable().getValueAt(0,3));
                carroEntity.setPlaca((String) painelDeletar.getTable().getValueAt(0,4));
                CarroController carroController = new CarroController();
                carroController.deletar(carroEntity);
                painelDeletar.getWindow().setVisible(false);
            }
        });

        cancelar.setBounds(360,60,100,30);
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painelDeletar.getWindow().setVisible(false);
            }
        });

        painelDeletar.getWindow().add(confirmar);
        painelDeletar.getWindow().add(cancelar);
    }
}
