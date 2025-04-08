/**
 * File: Persegi.java
 * Deskripsi: Kelas Persegi yang merepresentasikan bangun datar persegi
 * Pembuat: Firzi Assidqie Ramadhani
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi() {
        setJmlSisi(4);
    }
    
    public Persegi(double sisi) {
        this.sisi = sisi;
        setJmlSisi(4);
    }
    
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
    
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }
    
    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }
    
    @Override
    public void zoom(double factor) {
        this.sisi = this.sisi * factor;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}