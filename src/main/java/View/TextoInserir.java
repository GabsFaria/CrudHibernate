package View;

import javax.swing.*;

public class TextoInserir{
    PainelInserir pi = new PainelInserir();
    private JFrame janela = pi.getJanelaInserir();

    public TextoInserir() {
        JLabel nome = new JLabel("Nome:");
        nome.setBounds(20,20,40,20);
        JTextField escrevaNome = new JTextField("Name example",50);
        escrevaNome.setBounds(65,20,150,20);
        JLabel marca = new JLabel("Marca:");
        marca.setBounds(20,45,40,20);
        JTextField escrevaMarca = new JTextField(" Brand example",50);
        escrevaMarca.setBounds(65,45,150,20);
        JLabel ano = new JLabel("Ano:");
        ano.setBounds(20,70,40,20);
        JTextField escrevaAno = new JTextField("Year example",4);
        escrevaAno.setBounds(65,70,150,20);
        JLabel placa = new JLabel("Placa:");
        placa.setBounds(20,95,40,20);
        JTextField escrevaPlaca = new JTextField("Board example",10);
        escrevaPlaca.setBounds(65,95,150,20);
        janela.add(nome);
        janela.add(escrevaNome);
        janela.add(marca);
        janela.add(escrevaMarca);
        janela.add(ano);
        janela.add(escrevaAno);
        janela.add(placa);
        janela.add(escrevaPlaca);
    }
}
