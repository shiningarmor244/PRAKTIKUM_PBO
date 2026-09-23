/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */// Class Hewan atribut nama dan jenis
class Hewan { // Membuat class Hewan (Induk/parent)
    String nama; // atribut nama type string
    String jenis; // atribut jenis hewan type string
    
    public void tampilkanInfo() { // digunakan untuk membuat method alias kode untuk melakukan suatu pekerjaan
        System.out.println("Nama Hewan: " + nama); // menampilkan kode dan sumbernya dari atribut nama
        System.out.println("Jenis Hewan: " + jenis); // sama, tapi dari atribut jenis
    }
}


