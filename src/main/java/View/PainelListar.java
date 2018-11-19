package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PainelListar {
    private JFrame window;
    private JPanel panel;
    private JTable table;

    public PainelListar() {
        window = new JFrame("Carros Cadastrados");
        panel = new JPanel();
        panel.setSize(500,300);
        CarroController carroController = new CarroController();
        List<CarroEntity> list= carroController.listar();
        String[][] conteudo = new String[list.size()][5];
        for (int i = 0; i<list.size(); i++){
                for (int j = 0; j<5;j++){
                    if (j==0){
                        conteudo[i][j] =list.get(i).getId().toString();
                        }else if (j==1){
                            conteudo[i][j] = list.get(i).getNome();
                            }else if (j==2){
                                conteudo[i][j] = list.get(i).getMarca();
                                }else if (j==3){
                                    conteudo[i][j] = list.get(i).getAno();
                                    }else if (j==4){
                                        conteudo[i][j] = list.get(i).getPlaca();
                                    }
                }
        }

        String[] colunas = {"Id","Nome", "Marca", "Ano", "Placa"};

        table = new JTable(conteudo,colunas);
        table.setBounds(0,10,520,250);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setSize(panel.getSize());
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.add(panel);
    }
}
