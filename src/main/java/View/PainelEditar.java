package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PainelEditar {
    private JFrame window;
    private JPanel panel;
    private JTable table;
    private DefaultTableModel modelo;

    public PainelEditar() {
        window = new JFrame("Editar carro");
        panel = new JPanel();
        CarroController carroController = new CarroController();
        String[][] conteudo = new String[1][5];
        String[] colunas = {"Id","Nome", "Marca", "Ano", "Placa"};
        List<CarroEntity> list = carroController.listar();
        Integer id= null;
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id que deseja alterar"));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"É necessário um valor para poder iniciar a busca");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getId() == id)) {
                conteudo[0][0] = list.get(i).getId().toString();
                conteudo[0][1] = list.get(i).getNome();
                conteudo[0][2] = list.get(i).getMarca();
                conteudo[0][3] = list.get(i).getAno();
                conteudo[0][4] = list.get(i).getPlaca();
            }
        }

        modelo = new DefaultTableModel(conteudo,colunas){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (row == 0 && column ==0){
                    return false;
                }else
                    return true;
            }
        };

        table = new JTable(modelo);
        table.setBounds(10,10,520,30);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        panel.setSize(490,40);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setSize(500,150);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.add(panel);
    }

    public JFrame getWindow() {
        return window;
    }

    public JTable getTable() {
        return table;
    }
}
