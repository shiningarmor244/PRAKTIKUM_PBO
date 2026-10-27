/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Anggun
 */
class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa Makanan: " + tanggalKadaluarsa);
    }
}
