/**
 * File: Tendik.java
 * Deskripsi: Kelas untuk tenaga kependidikan
 */

 import java.util.Calendar;
 import java.util.Date;
 
 public class Tendik extends Pegawai {
     protected String bidang; // Bidang: Akademik, Kemahasiswaan, atau Sumber Daya
     private static final int USIA_BUP = 55; // Batas Usia Pensiun
     
     public Tendik() {
         super();
     }
     
     public Tendik(String nip, String nama, Date tanggalLahir, Date tmt, 
                  double gajiPokok, String bidang) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
         this.bidang = bidang;
     }
     
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Jabatan : Tenaga Kependidikan");
         System.out.println("Bidang : " + bidang);
         int[] masaKerja = hitungMasaKerja();
         System.out.println("Masa Kerja : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
         System.out.println("BUP : " + formatTanggal(hitungBUP()));
         System.out.println("Tunjangan : 1% x " + masaKerja[0] + " x Rp " + 
                           String.format("%,.2f", gajiPokok) + " = Rp. " + 
                           String.format("%,.2f", hitungTunjangan()));
     }
     
     public double hitungTunjangan() {
         // Tendik mendapat 1% x masa kerja (tahun) x gaji pokok
         return 0.01 * hitungMasaKerja()[0] * gajiPokok;
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