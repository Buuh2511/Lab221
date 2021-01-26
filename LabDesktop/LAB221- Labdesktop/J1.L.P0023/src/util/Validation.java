/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
    public static String getString(String inpMsg, String errMsg) {
        String s;
        while (true) {
            try {
                System.out.print(inpMsg);
                s = sc.nextLine().trim();
                if (s.isEmpty()) throw new Exception();
                return s;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    public static String getString(String inpMsg, String errMsg, String format) {
        String s;
        while (true) {
            try {
                System.out.print(inpMsg);
                s = sc.nextLine().trim();
                if (s.isEmpty() || s.matches(format) == false) throw new Exception();
                return s;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    public static int getInt(String inpMsg, String errMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inpMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
    
    public static double getDouble(String msg, String errmsg) {
        double n;
        while (true) {            
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if(n <= 0) throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errmsg);
            }
        }
    }
    
    public static int getInt(String inpMsg, String errMsg, int lowBound, int uppBound) {
        int n;
        while (true) {
            try {
                System.out.print(inpMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowBound || n > uppBound) throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
}
