/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claces.y.objetos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Marca");
        String marca = sc.nextLine();
        System.out.println("Digite Modelo");
        String modelo = sc.nextLine();
        System.out.println("Digite Año");
        Short anio = Short.parseShort(sc.nextLine());
        
        Vehiculo tuVehiculo = new Vehiculo(marca, modelo, anio);
        
        System.out.println("Mi vehiculo es: " + miVehiculo.mostrarDatos());
        System.out.println("Tu vehiculo es: "+tuVehiculo.mostrarDatos());
    }
    
}
