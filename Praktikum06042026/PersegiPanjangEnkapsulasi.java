/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum06042026;

/**
 *
 * @author HYPE AMD
 */
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    public PersegiPanjangEnkapsulasi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek++;
    }
    
    public void setpanjang(int panjang){
        this.panjang = 20;
    }
    
   public int getpanjang(){
       return panjang;
   } 
   
   public void setlebar(int lebar){
       this.lebar = 10;
   }
   
   public int getlebar(){
       return lebar;
   }
   
   public static int getjumlahObjek(){
       return jumlahObjek;
   }
   
   public int getluas(){
       return (panjang*lebar);
   }
   
   public int getkeliling(){
       return (2*panjang+2*lebar);
   }
}
