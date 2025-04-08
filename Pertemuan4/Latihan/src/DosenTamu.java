/**
 * File: DosenTamu.java
 * Deskripsi: Kelas untuk dosen tamu
 */

 import java.util.Calendar;
 import java.util.Date;
 import java.util.concurrent.TimeUnit;
 
 public class DosenTamu extends Dosen {
     protected String nidk;
     protected Date tanggalBerakhirKontrak;
     
     public DosenTamu() {
         super();
     }
     
     public DosenTamu(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, 
                      String fakultas, String nidk, Date tanggalBerakhirKontrak) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
         this.nidk = nidk;
         this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
     }
     
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("NIDK : " + nidk);
         System.out.println("Jabatan : Dosen Tamu");
         System.out.println("Masa Kontrak Berakhir : " + hitungMasaKontrak() + " bulan lagi");
         System.out.println("Tunjangan : 2,5% x Rp " + String.format("%,.2f", gajiPokok) + 
                           " = Rp. " + String.format("%,.2f", hitungTunjangan()));
     }
     
     @Override
     public double hitungTunjangan() {
         // Dosen tamu mendapat 2,5% x gaji pokok
         return 0.025 * gajiPokok;
     }
     
     public int hitungMasaKontrak() {
         Calendar hariIni = Calendar.getInstance();
         Calendar akhirKontrak = Calendar.getInstance();
         akhirKontrak.setTime(tanggalBerakhirKontrak);
         
         long bedaMillis = Math.abs(akhirKontrak.getTimeInMillis() - hariIni.getTimeInMillis());
         long bedaHari = TimeUnit.DAYS.convert(bedaMillis, TimeUnit.MILLISECONDS);
         
         // Konversi hari ke bulan
         return (int) (bedaHari / 30);
     }
 }