/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Anggun
 */
public class Penjumlahan implements OperasiHitung{ // class yang menggunakan aturan dari interface OperasiHitung
    @Override // method hitun() dibuat berdasarkan method yang ad di interface
    public int hitung(int a, int b) { // membuat method hitung() yang menerima dua angka a dan b
        return a + b; // menjumlahkan kedua angka dan mengembalikkan hasilnya.
    }
}
