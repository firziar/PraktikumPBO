public class Mahasiswa {
    /* atribut */
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul;
    private int jumlahMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* method */

    public Mahasiswa() {
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
    }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public Dosen getDosenWali() { return dosenWali; }
    public void setDosenWali(Dosen dosenWali) { this.dosenWali = dosenWali; }

    public Kendaraan getKendaraan() { return kendaraan; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }

    public void addMatKul(MataKuliah matkul) {
        if (jumlahMatkul < 50) {
            listMatkul[jumlahMatkul] = matkul;
            jumlahMatkul++;
        } else {
            System.out.println("Tidak dapat menambahkan mata kuliah, kapasitas penuh.");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += listMatkul[i].getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return jumlahMatkul;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("- " + listMatkul[i].getNama());
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali: Belum ditentukan");
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")");
        } else {
            System.out.println("Kendaraan: Tidak ada");
        }
    }
}