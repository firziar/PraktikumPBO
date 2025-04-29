/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void tampilData () {
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok " + getNama() + ": " + getGajiPokok());
    }
}