/**
 * File: Pegawai.java
 * Deskripsi: Kelas dasar untuk semua pegawai di universitas
 */

 import java.text.SimpleDateFormat;
 import java.util.Calendar;
 import java.util.Date;
 import java.util.concurrent.TimeUnit;
 
 public class Pegawai {
     protected String nip;
     protected String nama;
     protected Date tanggalLahir;
     protected Date tmt; // Terhitung Mulai Tanggal
     protected double gajiPokok;
     
     public Pegawai() {
         
     }
     
     public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
         this.nip = nip;
         this.nama = nama;
         this.tanggalLahir = tanggalLahir;
         this.tmt = tmt;
         this.gajiPokok = gajiPokok;
     }
     
     // Menghitung masa kerja dalam tahun dan bulan
     public int[] hitungMasaKerja() {
         Calendar tmtCal = Calendar.getInstance();
         tmtCal.setTime(tmt);
         
         Calendar hariIni = Calendar.getInstance();
         
         long bedaMillis = Math.abs(hariIni.getTimeInMillis() - tmtCal.getTimeInMillis());
         long bedaHari = TimeUnit.DAYS.convert(bedaMillis, TimeUnit.MILLISECONDS);
         
         int tahun = (int) (bedaHari / 365);
         int bulan = (int) ((bedaHari % 365) / 30);
         
         return new int[] {tahun, bulan};
     }
     
     // Format tanggal untuk tampilan
     protected String formatTanggal(Date tanggal) {
         SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
         return sdf.format(tanggal);
     }
     
     // Menampilkan informasi pegawai
     public void printInfo() {
         System.out.println("NIP : " + nip);
         System.out.println("Nama : " + nama);
         System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
         System.out.println("TMT : " + formatTanggal(tmt));
         System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
     }
 }