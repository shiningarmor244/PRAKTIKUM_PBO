
package praktikum6;

public class Main3 {
   public static void main(String[] args) {
       Pakaian pakaian = new Pakaian();
       pakaian.nama = "Jeans";
       pakaian.harga = 85000;
       pakaian.jenisPakaian = "Bawahan";
       
       Elektronik elektronik = new Elektronik();
       elektronik.nama = "Kulkas";
       elektronik.harga = 2500000;
       elektronik.jenisElektronik = "Alat Rumah Tangga";
       
       Buku buku = new Buku();
       buku.nama = "Aroma Karsa";
       buku.harga = 180000;
       buku.jenisBuku = "novel";
       
       KeranjangBelanja keranjang = new KeranjangBelanja();
       keranjang.pakaian = pakaian;
       keranjang.elektronik = elektronik;
       keranjang.buku = buku;
       
       pakaian.tampilkanInfo();
       System.out.println("Diskon: " + pakaian.hitungDiskon());
       System.out.println();
       
       elektronik.tampilkanInfo();
       System.out.println("Diskon: " + elektronik.hitungDiskon());
       System.out.println();
       
       buku.tampilkanInfo();
       System.out.println("Diskon: " + buku.hitungDiskon());
       System.out.println();
       
       System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalSetelahDiskon());
   } 
}
