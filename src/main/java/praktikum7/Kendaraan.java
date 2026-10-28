/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author Anggun
 */
abstract class Kendaraan { //abstact class di sini adalah kendaraan.
    abstract void berjalan(); // ini method abstrac yaitu berjalan
    
    void info() { //ini method biasa
        System.out.println("Kalau Anda tidak tahu, ini adalah sebuah Kendaraan");
    }
}
