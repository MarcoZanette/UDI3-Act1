/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udiact1;
import java.util.Scanner;

/**
 *
 * @author SUPCOMERCIO
 */
public class UdiAct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Entrada de datos
        
        Scanner scan=new Scanner(System.in);
        String nombre, apellido;
        int edad;
        
        System.out.println("Ingrese sus datos.");
        System.out.print("Nombre: ");
        nombre=scan.nextLine();
        System.out.print("Apellido: ");
        apellido=scan.nextLine();
        System.out.print("Edad: ");
        edad=scan.nextInt();
        
        
    }
    
}
