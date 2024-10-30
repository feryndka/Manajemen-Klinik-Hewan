/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Asus
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelepon;

    public Pelanggan(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public void display() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Nomor Telepon  : " + nomorTelepon);
    }
}
