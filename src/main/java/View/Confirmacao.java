package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Confirmacao {
    private JFrame janelaConfirmacao;
    private JButton confirmar = new JButton("Confirmar");
    private JButton cancelar = new JButton("Cancelar");
    private JLabel resultado;

    public void confirma(CarroEntity carroEntity) {

        carroEntity.getNome().replace("_", "").replace("*", "").replace(",", "")
                .replace(".", "");

        carroEntity.getMarca().replace("_", "").replace("*", "").replace(",", "")
                .replace(".", "");

        Integer anoFormatado = Integer.parseInt(carroEntity.getAno().replace("/"," ").replace(" ", ""));
        try {
            carroEntity.getAno().replace("/"," ").replace(" ", "").compareTo(anoFormatado.toString());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Verificar se o ano foi digitado corretamente");
        }

        carroEntity.getPlaca().replace("_", "").replace("*", "").replace(",", "")
                .replace(".", "");

        criaJanela(carroEntity);
    }


    public void criaJanela(final CarroEntity carroEntity){
        janelaConfirmacao = new JFrame("Confirmação");
        janelaConfirmacao.setSize(470,150);
        janelaConfirmacao.setLayout(null);
        janelaConfirmacao.setLocationRelativeTo(null);
        janelaConfirmacao.setVisible(true);
        janelaConfirmacao.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        String carro = carroEntity.toString();
        resultado = new JLabel(carro);
        resultado.setBounds(10,10,460,25);
        janelaConfirmacao.add(resultado);
        confirmar.setBounds(230,60,100,40);
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
