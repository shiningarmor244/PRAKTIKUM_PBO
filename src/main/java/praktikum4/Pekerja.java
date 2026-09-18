/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Anggun
 */
public class Pekerja extends Manusia{
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    //Getter Gaji
    public int getGaji() {
        return gaji;
    }
    //Setter gaji
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    //Override 
    public String toString() {
        return "Nama Pekerja: " + getNama() +
                "\nUsia Pekerja: " + usia +
                "\nPekerjaan: " + pekerjaan +
                "\nJumlah Gaji: " + gaji;
    }
            
            
    public void tampilkanInfoPekerja() {
        System.out.println("Umur Pekerja:" + usia + " tahun");
        System.out.println("Jumlah Gaji: " + gaji);
    }
    
}
