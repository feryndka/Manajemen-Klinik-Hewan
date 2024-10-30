/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Asus
 */
public class RekamMedis {
    private Hewan hewan;
    private String diagnosis;
    private String perawatan;
    private String tanggal;

    public RekamMedis(Hewan hewan, String diagnosis, String perawatan, String tanggal) {
        this.hewan = hewan;
        this.diagnosis = diagnosis;
        this.perawatan = perawatan;
        this.tanggal = tanggal;
    }

    public void display() {
        System.out.println("=== Rekam Medis ===");
        hewan.display();
        System.out.println("Diagnosis   : " + diagnosis);
        System.out.println("Perawatan   : " + perawatan);
        System.out.println("Tanggal     : " + tanggal);
    }
}
