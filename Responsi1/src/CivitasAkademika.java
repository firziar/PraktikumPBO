public abstract class CivitasAkademika {
    private String nama;
    private String email;

    private static int staticCounter;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        staticCounter++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}