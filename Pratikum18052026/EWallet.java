/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class EWallet extends Pembayaran {
    private String namaWallet;
    
    public EWallet(String idTransaksi, double jumlah, String namaWallet) {
        super(jumlah, idTransaksi);
        this.namaWallet = namaWallet;
    }
    
    public String getNamaWallet() {
        return namaWallet;
    }

    public void setNamaWallet(String namaWallet) {
        this.namaWallet = namaWallet;
    }
    
    public void prosesPembayaran(){
        System.out.println ("Pembayaran melalui E-Wallet:");
        System.out.println ("E-Wallet: "+namaWallet);
        System.out.println("ID Transaksi: "+idTransaksi);
        System.out.println("Jumlah Bayar: Rp "+jumlah);
    }  
}
