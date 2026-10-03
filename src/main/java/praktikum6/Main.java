/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Anggun
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara(); 
        kucing.makan("ikan"); // memanggil metode makan() dari class hewan
        kucing.makan("ikan", 2); // memanggil metode makan() yang overloaded
    }
    
}
