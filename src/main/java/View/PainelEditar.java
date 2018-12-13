package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PainelEditar{
    private JFrame window;
    private JPanel panel;
    private JTable table;
    private DefaultTableModel modelo;
    private Integer row;
    private Integer id;
    private String[][] conteudo = new String[1][5];

    public PainelEditar() {
        window = new JFrame("Editar carro");
        panel = new JPanel();
        table = iniciaTabela(getConteudo());
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

    public JTable iniciaTabela(String[][] conteudo){
        String[] colunas = {"Id","Nome", "Marca", "Ano", "Placa"};
        System.out.println(getId());
       try {
           getId();
        }catch (Exception e){
           JOptionPane.showMessageDialog(null,"É necessário selecionar um item para poder editar");
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
        return table;
    }

    public void setConteudo(String[][] conteudo) {
        this.conteudo = conteudo;
    }

    public String[][] getConteudo() {
        return conteudo;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public JFrame getWindow() {
        return window;
    }

    public JTable getTable() {
        return table;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
