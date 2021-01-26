/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.l.p0022;

/**
 *
 * @author DoanNC
 */
public class Calculus {

    private double memory;

    Calculus() {
        this.memory = 0;
    }

    void MC() {
        this.memory = 0;
    }

    double MR() {
        return this.memory;
    }

    void MAdd(double num) {
        this.memory += num;
    }

    void MSub(double num) {
        this.memory -= num;
    }

    double sqrt(double num) {
        return Math.sqrt(num);
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

    double divByOne(double num) {
        return 1 / num;
    }

    double divTo100(double num) {
        return num / 100;
    }
}
