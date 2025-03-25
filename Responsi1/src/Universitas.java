public class Universitas {
    private String nama;
    private Fakultas[] fakultas;
    private Karyawan[] karyawan;

    public Universitas(String nama, Fakultas[] fakultas, Karyawan[] karyawan) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.karyawan = karyawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Fakultas[] getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas[] fakultas) {
        this.fakultas = fakultas;
    }

    public Karyawan[] getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan[] karyawan) {
        this.karyawan = karyawan;
    }
}