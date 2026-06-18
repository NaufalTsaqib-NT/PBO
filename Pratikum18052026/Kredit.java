/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Kredit extends Pembayaran{
    private String nomorKartu;

    public Kredit(String idTransaksi, double jumlah, String nomorKartu) {
        super(jumlah, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    public void prosesPembayaran() {
        System.out.println ("Pembayaran melalui Kartu Kredit:");
        System.out.println ("Nomor Kartu Kredit: "+nomorKartu);
        System.out.println("ID Transaksi: "+idTransaksi);
        System.out.println("Jumlah Bayar: Rp "+jumlah);
    }
    
}
