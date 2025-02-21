/* Nama File: Garis.java
 * Deskripsi: berisi atribut dan method dalam class Garis
 * Pembuat: Firzi Assidqie Ramadhani / 24060123130064
 * Tanggal: 21 Februari 2025
 */

 public class Garis {
    /* Atribut */
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /* Method */

    // Konstruktor
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor
    Titik getTitikAwal(){
        return titikAwal;
    }

    Titik getTitikAkhir(){
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // mendapatkan panjang sebuah garis
    double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // mendapatkan gradien dari sebuah garis
    double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // mengecek apakah garis sejajar dengan sebuah garis lainnya
    boolean isSejajar(Garis L) {
        return this.getGradien() == L.getGradien();
    }

    // mengecek apakah garis tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis L) {
        return this.getGradien() * L.getGradien() == -1;
    }

    // menampilkan ke titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}