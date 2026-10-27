/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author Anggun
 */
class Elektronik extends Produk {
    private int garansi;
    
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + "Tahun");
    }
    
}
