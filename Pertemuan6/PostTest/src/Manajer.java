/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    
    public Manajer(String nama) {
        setNama(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }
    
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("Total Gaji: " + (getGajiPokok() + getTunjangan()) + "\n");
    }
}