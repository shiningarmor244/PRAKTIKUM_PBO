/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4; // a;amat folder

/**
 *
 * @author Anggun
 */
public class Kendaraan { // wadah atau class utama
    private String nama; // rahasia, private, dikunci
    protected int kecepatanMaks; // semacam kunci keluarga, gak boleh sama orang asing bolehnya sama anak
    public String jenisMesin; //bebas non kunci
    
    //Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) { //merakit objek
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
        
    }
    // Getter dan Setter untuk variabel private nama
    public String getNama() { // getter
        return nama;
    }
    public void setNama(String nama) { // setter
        this.nama = nama;
    }    
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan MAksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }    
}

