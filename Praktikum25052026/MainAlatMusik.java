/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum25052026;

/**
 *
 * @author LAB-SI-PC
 */
public class MainAlatMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gitar gitar = new Gitar("Klasik","Petik",6);
       Keyboard keyboard = new Keyboard("Yamaha","Elektronik",true);
       
       System.out.println("\n Alat musik gitar");
       gitar.info();
       gitar.mainkan();
       gitar.stem();
       
       System.out.println("\n Alat Musik Keyboard");
       keyboard.info();
       keyboard.nyalakan();
       keyboard.mainkan();
       keyboard.stem();
       keyboard.matikan();
    }
    
}