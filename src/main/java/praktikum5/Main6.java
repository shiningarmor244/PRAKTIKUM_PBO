/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */
public class Main6 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Cat";
        kucing.jenis = "Mancoon";
        kucing.suaraKucing = "Meow meow";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Dog";
        anjing.jenis = "Chihuahua";
        anjing.suaraAnjing = "Guk guk";
        anjing.tampilkanInfo();
    }
}
