
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Anggun
 */
public class MainManusia {
    public static void main(String[] args) {
        
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Mark", 23, "Akuntan", 4000000);
        
        // Menampilkan informasi pekerja menggunakan toString()
        System.out.println(pekerja.toString());
        
        // Mengubah nama menggunakan setter
        pekerja.setNama("Yosep");
        
        // Menampilkan kembali informasi setelah nama diubah
        System.out.println("\nSetelah nama diubah:");
        System.out.println(pekerja.toString());
        
        // Mengakses atribut secara langsung
        // System.out.println(pekerja.nama);
        System.out.println(pekerja.usia);
        // System.out.println(pekerja.gaji);
    }
}
