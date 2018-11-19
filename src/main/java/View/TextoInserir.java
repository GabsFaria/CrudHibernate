package View;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class TextoInserir{
    PainelInserir pi = new PainelInserir();
    private String name;
    private String brand;
    private String year;
    private String board;
    private JTextField escrevaNome, escrevaMarca, escrevaPlaca, escrevaAno;

    public TextoInserir(){
        JLabel nome = new JLabel("Nome:");
        nome.setBounds(20,20,40,20);
        escrevaNome = new JTextField(50);
        escrevaNome.setBounds(65,20,150,20);
        JLabel marca = new JLabel("Marca:");
        marca.setBounds(20,45,40,20);
        escrevaMarca = new JTextField(50);
        escrevaMarca.setBounds(65,45,150,20);
        JLabel ano = new JLabel("Ano:");
        ano.setBounds(20,70,40,20);
//        MaskFormatter mascaraAno = null;
//        try {
//            mascaraAno = new MaskFormatter("##/##/####");
//            mascaraAno.setPlaceholderCharacter(' ');
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null,"Não foi possível criar o formato");
//        }
        escrevaAno = new JTextField();
        escrevaAno.setBounds(65,70,150,20);
        JLabel placa = new JLabel("Placa:");
        placa.setBounds(20,95,40,20);
        escrevaPlaca = new JTextField(10);
        escrevaPlaca.setBounds(65,95,150,20);

        pi.getJanelaInserir().add(nome);
        pi.getJanelaInserir().add(escrevaNome);
        pi.getJanelaInserir().add(marca);
        pi.getJanelaInserir().add(escrevaMarca);
        pi.getJanelaInserir().add(ano);
        pi.getJanelaInserir().add(escrevaAno);
        pi.getJanelaInserir().add(placa);
        pi.getJanelaInserir().add(escrevaPlaca);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public String getBoard() {
        return board;
    }

    public JTextField getEscrevaNome() {
        return escrevaNome;
    }

    public JTextField getEscrevaMarca() {
        return escrevaMarca;
    }

    public JTextField getEscrevaPlaca() {
        return escrevaPlaca;
    }

    public JTextField getEscrevaAno() {
        return escrevaAno;
    }
}
