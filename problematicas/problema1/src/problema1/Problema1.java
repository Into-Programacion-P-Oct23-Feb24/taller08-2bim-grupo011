/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Problema1 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        String ficha = "Listado de jugadores\n";
        String listadoEdades = "Listado de Edades\n";
        int edad;
        int contadorinteracciones = 1;
        int limite;
        double estatura;
        double promedioEdades = 0;
        double promedioEstaturas = 0;
        
        
        System.out.println("Ingrese la cantidad de jugadores que va a ingresar");
        limite = entrada.nextInt();
        
        for(int i=0;i<limite;i++){
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            
            ficha = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n", 
                    ficha,
                    contadorinteracciones,
                    nombre, 
                    posicion,
                    edad,
                    estatura);
            listadoEdades = String.format("%s%d\n", 
                    listadoEdades,
                    edad);
            promedioEdades = (promedioEdades + edad) / contadorinteracciones;
            promedioEstaturas = (promedioEstaturas + estatura) / contadorinteracciones;
            contadorinteracciones = contadorinteracciones + 1;

        }
        
        System.out.printf("%s%sPromedio de edades: %.2f\n"
                + "Promedio de estaturas: %.2f\n", 
                ficha,
                listadoEdades,
                promedioEdades,
                promedioEstaturas);

    }
}
    
    

