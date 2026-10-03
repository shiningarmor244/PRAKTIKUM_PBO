/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Anggun
 */
public class Main2 {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: meow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); //memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2); // memanggil metode makan() yang overloded
        
            System.out.println();
            
        Anjing anjing = new Anjing();
        anjing.bersuara(); // output woof
        anjing.makan("daging", 3); // memanggil metode makan() yang overloade pada class hewan
        
    }
}
