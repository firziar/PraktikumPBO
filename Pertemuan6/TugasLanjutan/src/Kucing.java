/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Kucing extends Anabul {   
    public Kucing(String nama) {
        setNama(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Cara Gerak Kucing: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println("Cara Bersuara Kucing: Meong");
    }
}