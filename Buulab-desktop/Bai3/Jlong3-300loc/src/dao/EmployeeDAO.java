/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.EmployeeDTO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import util.Check;

/**
 *
 * @author Buu Huynh
 */
public class EmployeeDAO {

    ArrayList<EmployeeDTO> list = new ArrayList<>();
    Check ck = new Check();

    public boolean addEmp(EmployeeDTO emp) {
        boolean result = false;
        if (!ck.checkID(emp.getEmpID(), list)) {
            list.add(emp);
            result = true;
        } else {
            JOptionPane.showMessageDialog(null, "Duplicate EmpID");
            result = false;
        }
        return result;
    }

    public ArrayList<EmployeeDTO> getEmp() {
        return list;
    }

    public boolean updateEmp(EmployeeDTO emp) {
        boolean result = false;
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "List of employees is empty");
            result = false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getEmpID().equals(emp.getEmpID())) {
                    String fullName = emp.getFullName();
                    String phone = emp.getPhone();

                    String email = emp.getEmail();
                    Date dob = emp.getDOB();
                    String address = emp.getAddress();
                    int d1 = dob.getYear();
                    long mill = System.currentTimeMillis();
                    Date currentDate = new Date(mill);
                    int d2 = currentDate.getYear();
                    if (d2 - d1 > 10 && ck.isValidPhone(phone) && phone.length() <= 15 && ck.isValidGmail(email) && ck.isValidName(fullName)) {
                        list.get(i).setFullName(fullName);
                        list.get(i).setPhone(phone);
                        list.get(i).setEmail(email);
                        list.get(i).setDOB(dob);
                        list.get(i).setAddress(address);
                        result = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Full name can't number or special character\n"
                                + "Phone is only contain number and max length is 15\n"
                                + "Email has format abc@def.gh and doesn't contain special character");
                    }
                }
            }
        }
        return result;
    }

    public boolean removeEmp(String empID) {
        boolean result = false;
        if (list.isEmpty()) {
            result = false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getEmpID().equals(empID)) {
                    list.remove(i);
                    result = true;
                }
            }
        }
        return result;
    }

    public int findEmp(String id) {
        int pos = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpID().equals(id)) {
                pos = i;
            }
        }
        return pos;
    }
}
