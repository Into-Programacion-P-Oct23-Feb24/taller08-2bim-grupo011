/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author UTPL
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 10;
        //
        for (int num = 30; num >= c; num--) {
            System.out.printf("%d-%d-%d-%d\n",num, num*2, num*3,
                    num*4);
        }
    }

}
