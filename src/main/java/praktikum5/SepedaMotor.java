/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Anggun
 */
class SepedaMotor extends KendaraanDarat{ // konsepnya sama kayak mobil, extend untuk pewarisan
    String jenisMesin; // atribut baru bernama jenisMesin
    
    @Override // 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
