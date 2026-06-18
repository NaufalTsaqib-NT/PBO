/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Transfer extends Pembayaran{
    private String namaBank;

    public Transfer(String idTransaksi, double jumlah, String namaBank) {
        super(jumlah, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println ("Pembayaran melalui Transfer Bank:");
        System.out.println ("Nama Bank: "+namaBank);
        System.out.println("ID Transaksi: "+idTransaksi);
        System.out.println("Jumlah Bayar: Rp "+jumlah);
    }
    
    
}
