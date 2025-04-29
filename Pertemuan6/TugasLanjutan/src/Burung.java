/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Cara Gerak Burung: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cara Bersuara Burung: Bercuit");
    }
}