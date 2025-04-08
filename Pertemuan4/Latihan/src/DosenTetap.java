/**
 * File: DosenTetap.java
 * Deskripsi: Kelas untuk dosen tetap
 */

 import java.util.Calendar;
 import java.util.Date;
 
 public class DosenTetap extends Dosen {
     protected String nidn;
     private static final int USIA_BUP = 65; // Batas Usia Pensiun
     
     public DosenTetap() {
         super();
     }
     
     public DosenTetap(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, 
                       String fakultas, String nidn) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
         this.nidn = nidn;
     }
     
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("NIDN : " + nidn);
         System.out.println("Jabatan : Dosen Tetap");
         System.out.println("BUP : " + formatTanggal(hitungBUP()));
         System.out.println("Tunjangan : 2% x " + hitungMasaKerja()[0] + " x Rp " + 
                           String.format("%,.2f", gajiPokok) + " = Rp. " + 
                           String.format("%,.2f", hitungTunjangan()));
     }
     
     @Override
     public double hitungTunjangan() {
         // Dosen tetap mendapat 2% x masa kerja (tahun) x gaji pokok
         return 0.02 * hitungMasaKerja()[0] * gajiPokok;
     }
     
     public Date hitungBUP() {
         Calendar kalenderBUP = Calendar.getInstance();
         kalenderBUP.setTime(tanggalLahir);
         
         // Tambahkan usia BUP
         kalenderBUP.add(Calendar.YEAR, USIA_BUP);
         
         // Set ke tanggal 1 bulan berikutnya
         kalenderBUP.add(Calendar.MONTH, 1);
         kalenderBUP.set(Calendar.DAY_OF_MONTH, 1);
         
         return kalenderBUP.getTime();
     }
 }