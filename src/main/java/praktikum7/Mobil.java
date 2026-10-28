/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author Anggun
 */
class Mobil extends Kendaraan { //subclass yang mewarisi astribut dan method dari superclass & abstractclas
    @Override // menandai method berjalan pada class ini menimpa method yang diwarisi dari superclass
    void berjalan() { //mendefinisikan method berjalan & tidak mengembalikan nilai
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}
