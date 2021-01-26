/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author DELL
 * 
 */
public class Validation {

    public boolean checkInteger(String number) {
        String checkInteger = "\\d+";
        if (number.matches(checkInteger)) {
            return true;
        } else {
            return false;
        }
    }
}
