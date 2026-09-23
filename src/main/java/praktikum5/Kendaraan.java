/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */
class Kendaraan {  // Membuat class induk 
   String nama; // atribut nama bertipe string
   int kecepatan; // atribut kecepatan bertipe int
   
   public void tampilkanInfo() { // mendefinisikan fungsi method untuk menampilkan informasi ke layar tapi tidak retrun
       // intinya itu method sih. kode yang dibuat untuk melakukan suatu pekerjaan.
       System.out.println("Nama Kendaraan: "+ nama); // menampilkan teks seperti di prython fungsi print + mengambil data dari atribut nama
       System.out.println("Kecepatan: "+ kecepatan + " km/jam"); // mengambil data dari atribut kecepatan
   }
}
