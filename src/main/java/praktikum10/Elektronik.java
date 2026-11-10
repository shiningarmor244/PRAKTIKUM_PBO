/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Anggun
 */
public class Elektronik implements Pembayaran{ // class elektronik yang menggunkan aturan interface pembayaran
    @Override // method hitungPajak dibuat berdasarkan method interface pembayaran
    public double hitungPajak(double harga) { // membuat method hitung pajak
        return harga *0.10; // pajaknya 10%
    }
    
}
