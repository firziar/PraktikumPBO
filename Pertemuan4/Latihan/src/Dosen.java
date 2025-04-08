/**
 * File: Dosen.java
 * Deskripsi: Kelas abstrak untuk dosen
 */

 import java.util.Date;

 public abstract class Dosen extends Pegawai {
     protected String fakultas;
     
     public Dosen() {
         super();
     }
     
     public Dosen(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
         this.fakultas = fakultas;
     }
     
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Fakultas : " + fakultas);
         int[] masaKerja = hitungMasaKerja();
         System.out.println("Masa Kerja : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
     }
     
     // Metode abstrak untuk menghitung tunjangan
     public abstract double hitungTunjangan();
 }