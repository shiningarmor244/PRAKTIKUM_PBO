/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Anggun
 */
public class Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik();
        elektronik.setNamaProduk("Laptop");
        elektronik.setHarga(15000000);
        elektronik.setGaransi(2);
       
        
        elektronik.tampilkanInfo();
        System.out.println();
        
        
        Makanan makanan = new Makanan();
        makanan.setNamaProduk("Snack");
        makanan.setHarga(15000);
        makanan.setTanggalKadaluarsa("2023-12-30");
        
        makanan.tampilkanInfo();
        System.out.println();
        
        
        PegawaiKontrak pegawaiKontrak = new PegawaiKontrak();
        pegawaiKontrak.setNamaPegawai("Anggun");
        pegawaiKontrak.setGaji(10000000);
        pegawaiKontrak.setLamaKontrak(12);
        
        pegawaiKontrak.tampilkanInfo();
        System.out.println();
        
        PegawaiTetap pegawaiTetap = new PegawaiTetap();
        pegawaiTetap.setNamaPegawai("Fita");
        pegawaiTetap.setGaji(15000000);
        pegawaiTetap.setTunjangan(8000000);
        
        pegawaiTetap.tampilkanInfo();
        System.out.println();
        
        //Polymorsh
        Produk produk = elektronik;
        produk.tampilkanInfo();
        
    }
}
