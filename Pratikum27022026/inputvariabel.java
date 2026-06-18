/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27022026;

import java.util.Scanner;

/**
* program :InpuVariabel.java
* pembuat :2501082009 Naufal Tsaqib
* tanggal : 27 Februari 2026
* Deskripsi: Penjumlahan dua bilangan bulat
 */
public class inputvariabel {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        String huruf, nama;
        int umur;
        float angka;
        
        System.out.print("Masukan sebuah bilangan huruf: ");
        huruf =  in.nextLine();
        
        System.out.print("Masukan sebuah pecahan : ");
        angka = in.nextFloat();
        System.out.println("angka = " + angka);
        in.nextLine();
        
        System.out.print("Masukan nama Anda :");
        nama = in.nextLine();
        
        System.out.print("Masukan umur Anda :");
        umur = in.nextInt();
    }
}
