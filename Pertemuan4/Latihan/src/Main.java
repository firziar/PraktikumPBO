/**
 * File: Main.java
 * Deskripsi: Kelas utama untuk menguji sistem manajemen pegawai universitas
 */

 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 
 public class Main {
     public static void main(String[] args) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
         
         try {
             // Membuat dosen tetap
             DosenTetap dosenTetap = new DosenTetap(
                 "9545647548", // NIP
                 "Andi", // Nama
                 sdf.parse("05-05-1990"), // Tanggal Lahir
                 sdf.parse("01-01-2015"), // TMT
                 5000000.0, // Gaji Pokok
                 "Fakultas Sains dan Matematika", // Fakultas
                 "78647324" // NIDN
             );
             
             // Membuat dosen tamu
             DosenTamu dosenTamu = new DosenTamu(
                 "8756453627", // NIP
                 "Budi", // Nama
                 sdf.parse("12-06-1988"), // Tanggal Lahir
                 sdf.parse("15-03-2020"), // TMT
                 4500000.0, // Gaji Pokok
                 "Fakultas Teknik", // Fakultas
                 "56784532", // NIDK
                 sdf.parse("31-12-2025") // Tanggal berakhir kontrak
             );
             
             // Membuat tenaga kependidikan
             Tendik tendik = new Tendik(
                 "9087564534", // NIP
                 "Cindy", // Nama
                 sdf.parse("23-08-1995"), // Tanggal Lahir
                 sdf.parse("01-06-2018"), // TMT
                 3500000.0, // Gaji Pokok
                 "Akademik" // Bidang
             );
             
             // Menampilkan informasi untuk setiap pegawai
             System.out.println("===== INFORMASI DOSEN TETAP =====");
             dosenTetap.printInfo();
             System.out.println();
             
             System.out.println("===== INFORMASI DOSEN TAMU =====");
             dosenTamu.printInfo();
             System.out.println();
             
             System.out.println("===== INFORMASI TENAGA KEPENDIDIKAN =====");
             tendik.printInfo();
             
         } catch (ParseException e) {
             System.out.println("Error parsing tanggal: " + e.getMessage());
             e.printStackTrace();
         }
     }
 }