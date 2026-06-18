/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class MainHewan {
    public static void main(String[] args) {
        Hewan hewanku = new Hewan("Makhluk hidup");
        Kucing kucingku = new Kucing ("Bobby");
        Anjing anjingku = new Anjing("Helly");
        
        System.out.println("Tampilkan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        System.out.println("\nTampilan akses sub class Kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println("\nTampilkan akses sub class Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
    
}
