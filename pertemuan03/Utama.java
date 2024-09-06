/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan03;

/**
 *
 * @author IT GRC
 */
public class Utama {

    public static void main(String[] args) {

        KendaraanPribadi mobil = new Mobil();
        KendaraanPribadi motor = new Motor();

        // print jenis kendaraan (Override)
        mobil.tampilkanJenis();
        motor.tampilkanJenis();

        // print informasi kendaraan (Overload)
        System.out.println("");
        System.out.println("Informasi Mobil :");
        mobil.tampilkanInfo();
        mobil.tampilkanInfo("Merah");

        System.out.println("");
        System.out.println("Informasi Motor :");
        motor.tampilkanInfo();
        motor.tampilkanInfo("Hitam");
    }
}
