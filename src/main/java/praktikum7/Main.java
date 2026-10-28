/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author Anggun
 */
public class Main { //tempat program berjlan
    public static void main(String[] args) { //agar class bisa run
        Kendaraan mobil = new Mobil(); // membuat objek baru
        Kendaraan sepeda = new Sepeda(); // abstrac class tidak bisa dibuat objek
        Kendaraan tank = new Tank(); // jadi kendaraan tidak bisa di buat new Kendaran
        Kendaraan kapal = new Kapal();
        
        mobil.berjalan(); //memanggil metod berjalan()
        mobil.info(); // memanggil metod info
        
       System.out.println();
        
        sepeda.berjalan();
        sepeda.info();
        
        System.out.println();
        
        tank.berjalan();
        tank.info();
        
        System.out.println();
        
        kapal.berjalan();
        kapal.info();
        
    }
}
