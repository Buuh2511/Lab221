package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DTO.Item;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author admin
 */
public class ItemFullModel extends AbstractTableModel {

    Items items;

    public ItemFullModel(Items item) {
        this.items = item;
    }

    public Items getItems() {
        return items;
    }

   
    public int getRowCount() {
       return items.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item item = items.get(rowIndex);
        Object obj=null;
        switch(columnIndex){
            case 0: obj=item.getItemCode();break;
            case 1: obj=item.getItemName();break;
            case 2: obj=item.getSupplier().getSupCode();break;
            case 3: obj=item.getUnit();break;
            case 4: obj=item.getPrice();break;
            case 5: obj=item.isSupplying();break;
        }return obj;
    }

    @Override
    public String getColumnName(int column) {
        String ColumnName="";
        switch(column){
            case 0 : ColumnName="Code";break;
            case 1 : ColumnName="Name";break;
            case 2 : ColumnName="Supplier";break;
            case 3 : ColumnName="Unit";break;
            case 4 : ColumnName="Price";break;
            case 5 : ColumnName="Supplying";break;
        }
        return ColumnName;
    }
    
    

}
