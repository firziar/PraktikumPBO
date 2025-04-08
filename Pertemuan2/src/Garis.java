/* Nama File: Garis.java
 * Deskripsi: berisi atribut dan method dalam class Garis
 * Pembuat: Firzi Assidqie Ramadhani / 24060123130064
 * Tanggal: 21 Februari 2025
 */

 public class Garis {
    /* Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /* Method */

    // Konstruktor
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // mendapatkan panjang sebuah garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // mendapatkan gradien dari sebuah garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // mengecek apakah garis sejajar dengan sebuah garis lainnya
    public boolean isSejajar(Garis L) {
        return this.getGradien() == L.getGradien();
    }

    // mengecek apakah garis tegak lurus dengan sebuah garis lainnya
    public boolean isTegakLurus(Garis L) {
        return this.getGradien() * L.getGradien() == -1;
    }

    // menampilkan ke titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk string y = mx + c
    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}