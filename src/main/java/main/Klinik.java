/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Asus
 */
public class Klinik {
    private String namaKlinik;
    private String alamat;
    private String[] dokter;
    private String jamOperasional;

    public Klinik(String namaKlinik, String alamat, String[] dokter, String jamOperasional) {
        this.namaKlinik = namaKlinik;
        this.alamat = alamat;
        this.dokter = dokter;
        this.jamOperasional = jamOperasional;
    }

    public void displayInfo() {
        System.out.println("Nama Klinik: " + namaKlinik);
        System.out.println("Alamat: " + alamat);
        System.out.println("Dokter: ");
        for (String dr : dokter) {
            System.out.println("- " + dr);
        }
        System.out.println("Jam Operasional: " + jamOperasional);
    }
}
