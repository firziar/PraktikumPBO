public class Kendaraan {
    /* atribut */
    private String noPlat;
    private String jenis;

    /* Konstruktor tanpa parameter */
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    /* Konstruktor dengan parameter */
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* Selektor (Getter) */
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    /* Mutator (Setter) */
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}