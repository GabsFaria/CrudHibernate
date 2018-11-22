package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Confirmacao {
    private JFrame janelaConfirmacao;
    private JTable table;
    private DefaultTableModel modelo;
    private JPanel panel = new JPanel();
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");

    public void confirma(CarroEntity carroEntity) {

        Verificacao verificacao = new Verificacao(carroEntity);
        carroEntity = verificacao.getCarroEntity1();

        if ((carroEntity.getNome()==null || carroEntity.getNome().isEmpty())){
            JOptionPane.showMessageDialog(null,"Verifique se o nome foi digitado corretamente. Exemplo(Gol)");
            return;
        } else if ((carroEntity.getMarca()==null || carroEntity.getMarca().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Verifique se a marca foi digitado corretamente. Exemplo(Volkswagen)");
            return;
            }else if ((carroEntity.getAno()==null || carroEntity.getAno().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Verifique se o ano foi digitado corretamente. Exemplo(1998)");
                return;
                } else if ((carroEntity.getPlaca()==null || carroEntity.getPlaca().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Verifique se a placa foi digitado corretamente. Exemplo(ABC-1234)");
                    return;
                    }

        criaJanela(carroEntity);
    }


    public void criaJanela(final CarroEntity carroEntity){
        janelaConfirmacao = new JFrame("Confirmação");
        String[][] conteudo = new String[1][4];
        String[] colunas = {"Nome", "Marca", "Ano", "Placa"};

        conteudo[0][0] = carroEntity.getNome();
        conteudo[0][1] = carroEntity.getMarca();
        conteudo[0][2] = carroEntity.getAno();
        conteudo[0][3] = carroEntity.getPlaca();

        modelo = new DefaultTableModel(conteudo,colunas);

        table = new JTable(modelo);
        table.setBounds(10,10,520,30);
        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane, BorderLayout.CENTER);

        panel.setSize(490,40);
        janelaConfirmacao.setSize(500,150);
        janelaConfirmacao.add(panel);
        janelaConfirmacao.setLayout(null);
        janelaConfirmacao.setLocationRelativeTo(null);
        janelaConfirmacao.setVisible(true);
        janelaConfirmacao.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        confirmar.setBounds(230,60,100,40);
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                carroEntity.setNome((String) table.getValueAt(0,0));
                carroEntity.setMarca((String) table.getValueAt(0,1));
                carroEntity.setAno((String) table.getValueAt(0,2));
                carroEntity.setPlaca((String) table.getValueAt(0,3));
                CarroController carroController = new CarroController();
                carroController.inserir(carroEntity);
                janelaConfirmacao.setVisible(false);
            }
        });
        janelaConfirmacao.add(confirmar);
        cancelar.setBounds(340,60,100,40);
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                janelaConfirmacao.setVisible(false);
            }
        });
        janelaConfirmacao.add(cancelar);

    }



}
