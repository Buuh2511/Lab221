package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DTO.Supplier;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class SupplierFullModel extends AbstractTableModel{
  Suppliers suppliers;

    public SupplierFullModel(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    @Override
    public int getRowCount() {
        return suppliers.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Supplier supplier = suppliers.get(rowIndex);
       Object obj=null;
       switch(columnIndex){
           case 0: obj=supplier.getSupCode();break;
           case 1: obj=supplier.getSupName();break;
           case 2: obj=supplier.getAddress();break;
           case 3: obj=supplier.isCollaborating();break;
       }return obj;
    }

    @Override
    public String getColumnName(int column) {
      String ColumnName="";
      switch(column){
          case 0: ColumnName="Code";break;
          case 1: ColumnName="Name";break;
          case 2: ColumnName="Address";break;
          case 3: ColumnName="Collaborating";break;
          
      }return ColumnName;
    }
  
    
}
