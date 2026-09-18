/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Anggun
 */
public class Manusia {
    private String nama; // rahasia private dikunci
    protected int usia;
    public String pekerjaan;
    
    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;   
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama; // alasan kenapa cuma Nama yang pakai gitter setter karena nama itu PRIVATE
    }
    public void tampilkanInfoManusia() {
        System.out.println("Nama Pekerja: " + nama);
        System.out.println("Usia Pekerja: " + usia);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
