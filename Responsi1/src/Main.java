public class Main {
    public static void main(String[] args) {
        // Membuat beberapa fakultas
        Fakultas[] fakultasList = new Fakultas[3];
        fakultasList[0] = new Fakultas("Teknik", 10000000, 5000000);
        fakultasList[1] = new Fakultas("Ekonomi", 8000000, 4500000);
        fakultasList[2] = new Fakultas("Kedokteran", 12000000, 6000000);

        // Membuat beberapa karyawan
        Karyawan[] karyawanList = new Karyawan[4];
        karyawanList[0] = new Dosen("Prof. Aris", "aris@undip.ac.id", "D001", 10, "Teknik");
        karyawanList[1] = new Dosen("Dr. Yeva", "yeva@undip.ac.id", "D002", 5, "Ekonomi");
        karyawanList[2] = new Tendik("Pak Edy", "edy@undip.ac.id", "T001", 8);
        karyawanList[3] = new Tendik("Bu Khodijah", "khodijah@undip.ac.id", "T002", 3);

        // Membuat universitas
        Universitas undip = new Universitas("Universitas Diponegoro", fakultasList, karyawanList);

        // Membuat beberapa mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Anomali", "anomali@student.undip.ac.id", "24060120140123", 3, "Teknik");
        Mahasiswa mhs2 = new Mahasiswa("Tung Tung", "tungtung@student.undip.ac.id", "24060120150145", 5, "Ekonomi");
        Mahasiswa mhs3 = new Mahasiswa("Sahur", "sahur@student.undip.ac.id", "24060120160167", 1, "Kedokteran");

        // Demo informasi universitas
        System.out.println("=== INFORMASI UNIVERSITAS ===");
        System.out.println("Nama Universitas: " + undip.getNama());
        System.out.println("\nDaftar Fakultas:");
        for (Fakultas f : undip.getFakultas()) {
            System.out.println(String.format("- %s (UKT: Rp%,.0f)", f.getNama(), f.getTarifUKT()));
        }

        // Demo informasi civitas akademika
        System.out.println("\n=== INFORMASI CIVITAS AKADEMIKA ===");
        System.out.println("Total Civitas Akademika: " + CivitasAkademika.getStaticCounter());

        // Demo informasi mahasiswa
        System.out.println("\n=== INFORMASI MAHASISWA ===");
        mhs1.getInfo();
        System.out.println(String.format("UKT semester ini: Rp%,.0f", mhs1.hitungUKT(fakultasList[0].getTarifUKT())));
        
        System.out.println();
        mhs2.getInfo();
        System.out.println(String.format("UKT semester ini: Rp%,.0f", mhs2.hitungUKT(fakultasList[1].getTarifUKT())));

        // Demo informasi karyawan
        System.out.println("\n=== INFORMASI KARYAWAN ===");
        for (Karyawan k : undip.getKaryawan()) {
            k.getInfo();
            if (k instanceof Dosen) {
                System.out.println(String.format("Gaji: Rp%,.0f", k.hitungGaji(((Dosen)k).getFakultas().equals("Teknik") ? 5000000 : 4500000)));
            } else {
                System.out.println(String.format("Gaji: Rp%,.0f", k.hitungGaji(0)));
            }
            System.out.println();
        }

        // Demo perubahan data
        System.out.println("\n=== DEMO PERUBAHAN DATA ===");
        System.out.println("Sebelum perubahan:");
        mhs3.getInfo();
        
        mhs3.setSemester(2);
        mhs3.setEmail("sahur.new@student.undip.ac.id");
        System.out.println("\nSetelah perubahan:");
        mhs3.getInfo();
        System.out.println(String.format("UKT semester berikutnya: Rp%,.0f", mhs3.hitungUKT(fakultasList[2].getTarifUKT())));
    }
}