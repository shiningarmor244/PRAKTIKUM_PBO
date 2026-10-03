
package praktikum6;

class Buku extends Produk {
    String jenisBuku;
    
    @Override
    public double hitungDiskon() {
        return harga*0.05;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Buku: " + jenisBuku);
    }
    
}
