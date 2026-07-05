/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum25052026;

/**
 *
 * @author HYPE AMD
 */
public class Keyboard extends AlatMusik implements BisaDijalankan {
    private boolean dayaTersambung;

    public Keyboard(String nama, String jenis, boolean dayaTersambung) {
        super(nama,jenis);
        this.dayaTersambung = dayaTersambung;
    }

    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+ "dinyalakan");
        }else{
            System.out.println(nama+ "tidak bisa dinyalakan");
        }
        
    }

    public void matikan() {
        System.out.println(nama + "dinyalakan");
        
    }

    public boolean cekListrik() {
        return dayaTersambung;
    }
    
    public void stem(){
        System.out.println("Keyboard"+nama+ "distem secara digital");
    }

    @Override
    public void mainkan() {
        System.out.println("Keyboard "+nama+" distem secara digital.");
    }
    
    
}
