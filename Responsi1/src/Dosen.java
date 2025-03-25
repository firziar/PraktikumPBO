public class Dosen extends Karyawan {
    private String fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, String fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji(double gajiPokok) {
        return gajiPokok + (gajiPokok * getMasaKerja() * 0.01);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}