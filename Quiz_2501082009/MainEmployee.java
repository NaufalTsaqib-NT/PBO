/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Quiz_2501082009;

import java.util.Scanner;

/**
 *
 * @author HYPE AMD
 */
public class MainEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== INPUT DATA KARYAWAN ===");
        
        System.out.print("Masukkan ID Karyawan   : ");
        int idInput = input.nextInt();
        input.nextLine(); 
        
        System.out.print("Masukkan Nama Depan    : ");
        String firstNameInput = input.nextLine();
        
        System.out.print("Masukkan Nama Belakang : ");
        String lastNameInput = input.nextLine();
        
        System.out.print("Masukkan Gaji Bulanan  : ");
        int salaryInput = input.nextInt();
        
        Employee emp = new Employee(idInput, firstNameInput, lastNameInput, salaryInput);
        
        System.out.println("\n=== DATA KARYAWAN BERHASIL DISIMPAN ===");
        System.out.println("Data Awal        : " + emp.toString());
        System.out.println("Gaji Setahun     : Rp " + emp.getAnnualSalary());
        System.out.println("\n=== PERHITUNGAN KENAIKAN GAJI ===");
        System.out.print("Masukkan Persentase Kenaikan Gaji (%): ");
        int persen = input.nextInt();
        emp.raiseSalary(persen);
        System.out.println("\n=== DATA SETELAH GAJI NAIK ===");
        System.out.println("Data Terbaru     : " + emp.toString());
        System.out.println("Gaji Setahun Baru: Rp " + emp.getAnnualSalary());
        System.out.println("=======================================");
    }
}
