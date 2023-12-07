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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int filas=5;
        for (int i=1;i<filas;i++){
            for (int j=1;j<=1;j++){
            System.out.println("*");
    }
       System.out.println();
        }
       for (int i=filas-1;i>=1;i--){
           System.out.println("*"); 
       }
        System.out.println();
    }
}
