/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Asus
 */
public class JanjiKonsultasi {
    private Pelanggan pelanggan;
    private Hewan hewan;
    private String dokter;
    private String tanggal;
    private String waktu;

    public JanjiKonsultasi(Pelanggan pelanggan, Hewan hewan, String dokter, String tanggal, String waktu) {
        this.pelanggan = pelanggan;
        this.hewan = hewan;
        this.dokter = dokter;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    public void display() {
        System.out.println("=== Janji Konsultasi ===");
        pelanggan.display();
        hewan.display();
        System.out.println("Dokter  : " + dokter);
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Waktu   : " + waktu);
    }
}
