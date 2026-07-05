/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum09032026;

import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class TugasLatihan {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int angka; 
        int banyak=0;
        do{
            System.out.print("Masukan Angka= ");
            angka = input.nextInt();
            banyak ++;
        }while (angka<=0);
        System.out.print("\t"+banyak);
                
    }
}
