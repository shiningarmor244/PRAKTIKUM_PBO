/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */
class Mobil extends KendaraanDarat { // di sini Mobil adalah turunanya karena memakai extends (mobil merwarisi kendaraan)
   // mobil nanti bisa menampilkan nama, keepatan, dan info
     // atribut tambahan untuk mobil (dikendaraan tidak ada)
    int jumlahPintu;
    
    @Override // biar bisa pakai cara yang baru (anak) bukan cara lama (induk 
    public void tampilkanInfo() { // untuk menimpa tamilkanInfo() milik kendaraan.
        super.tampilkanInfo(); // biar bisa pinjam atau memanggil milik induk jadi gak perlu tulis ulang (nama dan kecepatan)
        System.out.println("Jumlah Pintu; "+ jumlahPintu); // menambahkan infomasi khusus mobil
    }
    
}
