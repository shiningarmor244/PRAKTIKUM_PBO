
package praktikum6;

abstract class Produk {
    String nama;
    int harga;
    
    public abstract double hitungDiskon();
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga Produk: " + harga);
    }
}
