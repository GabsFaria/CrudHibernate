package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesPainelInserir {
    TextoInserir text = new TextoInserir();

    public void botoes(){
        JButton confirmar = new JButton("Confirmar");
        confirmar.setBounds(10,130,100,30);
        confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setName(text.getEscrevaNome().getText());
                text.setBrand(text.getEscrevaMarca().getText());
                text.setYear(text.getEscrevaAno().getText());
                text.setBoard(text.getEscrevaPlaca().getText());
                CarroEntity carroEntity = new CarroEntity();
                carroEntity.setNome(text.getName());
                carroEntity.setMarca(text.getBrand());
                carroEntity.setAno(text.getYear());
                carroEntity.setPlaca(text.getBoard());
                Confirmacao confirmacao = new Confirmacao();
                confirmacao.confirma(carroEntity);
                text.pi.getJanelaInserir().setVisible(false);
            }
        });
        text.pi.getJanelaInserir().add(confirmar);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(120,130,100,30);
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.pi.getJanelaInserir().setVisible(false);
            }
        });
        text.pi.getJanelaInserir().add(cancelar);
    }
}