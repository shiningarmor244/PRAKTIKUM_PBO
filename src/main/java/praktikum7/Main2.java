/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author Anggun
 */
public class Main2 { // tempat kode berjalan
    public static void main(String[] args) { // agar class/kode program bisa di run
        Hewan kucing = new Kucing(); // membuat objek baru referensi dari class kucing
        Hewan anjing = new Anjing();
        
        kucing.suara(); // memanggil method suara
        kucing.info(); // memanggil method info
        
        System.out.println();
        
        anjing.suara();
        anjing.info();
    }
}
