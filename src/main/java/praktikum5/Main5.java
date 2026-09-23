/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */
public class Main5 { // Class khusus biar bisa menjalankan kode yang dibuat
    public static void main(String[] args) {
        Mobil mobil = new Mobil(); // membuat objek mobil dari class Mobil
        mobil.nama = "Buggati Chiron"; // pewarisan (nama) dari kendaraan
        mobil.kecepatan = 420;
        mobil.jumlahPintu = 2; // asalanya dari Mobil bukan Kendaraan
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo(); // karena tadi pakai @Override maka info yang ditambilkan bersumber dari mobil
        // terus tadi super.tampilkanInfo() jadi info dari kendaraan juga bisa ditampilkan
        System.out.println();
  
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki";
        motor.kecepatan = 180;
        motor.jenisMesin = "1 Silinder 2-tak";
        motor.jumlahRoda = 2;
        motor.tampilkanInfo();
    }
}
