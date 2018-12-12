package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PainelListar {
    private JFrame window;
    private JPanel panel;
    private JTable table;
    private AbstractTableModel modelo;

    public PainelListar() {
        window = new JFrame("Carros Cadastrados");
        panel = new JPanel();
        CarroController carroController = new CarroController();
        final List<CarroEntity> list= carroController.listar();
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


        modelo = new ModeloTabela();

        table = new JTable(modelo);
        table.setBounds(0,0,520,200);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.setSize(490,510);
        panel.add(scrollPane);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setSize(panel.getSize());
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.add(panel);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JFrame getWindow() {
        return window;
    }

    public JTable getTable() {
        return table;
    }
}
