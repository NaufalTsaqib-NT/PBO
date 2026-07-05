/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Quiz_2501082009;

/**
 *
 * @author HYPE AMD
 */
public class Employee {
    // Atribut (private)
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        // Menghitung kenaikan dan menambahkannya ke salary saat ini
        int kenaikan = (this.salary * percent) / 100;
        this.salary = this.salary + kenaikan;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}