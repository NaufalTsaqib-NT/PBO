/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
public class Mahasiswa {
    String NIM;
    String Nama;
    double Tugas;
    double UTS;
    double UAS;
    
    Mahasiswa (){
        
    }
    
    double hitungNilai(){
        return(Tugas * 0.25)+(UTS * 0.35)+(UAS * 0.40);       
    }
    
}
