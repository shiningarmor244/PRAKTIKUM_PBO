/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 *///TUGAS

// Trurunan Kucing
// menampilkan suara khas masing0masing hewan, lakukan overrading
class Kucing extends Hewan  {
    String suaraKucing;
   
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing: " + suaraKucing);
    }
    
}
