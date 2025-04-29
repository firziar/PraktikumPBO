/* Nama : Firzi Assidqie Ramadhani
 * NIM  : 24060123130064
 * Lab  : B2
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;
    
    public Programmer(String nama) {
        setNama(nama);
    }

    public int getBonus() {
        return bonus;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + getBonus());
        System.out.println("Total Gaji: " + (getGajiPokok() + getBonus()) + "\n");
    }
}