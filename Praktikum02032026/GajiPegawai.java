/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum02032026;

import java.util.Scanner;
public class GajiPegawai {
    public static void main(String[] args){
        int upahreguler = 50000;
        int upahlembur = 70000;
        int jamkerjareguler, jamkerjalembur, gajisebulan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Menghitung Gaji Bulanan Pegawai===");
        System.out.print("\tjam kerja reguler = ");
        jamkerjareguler = input.nextInt();
        System.out.print("\tJam kerja lembur =");
        jamkerjalembur = input.nextInt();
        gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
        System.out.print("\tGaji pegawai bulan ini ="+gajisebulan);
    }
}
