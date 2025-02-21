/* Nama File: Titik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Firzi Assidqie Ramadhani / 24060123130064
 * Tanggal: 21 Februari 2025
 */

 public class Titik {
    /* Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Method */

    // Konstruktor
    Titik() {
        this(0,0);
        counterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // mendapatkan nilai kuadran 
    int getKuadran() {
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
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }    
    
    // menghitung jarak titik ke titik lain
    double getJarak(Titik T){
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    // refleksi terhadap sumbu x
    void refleksiX(){
        ordinat = -1*ordinat;
    }

    // mendapatkan titik hasil refleksi terhadap sumbu x
    Titik getRefleksiX(){
        return new Titik(absis, -1 * ordinat);
    }

    // refleksi terhadap sumbu Y
    void refleksiY(){
        absis = -1*absis;
    }

    // mendapatkan titik hasil refleksi terhadap sumbu y
    Titik getRefleksiY(){
        return new Titik(-1 * absis, ordinat);
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}