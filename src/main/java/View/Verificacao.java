package View;

import Model.CarroEntity;

import javax.swing.*;

public class Verificacao {
    private Integer anoFormatado;
    CarroEntity carroEntity1 = new CarroEntity();

    public Verificacao(CarroEntity carroEntity){
        carroEntity1 = carroEntity;
        if (carroEntity.getNome()!=null || !carroEntity.getNome().isEmpty()) {
            carroEntity.getNome().replace("_", "").replace("*", "").replace(",", "")
                    .replace(".", "");
        } else{
            return;
        }

        if (carroEntity.getMarca()!=null) {
            carroEntity.getMarca().replace("_", "").replace("*", "").replace(",", "")
                    .replace(".", "");
        } else {
            return;
        }
        try {
            anoFormatado = Integer.parseInt(carroEntity.getAno().replace("/"," ").replace(" ", ""));
        }catch (Exception e){
            return;
        }
        try {
            carroEntity.getAno().replace("/"," ").replace(" ", "").compareTo(anoFormatado.toString());
        } catch (Exception e){
            return;
        }

        if (carroEntity.getPlaca()!=null) {
            carroEntity.getPlaca().replace("_", "").replace("*", "").replace(",", "")
                    .replace(".", "");
        } else {
            return;
        }
    }

    public CarroEntity getCarroEntity1() {
        return carroEntity1;
    }
}
