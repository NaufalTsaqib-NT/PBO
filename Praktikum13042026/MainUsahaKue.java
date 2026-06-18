/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum13042026;

import java.util.Scanner;

/**
 *  Naufal Tsaqib
 *  2501082009
 */
public class MainUsahaKue {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Masukkan jenis(1,2)= ");
        int j = input.nextInt();
        System.out.print("Masukkan Jumlah= ");
        int jl = input.nextInt();
        UsahaKue uk = new UsahaKue(j,jl);
        System.out.print ("Total pembayaran = " +uk.hitungTotal());
        
        
    }
    
}
