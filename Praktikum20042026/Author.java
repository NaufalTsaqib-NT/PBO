/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum20042026;

/**
 *
 * @author LAB-SI-PC
 */
public class Author {
    private final String name;
    private String email;
    private final char gender;
    
    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;   
    }
    public String getName(){
        return name;
    }
    public char getGender (){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public String toString(){
        return name + "(" + gender + ") at " + email;
    }
}
