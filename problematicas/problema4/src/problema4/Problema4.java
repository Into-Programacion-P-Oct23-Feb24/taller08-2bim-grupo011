/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int ola = 1; ola <= i; ola++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int ola = 1; ola <= i; ola++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
