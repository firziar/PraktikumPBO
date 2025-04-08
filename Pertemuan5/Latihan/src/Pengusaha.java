/**
 * File: Pengusaha.java
 * Deskripsi: Kelas Pengusaha yang merepresentasikan seorang pengusaha
 * Pembuat: Firzi Assidqie Ramadhani
 */

import java.util.Calendar;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;
    
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public String getNpwp() {
        return npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar startWork = Calendar.getInstance();
        startWork.setTime(getTglMulaiKerja());
        
        int yearDiff = now.get(Calendar.YEAR) - startWork.get(Calendar.YEAR);
        
        return yearDiff + 6; //NIM:064
    }
    
    @Override
    public double hitungPajak() {
        // 15% dari pendapatan
        return 0.15 * getPendapatan();
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}