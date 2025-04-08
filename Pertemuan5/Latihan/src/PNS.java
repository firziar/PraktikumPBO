/**
 * File: PNS.java
 * Deskripsi: Kelas PNS yang merepresentasikan Pegawai Negeri Sipil
 * Pembuat: Firzi Assidqie Ramadhani
 */

import java.util.Calendar;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;
    
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public PNS(String nama, String tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar startWork = Calendar.getInstance();
        startWork.setTime(getTglMulaiKerja());
        
        int yearDiff = now.get(Calendar.YEAR) - startWork.get(Calendar.YEAR);
        
        return yearDiff + 4; //NIM:064
    }
    
    @Override
    public double hitungPajak() {
        // 10% dari pendapatan
        return 0.1 * getPendapatan();
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}