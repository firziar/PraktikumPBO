/**
 * File: Main.java
 * Deskripsi: Kelas utama untuk menguji kelas BangunDatar, Persegi, dan Lingkaran
 * Pembuat: Firzi Assidqie Ramadhani
 */

public class Main {
    public static void main(String[] args) {
        // Bagian 1 - Abstract Class
        // BangunDatar B1 = new BangunDatar(); // Error karena BangunDatar adalah abstract class
        
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);
        
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P2: " + P2.getKeliling());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());
        System.out.println("Luas L2: " + L2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());
        
        // Penggunaan method isEqualLuas dan isEqualKeliling
        System.out.println("P1 sama luas dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("P1 sama keliling dengan P2? " + P1.isEqualKeliling(P2));
        System.out.println("P1 sama luas dengan L1? " + P1.isEqualLuas(L1));
        System.out.println("P1 sama keliling dengan L1? " + P1.isEqualKeliling(L1));
        
        // Bagian 2 - Interface
        System.out.println("\nPengujian Interface IResize:");
        System.out.println("Sebelum zoom - Sisi P2: " + P2.getSisi());
        P2.zoomIn();
        System.out.println("Setelah zoomIn - Sisi P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Setelah zoomOut - Sisi P2: " + P2.getSisi());
        P2.zoom(2.0);
        System.out.println("Setelah zoom(2.0) - Sisi P2: " + P2.getSisi());
        
        System.out.println("\nSebelum zoom - Jari-jari L2: " + L2.getJari());
        L2.zoomIn();
        System.out.println("Setelah zoomIn - Jari-jari L2: " + L2.getJari());
        L2.zoomOut();
        System.out.println("Setelah zoomOut - Jari-jari L2: " + L2.getJari());
        L2.zoom(1.5);
        System.out.println("Setelah zoom(1.5) - Jari-jari L2: " + L2.getJari());
    }
}