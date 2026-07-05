/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz_2501082009;

/**
 *
 * @author HYPE AMD
 */
public class Kue {
    // Enkapsulasi: Semua atribut dibuat private
    private String identitas;
    private int hargaJual;
    private int jumlahTersedia;
    private String kategori;

    // Constructor untuk inisialisasi data
    public Kue(String identitas, int hargaJual, int jumlahTersedia, String kategori) {
        this.identitas = identitas;
        this.hargaJual = hargaJual;
        this.jumlahTersedia = jumlahTersedia;
        this.kategori = kategori;
    }

    // a. Method untuk menghitung total nilai penjualan (jumlah * harga)
    public int hitungTotalNilai() {
        return this.jumlahTersedia * this.hargaJual;
    }

    // b. Method untuk menampilkan informasi kue dengan rapi
    public void tampilkanInfo() {
        System.out.println("=== Informasi Kue ===");
        System.out.println("Identitas/Nama : " + this.identitas);
        System.out.println("Kategori       : " + this.kategori);
        System.out.println("Harga Jual     : Rp " + this.hargaJual);
        System.out.println("Stok Tersedia  : " + this.jumlahTersedia + " pcs");
        System.out.println("Total Potensi Nilai Penjualan : Rp " + hitungTotalNilai());
        System.out.println("=====================\n");
    }
}