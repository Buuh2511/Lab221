/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2.S.P0111;

import java.math.BigDecimal;
/**
 *
 * @author Admin
 */
public class Calculus {
    
    double divide(double divider, double num) {
        return divider/num;
    }

    double multiply(double multiplier, double num) {
       return BigDecimal.valueOf(multiplier).multiply(BigDecimal.valueOf(num)).doubleValue();

    }

    double subtract(double sub, double num) {
        return BigDecimal.valueOf(sub).subtract(BigDecimal.valueOf(num)).doubleValue();
    }

    double add(double num1, double num2) {
         return BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2)).doubleValue();
    }

    double opposite(double num) {
        return num * -1;
    }
    double square(double num) {
        return BigDecimal.valueOf(num).multiply(BigDecimal.valueOf(num)).doubleValue();
    }

}
