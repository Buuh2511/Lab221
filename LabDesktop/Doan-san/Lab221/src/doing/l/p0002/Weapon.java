/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doing.l.p0002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author DoanNC
 */
public class Weapon {

    public static boolean isValidateUser(User user) {
        return isValidateID(user.getUserID())
                && isValidateRole(user.getRole())
                && isValidateSalary(user.getSalary());
    }

    public static boolean isValidateID(String ID) {
        return ID.matches("");
    }

    public static boolean isValidateRole(String Role) {
        return Role.matches("");
    }

    public static boolean isValidateSalary(String Salary) {
        return Salary.matches("");
    }

    public static HashMap<String, Object> loadConfig(String filename) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.trim().split("=");
                map.put(arr[0].trim(), arr[1].equalsIgnoreCase("0"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
