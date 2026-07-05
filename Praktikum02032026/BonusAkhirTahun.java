/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum02032026;

import java.util.Scanner;
public class BonusAkhirTahun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gol,masakerja,umur;
        long bonus = 0;
        System.out.println("===Program Bonus akhir Tahun===");
        System.out.println("golongan karyawan : \n 1. Staff\n 2. Non-staff");
        System.out.println("============================");
        System.out.print("\tGolongan anda (1/2) = ");
        gol = in.nextInt();
        System.out.print("\tLama kerja = ");
        masakerja = in.nextInt();
        System.out.print("\tusia =");
        umur = in.nextInt();
        
        switch(gol){
            case 1 :
            {
                if(masakerja>=5 && umur>=45)
                    bonus=10000000;
                else if(masakerja>=5 && umur<45)
                    bonus=7000000;
                else
                    bonus=5000000;
            }break;                          
        }
    
    }
}
