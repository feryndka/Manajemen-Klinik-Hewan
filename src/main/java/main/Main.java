/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat klinik
        String[] dokter = {"Dr. A", "Dr. B"};
        Klinik klinik = new Klinik("Klinik Hewan Sehat", "Jl. Mawar No. 5", dokter, "09:00 - 17:00");
        klinik.displayInfo();

        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Budi", "Jl. Melati No. 2", "08123456789");

        // Membuat hewan peliharaan (kucing dan anjing)
        Kucing kucing = new Kucing("Milo", 3, "Sehat");
        Anjing anjing = new Anjing("Bobby", 5, "Pernah demam");

        // Membuat janji konsultasi
        JanjiKonsultasi janji1 = new JanjiKonsultasi(pelanggan1, kucing, "Dr. A", "2024-10-30", "10:00");
        janji1.displayInfo();

        // Membuat rekam medis untuk hewan
        RekamMedis rekamMedis1 = new RekamMedis(kucing, "Flu", "Diberikan vitamin dan obat flu", "2024-10-30");
        rekamMedis1.displayInfo();
    }
}
