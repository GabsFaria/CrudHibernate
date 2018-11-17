package View;

import javax.swing.*;

public class BotoesPainelInserir {
    TextoInserir text = new TextoInserir();

    public BotoesPainelInserir(){
        JButton confirmar = new JButton("Confirmar");
        confirmar.setBounds(10,130,100,30);
        text.pi.getJanelaInserir().add(confirmar);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(120,130,100,30);
        text.pi.getJanelaInserir().add(cancelar);
    }
}