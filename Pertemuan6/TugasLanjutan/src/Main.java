/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 
        Anabul Anabul1 = new Kucing("Rusdi");
        Anabul Anabul2 = new Anjing("Tung Tung");
        Anabul Anabul3 = new Burung("Capucina Asasina");
 
        ArrayList<Anabul> hewans = new ArrayList<>();
        hewans.add(Anabul1);
        hewans.add(Anabul2);
        hewans.add(Anabul3);
 
        for (Anabul hewan : hewans) {
            System.out.println("Nama: " + hewan.getNama());
            hewan.Gerak();
            hewan.Bersuara();
            System.out.println();
        }
    }
}