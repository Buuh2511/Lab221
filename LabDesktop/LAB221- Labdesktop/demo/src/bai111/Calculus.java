/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai111;

/**
 *
 * @author Admin
 */
public class Calculus {


    Calculus() {
    }


    double sqrt(double num) {
        return Math.pow(num, 2);
    }

    double divide(double divider, double num) {
        return divider / num;
    }

    double multiply(double multiplier, double num) {
        return multiplier * num;
    }

    double subtract(double num, double sub) {
        return num - sub;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    double opposite(double num) {
        return num * -1;
    }
}
