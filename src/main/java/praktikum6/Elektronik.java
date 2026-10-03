package praktikum6;

class Elektronik extends Produk {
    String jenisElektronik;

    @Override
    public double hitungDiskon() {
        return harga * 0.10;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Elektronik: " + jenisElektronik);
    }
}