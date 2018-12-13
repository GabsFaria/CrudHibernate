package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BotoesEditar {
    private JPanel panel = new JPanel();
    PainelEditar pe = new PainelEditar();
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");
    private JLabel label = new JLabel();


    public void iniciaBotoes(){
        final CarroEntity carroEntity = new CarroEntity();

        label.setText("Clique nos campos para alterá-los e aperte Enter para confirmar");
        label.setBounds(20,40,400,20);

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

    public void refresh(int row, Integer id){
        CarroController carroController = new CarroController();
        List<CarroEntity> list = carroController.listar();
        String[][] conteudo = new String[1][5];
        pe.setRow(row);
        pe.setId(id);

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId() == pe.getId())) {
                conteudo[0][0] = list.get(i).getId().toString();
                conteudo[0][1] = list.get(i).getNome();
                conteudo[0][2] = list.get(i).getMarca();
                conteudo[0][3] = list.get(i).getAno();
                conteudo[0][4] = list.get(i).getPlaca();
            }
        }
        pe.setConteudo(conteudo);
        pe.getTable().repaint();
        pe.getTable().updateUI();
    }
}
