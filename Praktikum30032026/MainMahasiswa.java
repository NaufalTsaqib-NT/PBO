/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum30032026;
import java.util.Scanner;
/**
 *
 * @author LAB-SI-PC
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa ();

        Scanner input = new Scanner (System.in);
        System.out.println("Nilai Akhir Mahasiswa");
        System.out.print("Tugas = ");
        double Tugas = input.nextDouble();
        System.out.print("UTS = ");
        double UTS = input.nextDouble();
        System.out.print("Uas = ");
        double UAS = input.nextDouble();
        System.out.println("Nilai Akhir = "+mhs1.hitungNilai());
        
    }
    
}
