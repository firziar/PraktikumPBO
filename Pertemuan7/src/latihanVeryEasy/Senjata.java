/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author firzi
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    // konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0; // peluru awal 0
    }

    // getter
    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    // setter
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    // method
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis");
        }
    }
}