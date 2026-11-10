/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Anggun
 */
public class Main2 {
    public static void main(String[] args) { // biar program bisa di run
        Pembayaran elektronik = new Elektronik(); // membuat object baru referensi dari class Elektronik dan sudah menerapkan interface
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 50000000;  // membuat variabel untuk menyimpan harga
        double hargaMakanan = 2500000;

        double pajakElektronik = elektronik.hitungPajak(hargaElektronik); // menghitug pajak elektrik dgn memanggil methos hitungpajak dari objek elektronik hasilnay di simpan dalam pajak makanan
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);

        double totalElektronik = hargaElektronik + pajakElektronik; // menjumlahkan harga dengan pajaknya biar bisa tootal
        double totalMakanan = hargaMakanan + pajakMakanan;

        double totalPembayaran = totalElektronik + totalMakanan; // total eletronik dan makanan

        System.out.printf("Pajak Elektronik: Rp%,.2f%n", pajakElektronik);
        System.out.printf("Pajak Makanan: Rp%,.2f%n", pajakMakanan);
        
        System.out.println();
        
        System.out.printf("Total Harga Elektronik: Rp%,.2f%n", totalElektronik);
        System.out.printf("Total Harga Makanan: Rp%,.2f%n", totalMakanan);
        
        System.out.println();
        
        System.out.printf("Total Pembayaran: Rp%,.2f%n", totalPembayaran);
        
    }
}
