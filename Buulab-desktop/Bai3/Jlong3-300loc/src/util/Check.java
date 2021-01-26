/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dto.EmployeeDTO;
import java.util.ArrayList;

/**
 *
 * @author Buu Huynh
 */
public class Check {
    public boolean checkID(String empID, ArrayList<EmployeeDTO> list){
        int count = 0;
        if(list.isEmpty()){
            return false;
        }else{
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getEmpID().equals(empID))
                  count ++;  
            }
            if(count > 0)
                return true;
            else
                return false;
        }
    }
    public boolean isValidPhone(String phone) {
        return phone.matches("\\d{1,10}");
    }
    public boolean isValidGmail(String email) {
       String e = "\\w+@((([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
       java.util.regex.Pattern p = java.util.regex.Pattern.compile(e);
       java.util.regex.Matcher m = p.matcher(email);
       return m.matches();
    }
    public boolean isValidName(String code) {
        return code.matches("[a-zA-Z ]*");
    }
    public boolean isValidID(String code) {
        return code.matches("^[E|e]\\d{3}$");
    }
    public boolean isValidDate1(String dOB) {
        String ePattern = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(dOB);
        return m.matches();
    }
    public boolean isValidDate(String dOB) {
        String ePattern = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(dOB);
        return m.matches();
    }
}
