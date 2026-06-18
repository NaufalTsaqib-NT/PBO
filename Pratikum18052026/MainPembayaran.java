/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum18052026;

import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Pembayaran pembayaran= null;
        
        System.out.println("Sistem Pembayaran");
        System.out.println("Masukan ID Transaksi");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan Jumlah Bayar: ");
        double jml = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran: ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("Pilih Metode (1/2/3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.println("Masukkan Nama Bank Tujuan: ");
                     String bank= scanner.nextLine();
                     pembayaran = new Transfer(bank, jml, id);
                     break;
            case 2 : System.out.println("Metode Kartu Kredit");
                     System.out.println("Masukkan Nomor Kartu: ");
                     String nomor= scanner.nextLine();
                     pembayaran = new Kredit(nomor, jml, id);
                     break;
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.println("Masukkan Nomor Kartu: ");
                     String nama= scanner.nextLine();
                     pembayaran = new EWallet(nama, jml, id);
                     break;
        }
        System.out.println("\nKonfirmasi Bukti Pembayaran");
        pembayaran.prosesPembayaran();
    }
    
}
