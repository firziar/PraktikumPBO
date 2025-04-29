/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        Programmer pegawai4 = new Programmer("Sesni");
        Manajer pegawai5 = new Manajer("Kortoa");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}