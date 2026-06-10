/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum08062026;

import java.util.Scanner;

/**
 *
 * @author HYPE AMD
*/

class CekUmur extends Exception{
    public CekUmur(){
        
    }
}
public class ContohExceptionThrow {
    static void cekNilai(int nilai)throws Exception{
        if(nilai <0){
            throw new Exception("Nilai tidak boleh negatif");
        }
        else if (nilai>100)
        {
            throw new Exception ("Nilai max 100");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        try{
            System.out.print("Masukan sebuah angka = ");
            int angka = input.nextInt();
            cekNilai(angka);
        }
        catch(Exception e){
            System.out.println("gagal: "+e.getMessage());
        }
        finally{
            System.out.println("Sistem Berhasil");
        }
    }
    
}
