/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author firzi
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public int isiPeluru(int jumlahPeluru) {
        int peluruBaru = senjata.getPeluru() + jumlahPeluru;
        senjata.setPeluru(peluruBaru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
        return peluruBaru;
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()) {
            for (int i = 0; i < jumlah; i++) {
                if (senjata.getPeluru() > 0) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb! Jleb!";
        } else {
            return "Senjata ini tidak bisa menusuk!";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang!");
    }
}