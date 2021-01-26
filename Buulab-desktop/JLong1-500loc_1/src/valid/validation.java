/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid;

import buuh.dtos.ItemDTO;
import buuh.dtos.SupplierDTO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dnn84
 */
public class validation {

    public boolean checkSup(SupplierDTO sup, boolean isNew, List<SupplierDTO> list) {
        if (!(sup.getSupCode().matches("^[S|s]\\d{3}$"))) {
            JOptionPane.showMessageDialog(null, "Invalid Code");
            return false;
        }
        if (sup.getSupName().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is empty");
            return false;
        }
        if (sup.getAddress().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Adrress is empty");
            return false;
        }
        if (isNew) {
            for (SupplierDTO supplier : list) {
                if (supplier.getSupCode().equals(sup.getSupCode())) {
                    JOptionPane.showMessageDialog(null, "Duplicated");
                    return false;
                }
            }
        }
        return true;
    }

    public ItemDTO checkItem(ItemDTO item, boolean isNew, List<ItemDTO> list, String code, String name, String supCode, String unit, String priceText, boolean supplying) {
        float price = 0;
        if (!(code.matches("^[I|i]\\d{3}$"))) {
            JOptionPane.showMessageDialog(null, "Invalid Code");
            return null;
        }
        if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is empty");
            return null;
        }
        if (unit.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Unit is empty");
            return null;
        }
        if (priceText.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Price is empty");
            return null;
        }
        if (isNew) {
            for (ItemDTO itemdto : list) {
                if (itemdto.getItemCode().trim().equals(code.trim())) {
                    JOptionPane.showMessageDialog(null, "Duplicated !!");
                    return null;
                }
            }
        }
        try {
            price = Float.parseFloat(priceText);
            if (price < 0) {
                JOptionPane.showMessageDialog(null, "Price must > 0");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong input");
            return null;
        }
        item = new ItemDTO(code, name, unit, supCode, price, supplying);
        return item;
    }
}
