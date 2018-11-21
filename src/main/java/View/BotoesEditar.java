package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesEditar {
    PainelEditar pe = new PainelEditar();
    private JPanel panel = new JPanel();
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");
    private JLabel label = new JLabel();

    public BotoesEditar() {
        final CarroEntity carroEntity = new CarroEntity();

        label.setText("Clique nos campos para alterá-los");
        label.setBounds(20,50,300,20);

        confirmar.setBounds(240,70,100,30);
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carroEntity.setId(Integer.valueOf((String) pe.getTable().getValueAt(0,0)));
                carroEntity.setNome((String) pe.getTable().getValueAt(0,1));
                carroEntity.setMarca((String) pe.getTable().getValueAt(0,2));
                carroEntity.setAno((String) pe.getTable().getValueAt(0,3));
                carroEntity.setPlaca((String) pe.getTable().getValueAt(0,4));
                CarroController carroController = new CarroController();
                carroController.atualizar(carroEntity);
                pe.getWindow().setVisible(false);
            }
        });

        cancelar.setBounds(360,70,100,30);
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pe.getWindow().setVisible(false);
            }
        });

        pe.getWindow().add(label);
        pe.getWindow().add(confirmar);
        pe.getWindow().add(cancelar);
    }
}
