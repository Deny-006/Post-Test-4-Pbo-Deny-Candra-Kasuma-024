/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Reservasi extends Booking {
    private String lapangan;

    public Reservasi(String namaPemesan, String tanggal, String jam, String lapangan) {
        super(namaPemesan, tanggal, jam);
        this.lapangan = lapangan;
    }

    public String getLapangan() { return lapangan; }
    public void setLapangan(String lapangan) { this.lapangan = lapangan; }

    @Override
    public String getDetail() {
        return "Lapangan: " + lapangan;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + getDetail();
    }
}
