/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Anggun
 */
public class Main2 {

    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("Porsche", "Lambogini", 2022, "Blue");
        Mobil mobil2 = new Mobil("McLarren", "Bugatti", 2023, "Navy");
        
        System.out.println("MOBIL 1");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        System.out.println();
        
        System.out.println("MOBIL 2");
        mobil2.displayInfo();
        mobil2.startEngine();
        
        System.out.println();
        
        mobil1.setWarna("Merah");
        
        System.out.println("WARNA MOBIL 1 DIUBAH");
        mobil1.displayInfo();
    }
}
