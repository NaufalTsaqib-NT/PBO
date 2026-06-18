/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public abstract class Pembayaran {
    protected double jumlah;
    protected String idTransaksi;

    public Pembayaran(double jumlah, String idTransaksi) {
        this.jumlah = jumlah;
        this.idTransaksi = idTransaksi;
    }

    public double getJumlah() {
        return jumlah;
    }
    
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void prosesPembayaran();
}
