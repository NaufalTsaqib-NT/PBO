/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum06042026;

/**
 *
 * @author HYPE AMD
 */
public class MainAkunBank {
    public static void main(String[] args) {
        // Membuat objek akun dengan saldo awal 1 juta
        AkunBank ab = new AkunBank("2501082009", "Naufal", 10);

        System.out.println("=== INFORMASI AKUN ===");
        // Menampilkan saldo awal dan identitas (norek dan nama)
        ab.tampilkanInfoAwal();
        System.out.println("======================\n");

        // Skenario 1: Melakukan deposit (misal: 500 ribu)
        System.out.println(">> Melakukan deposit sebesar Rp 500000");
        ab.deposit(500000);

        // Skenario 2: Melakukan withdraw yang berhasil (misal: 200 ribu)
        System.out.println("\n>> Melakukan withdraw sebesar Rp 200000");
        ab.withdraw(200000);

        // Skenario 3: Melakukan withdraw yang gagal karena saldo tidak cukup (misal: 2 juta)
        System.out.println("\n>> Melakukan withdraw sebesar Rp 2000000");
        ab.withdraw(2000000);
    }
}