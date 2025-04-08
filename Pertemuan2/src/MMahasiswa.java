public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah pbo = new MataKuliah("CS101", "Pemrograman Berorientasi Objek", 4);
        MataKuliah alpro = new MataKuliah("CS102", "Algoritma dan Pemrograman", 3);
        MataKuliah statistika = new MataKuliah("MA101", "Statistika", 3);
        MataKuliah basisData = new MataKuliah("CS201", "Basis Data", 3);
        
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("001", "Dr. Ahmad", "Informatika");
        Dosen dosen2 = new Dosen("002", "Prof. Budi", "Matematika");
        
        // Membuat objek Kendaraan
        Kendaraan motor = new Kendaraan("B 1234 AB", "Motor");
        Kendaraan mobil = new Kendaraan("B 5678 CD", "Mobil");
        
        // Membuat objek Mahasiswa dan menghubungkannya dengan objek lain
        
        // Mahasiswa 1
        Mahasiswa mhs1 = new Mahasiswa("1001", "Andi", "Informatika");
        mhs1.setDosenWali(dosen1);  // Set dosen wali (1 mahasiswa punya 1 dosen wali)
        mhs1.setKendaraan(motor);   // Set kendaraan (1 mahasiswa bisa punya 0 atau 1 kendaraan)
        
        // Menambahkan mata kuliah (mahasiswa bisa mengambil 0-50 mata kuliah)
        mhs1.addMatKul(pbo);
        mhs1.addMatKul(alpro);
        mhs1.addMatKul(basisData);
        
        // Mahasiswa 2
        Mahasiswa mhs2 = new Mahasiswa("1002", "Budi", "Informatika");
        mhs2.setDosenWali(dosen1);  // 1 dosen bisa memiliki banyak mahasiswa
        // mhs2 tidak memiliki kendaraan (sesuai relasi 0..1)
        
        // Menambahkan mata kuliah
        mhs2.addMatKul(pbo);
        mhs2.addMatKul(statistika);
        
        // Mahasiswa 3
        Mahasiswa mhs3 = new Mahasiswa("1003", "Citra", "Matematika");
        mhs3.setDosenWali(dosen2);
        mhs3.setKendaraan(mobil);
        
        // Menambahkan mata kuliah
        mhs3.addMatKul(statistika);
        
        // Menampilkan informasi
        System.out.println("=== Informasi Mahasiswa 1 ===");
        mhs1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah diambil: " + mhs1.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());
        System.out.println();
        
        System.out.println("=== Informasi Mahasiswa 2 ===");
        mhs2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah diambil: " + mhs2.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs2.getJumlahSKS());
        System.out.println();
        
        System.out.println("=== Informasi Mahasiswa 3 ===");
        mhs3.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah diambil: " + mhs3.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs3.getJumlahSKS());
        System.out.println();
        
        // Menunjukkan bahwa 1 dosen bisa memiliki banyak mahasiswa
        System.out.println("=== Daftar Mahasiswa dari Dosen " + dosen1.getNama() + " ===");
        System.out.println("- " + mhs1.getNama());
        System.out.println("- " + mhs2.getNama());
    }
}