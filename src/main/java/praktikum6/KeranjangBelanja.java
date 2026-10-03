
package praktikum6;

public class KeranjangBelanja {
    Pakaian pakaian;
    Elektronik elektronik;
    Buku buku;
    
    public double hitungTotalSetelahDiskon() {
        double total = 0;
        
        total += pakaian.harga - pakaian.hitungDiskon();
        total += elektronik.harga - elektronik.hitungDiskon();
        total += buku.harga - buku.hitungDiskon();
        
        return total;
    }
}
