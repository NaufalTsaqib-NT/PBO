/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum06042026;

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner; 
public class MainPersegiPanjangEnkapsulasi {
    public static void main(String[] args) {
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        int panjang = pp1.getpanjang();
        int lebar = pp1.getlebar();
        int luas = pp1.getluas();
        System.out.println("Objek Persegi Panjang Pertama");
        System.out.println("Panjang     = "+panjang);
        System.out.println("Lebar       = "+lebar);
        System.out.println("Luas        = "+luas);
        System.out.println("Keliling    = "+pp1.getkeliling());
        
        //membuat objek kedua menggunakan konstruktor 2
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(20,10);
        luas = pp2.getluas();
        System.out.println("Objek Persegi Panjang kedua");
        System.out.println("Panjang     = "+panjang);
        System.out.println("Lebar       = "+lebar);
        System.out.println("Luas        = "+luas);
        System.out.println("Keliling    = "+pp2.getkeliling());
        
        //membuat objek kedua menggunakan konstruktor 2
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Persegi Panjang ketiga");
        System.out.print("Panjang     = ");
        int pj = input.nextInt();
        System.out.print("Lebar       = ");
        int lb = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(pj,lb);
        System.out.println("Keliling    = "+pp3.getluas());
        System.out.println("Keliling    = "+pp3.getkeliling());
    }
    
}
