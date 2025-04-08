public class Dosen {
    /* Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /* Konstruktor tanpa parameter */
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    /* Konstruktor dengan parameter */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Selektor (Getter) */
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    /* Mutator (Setter) */
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}