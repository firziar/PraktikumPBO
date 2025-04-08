/**
 * File: Lingkaran.java
 * Deskripsi: Kelas Lingkaran yang merepresentasikan bangun datar lingkaran
 * Pembuat: Firzi Assidqie Ramadhani
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;
    
    public Lingkaran() {
        setJmlSisi(0);
    }
    
    public Lingkaran(double jari) {
        this.jari = jari;
        setJmlSisi(0);
    }
    
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }
    
    public double getJari() {
        return jari;
    }
    
    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }
    
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
    
    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        this.jari = this.jari * factor;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}