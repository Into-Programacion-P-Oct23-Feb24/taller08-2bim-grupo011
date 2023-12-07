/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author UTPL
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String acumulador = "";
        for (int fh = 20; fh <= 100; fh += 4) {
            double ct = 0;
            ct = ct + 5 / 9.0 * (fh - 32);
            acumulador = String.format("%s%.2f\n",acumulador,ct);
        }
        System.out.printf("%s", acumulador);
    }

}
