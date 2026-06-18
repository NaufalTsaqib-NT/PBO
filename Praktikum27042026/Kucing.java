/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class Kucing extends Hewan {
    public Kucing (String nama){
        super(nama);
    }
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+" berkata meong");
                
    }
}
