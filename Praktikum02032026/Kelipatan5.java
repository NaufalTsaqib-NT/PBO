/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum02032026;


import java.util.Scanner;

public class Kelipatan5 {
    public static void main(String[] args){
        int bilangan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===Program Menentukan Kelipatan 5 atau tidak===");
        System.out.print("\tbilangan = ");
        bilangan = in.nextInt();
        if (bilangan%5==0)
            System.out.println("\t"+ bilangan +" merupakan bilangan kelipatan 5 ");
        else 
            System.out.println("\t"+ bilangan +" BUKAN bilangan kelipatan 5");
    }
    
}
