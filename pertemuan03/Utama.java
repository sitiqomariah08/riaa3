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

        Mobil sedan = new Mobil();
        Motor beat = new Motor();

        // print jenis kendaraan (Override)
        sedan.tampilkanJenis();
        beat.tampilkanJenis();

        // print informasi kendaraan (Overload)
        System.out.println("");
        System.out.println("Informasi Mobil :");
        sedan.tampilkanInfo();
        sedan.tampilkanInfo("Merah");

        System.out.println("");
        System.out.println("Informasi Motor :");
        beat.tampilkanInfo();
        beat.tampilkanInfo("Hitam");
    }
}
