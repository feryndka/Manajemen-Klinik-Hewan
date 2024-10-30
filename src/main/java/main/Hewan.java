/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Asus
 */
abstract class Hewan {
    protected String nama;
    protected String spesies;
    protected int usia;
    protected String riwayatKesehatan;

    public Hewan(String nama, String spesies, int usia, String riwayatKesehatan) {
        this.nama = nama;
        this.spesies = spesies;
        this.usia = usia;
        this.riwayatKesehatan = riwayatKesehatan;
    }

    public abstract String getMakanan();
    public abstract String getPerawatan();

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Spesies: " + spesies);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Riwayat Kesehatan: " + riwayatKesehatan);
    }
}

class Kucing extends Hewan {
    public Kucing(String nama, int usia, String riwayatKesehatan) {
        super(nama, "Kucing", usia, riwayatKesehatan);
    }

    @Override
    public String getMakanan() {
        return "Makanan kucing (daging, ikan)";
    }

    @Override
    public String getPerawatan() {
        return "Perawatan bulu, pemeriksaan rutin kesehatan gigi";
    }
}

class Anjing extends Hewan {
    public Anjing(String nama, int usia, String riwayatKesehatan) {
        super(nama, "Anjing", usia, riwayatKesehatan);
    }

    @Override
    public String getMakanan() {
        return "Makanan anjing (daging, tulang)";
    }

    @Override
    public String getPerawatan() {
        return "Perawatan bulu, olahraga, pemeriksaan rutin kesehatan";
    }
}
