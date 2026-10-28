/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author Anggun
 */
class Kucing extends Hewan { //ini mewarisi dari superclass sekaligus abstractclass
    @Override      // method suara menimpa metode yang diwrisi kelas induknya  
    void suara() { // mendefinisikan metod suara yang tidak mengembalikan nilai
        System.out.println("Kucing bersuara: Miaw Miaw ");
    }
}
