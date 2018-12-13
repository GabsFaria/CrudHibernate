package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BotoesDeletar {
    PainelDeletar painelDeletar = new PainelDeletar();
    private JPanel panel = new JPanel();
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");

    public void iniciaBotoes() {
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
                BotoesListar bl = new BotoesListar();
                bl.pl.getTable().updateUI();
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

    public void selectItem(int row, Integer id){
        CarroController carroController = new CarroController();
        List<CarroEntity> list = carroController.listar();
        String[][] conteudo = new String[1][5];
        painelDeletar.setRow(row);
        painelDeletar.setId(id);

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId() == painelDeletar.getId())) {
                conteudo[0][0] = list.get(i).getId().toString();
                conteudo[0][1] = list.get(i).getNome();
                conteudo[0][2] = list.get(i).getMarca();
                conteudo[0][3] = list.get(i).getAno();
                conteudo[0][4] = list.get(i).getPlaca();
            }
        }
        painelDeletar.setConteudo(conteudo);
        painelDeletar.iniciaPainel();
    }
}
