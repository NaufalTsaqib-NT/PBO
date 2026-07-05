/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum06042026;

/**
 *
 * @author HYPE AMD
 */
public class MainMahasiswaEnkapsulasi {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN KONSTRUKTOR 1 (KOSONG) ===");
        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi();
        mhs1.setNama("Naufal");
        mhs1.setNim("2501082009");
        mhs1.setJurusan("Teknik Komputer");
        mhs1.setUmur(18);
        mhs1.setIpk(3.36);
        mhs1.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 2 (SEBAGIAN) ===");
        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi("Andi Saputra", "2211523002");
        mhs2.setJurusan("Sistem Informasi");
        mhs2.setUmur(21);
        mhs2.setIpk(2.75);
        mhs2.tampilkanInfo();
        System.out.println("----------------------------------------\n");

        System.out.println("=== PENGUJIAN KONSTRUKTOR 3 (LENGKAP) ===");
        MahasiswaEnkapsulasi mhs3 = new MahasiswaEnkapsulasi("Budi Santoso", "2211523003", "Teknik Informatika", 22, 3.20);
        mhs3.tampilkanInfo();
        System.out.println("----------------------------------------\n");
    }
}