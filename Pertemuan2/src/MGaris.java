/* Nama File: MGaris.java
 * Deskripsi: berisi main driver untuk class Garis
 * Pembuat: Firzi Assidqie Ramadhani / 24060123130064
 * Tanggal: 21 Februari 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        // garis G1
        System.out.println("==========Garis G1==========");
        Garis G1 = new Garis();
        G1.getTitikAwal().setAbsis(3);
        G1.getTitikAwal().setOrdinat(4);
        G1.getTitikAkhir().setAbsis(5);
        G1.getTitikAkhir().setOrdinat(6);
        G1.printGaris();
        G1.printPersamaanGaris();
        System.out.println("Panjang Garis G1: " + G1.getPanjang());
        System.out.println("Gradien Garis G1: " + G1.getGradien());
        System.out.print("Titik Tengah Garis G1: ");
        G1.getTitikTengah().printTitik();
        System.out.println();

        // garis G2
        System.out.println("==========Garis G2==========");
        Garis G2 = new Garis(new Titik(-2,0), new Titik(0,4));
        G2.printGaris();
        G2.printPersamaanGaris();
        System.out.println("Panjang Garis G2: " + G2.getPanjang());
        System.out.println("Gradien Garis G2: " + G2.getGradien());
        System.out.print("Titik Tengah Garis G2: ");
        G2.getTitikTengah().printTitik();
        System.out.println();

        // cek G1 dan G2
        System.out.println("==========Cek Garis G1 dan G2==========");
        System.out.println("Apakah G1 Sejajar dengan G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 Tegak Lurus dengan G2? " + G1.isTegakLurus(G2));

        // static counterGaris
        System.out.println("Jumlah Objek Garis: " + Garis.getCounterGaris());
    }
}