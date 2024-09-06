/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author IT GRC
 */
public abstract class KendaraanPribadi {

    // abstract method yang harus di-override subclass
    public abstract void tampilkanJenis();

    // overload method tanpa parameter
    public void tampilkanInfo() {
        System.out.println("Ini adalah kendaraan pribadi.");
    }

    // overload method dengan parameter
    public void tampilkanInfo(String warna) {
        System.out.println("Ini adalah kendaraan berwarna : " + warna);
    }
}
