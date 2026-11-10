/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Anggun
 */
public class Pengurangan implements OperasiHitung{ // dengan implements bisa menggunakan aturaninterface
    @Override // method hitung() dibuat berdasarkan method yang ada di interface
    public int hitung(int a, int b) { // mebuat method hitung() yang menerima dua angka
        return a - b;
    }
}
