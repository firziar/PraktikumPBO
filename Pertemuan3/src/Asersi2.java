// class lingkaran
 class Lingkaran {
    private double jarijari;
    public Lingkaran(double jarijari) {
        assert (jarijari > 0) : "Jari-jari tidak boleh nol atau negatif";
        this.jarijari = jarijari;
    }
    public double  hitungKeliling   () {
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

//class asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        Lingkaran lingkaran1 = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}