/**
 * File: Petani.java
 * Deskripsi: Kelas Petani yang merepresentasikan seorang petani
 * Pembuat: Firzi Assidqie Ramadhani
 */

import java.util.Calendar;

public class Petani extends Manusia {
    private String lokasi;
    private static int counterPetani = 0;
    
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String lokasi) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.lokasi = lokasi;
        counterPetani++;
    }
    
    public String getLokasi() {
        return lokasi;
    }
    
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar startWork = Calendar.getInstance();
        startWork.setTime(getTglMulaiKerja());
        
        int yearDiff = now.get(Calendar.YEAR) - startWork.get(Calendar.YEAR);
        
        return yearDiff + 0; //NIM:064
    }
    
    @Override
    public double hitungPajak() {
        // 0% dari pendapatan (tidak kena pajak)
        return 0;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Lokasi: " + lokasi);
    }
}