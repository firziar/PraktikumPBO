/* Nama File: Titik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Firzi Assidqie Ramadhani / 24060123130064
 * Tanggal: 21 Februari 2025
 */

 public class Titik {
    /* Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Method */

    // Konstruktor
    public Titik() {
        this(0,0);
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // mendapatkan nilai kuadran 
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // menghitung jarak titik ke titik origin
    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }    
    
    // menghitung jarak titik ke titik lain
    public double getJarak(Titik T){
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    // refleksi terhadap sumbu x
    public void refleksiX(){
        ordinat = -1*ordinat;
    }

    // mendapatkan titik hasil refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        return new Titik(absis, -1 * ordinat);
    }

    // refleksi terhadap sumbu Y
    public void refleksiY(){
        absis = -1*absis;
    }

    // mendapatkan titik hasil refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        return new Titik(-1 * absis, ordinat);
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}