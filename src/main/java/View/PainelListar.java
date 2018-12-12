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


        modelo = new AbstractTableModel(){
            @Override
            public int getRowCount() {
                return list.size();
            }

            @Override
            public int getColumnCount() {
                return 5;
            }

            @Override
            public String getColumnName(int column){
                if (column==0){
                    return "Id";
                }
                if (column==1){
                    return "Nome";
                }
                if (column==2){
                    return "Marca";
                }
                if (column==3){
                    return "Ano";
                }
                if (column==4){
                    return "Placa";
                }
                return "";
            }

            @Override
            public boolean isCellEditable(int row, int column){
                for (column = 0; column<5; column++){
                    for (row= 0; row<list.size(); row++){
                        if (row==0){
                            while (row!=5){
                                return false;
                            }
                        }else
                            return true;
                    }
                }
                return true;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return null;
            }
        };

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
