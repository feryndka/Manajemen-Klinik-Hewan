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
    private String nama;
    private String alamat;
    private String[] dokter;
    private String jamOperasional;

    public Klinik(String namaKlinik, String alamat, String[] dokter, String jamOperasional) {
        this.nama = namaKlinik;
        this.alamat = alamat;
        this.dokter = dokter;
        this.jamOperasional = jamOperasional;
    }

    public void display() {
        System.out.println("Nama Klinik     : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Dokter : ");
        for (String dr : dokter) {
            System.out.println("- " + dr);
        }
        System.out.println("Jam Operasional : " + jamOperasional);
    }
}
