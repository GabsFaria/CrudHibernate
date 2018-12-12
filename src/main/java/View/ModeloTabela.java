package View;

import Controller.CarroController;
import Model.CarroEntity;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModeloTabela extends AbstractTableModel {
    CarroController carroController = new CarroController();
    final List<CarroEntity> list= carroController.listar();

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
            CarroEntity carroEntity = list.get(rowIndex);
            if (columnIndex == 0) {
                return carroEntity.getId();
            } else if (columnIndex == 1) {
                return carroEntity.getNome();
            } else if (columnIndex == 2) {
                return carroEntity.getMarca();
            } else if (columnIndex == 3) {
                return carroEntity.getAno();
            } else if (columnIndex == 4) {
                return carroEntity.getPlaca();
            }
            return "";
        }

}

