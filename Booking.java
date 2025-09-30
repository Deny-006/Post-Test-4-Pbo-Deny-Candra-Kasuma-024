/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public abstract class Booking { 
    protected String namaPemesan;
    protected String tanggal;
    protected String jam;

    public Booking(String namaPemesan, String tanggal, String jam) {
        this.namaPemesan = namaPemesan;
        this.tanggal = tanggal;
        this.jam = jam;
    }

    // Getter Setter
    public String getNamaPemesan() { return namaPemesan; }
    public void setNamaPemesan(String namaPemesan) { this.namaPemesan = namaPemesan; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getJam() { return jam; }
    public void setJam(String jam) { this.jam = jam; }

    public abstract String getDetail();

    @Override
    public String toString() {
        return namaPemesan + " | " + tanggal + " | " + jam;
    }
}
