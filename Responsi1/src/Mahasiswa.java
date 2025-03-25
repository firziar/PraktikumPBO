public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private String fakultas;
    private int semester;
    private String universitas = "Universitas Diponegoro";
    
    public Mahasiswa(String nama, String email, String nim, int semester, String fakultas) {
        super(nama, email);
        this.nim = nim;
        this.fakultas = fakultas;
        this.semester = semester;
        this.universitas = "Universitas Diponegoro";
    }    
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public double hitungUKT(double tarifUKT) {
        return tarifUKT * Math.pow(0.95, semester - 1);
    }
    
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Semester: " + semester);
        System.out.println("Universitas: " + universitas);
    }
}