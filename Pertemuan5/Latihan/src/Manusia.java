/**
 * File: Manusia.java
 * Deskripsi: Kelas abstrak yang merepresentasikan manusia untuk pelaporan pajak
 * Pembuat: Firzi Assidqie Ramadhani
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.DecimalFormat;

public abstract class Manusia {
    private String nama;
    private Date tglMulaiKerja;
    private String alamat;
    private double pendapatan;
    
    private static int counterMns = 0;
    
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            this.tglMulaiKerja = dateFormat.parse(tglMulaiKerja);
        } catch (ParseException e) {
            System.out.println("Format tanggal salah. Gunakan format dd-MM-yyyy");
            this.tglMulaiKerja = new Date();
        }
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public Manusia(String nama, String tglMulaiKerja, double pendapatan) {
        this(nama, tglMulaiKerja, "", pendapatan);
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Date getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(Date tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public abstract int hitungMasaKerja();
    public abstract double hitungPajak();
    
    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("\n--- Info Manusia ---");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + new SimpleDateFormat("dd-MM-yyyy").format(tglMulaiKerja));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + df.format(pendapatan));
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + df.format(hitungPajak()));
    }
}