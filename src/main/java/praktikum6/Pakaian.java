
package praktikum6;

class Pakaian extends Produk{
    String jenisPakaian;
    
    @Override
    public double hitungDiskon() {
        return harga*0.05;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Pakaian: " + jenisPakaian);
    }
    
}
