/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum08062026;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HYPE AMD
 */
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        try{
            System.out.print("Mau bagi angka index ke berapa = ");
        int index = input.nextInt();
        System.out.println("Angka pada indeks "+index+" adalah "+angka[index]);
        System.out.print("Mau dibagi berapa = ");
        int pembagi = input.nextInt();
        int hasil = angka[index]/pembagi;
        System.out.println("Hasil Pembagian = "+hasil);
        
        //1. Exception Array diluar jangkauan
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index array tidak ada, masukan 0-4");
        }
        catch(InputMismatchException e){
            System.out.println("Format angka tidak sesuai");
        }
        catch(ArithmeticException e){
            System.out.println("Tidak boleh ada pembagian dengan 0");
        }
        finally{
            System.out.print("Proses selesai, isi array adalah = ");
            for (int i=0; i<angka.length;i++){
                System.out.println(" "+angka[i]);
            }
            System.out.println("Isi array: "+java.util.Arrays.toString(angka));
        }
    }
    
}
