/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super.setNama(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Cara Gerak Anjing: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cara Bersuara Anjing: Guk-guk");
    }
}