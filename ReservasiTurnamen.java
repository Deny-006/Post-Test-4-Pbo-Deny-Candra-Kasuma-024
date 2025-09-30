/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class ReservasiTurnamen extends Booking {
    private String namaTim;

    public ReservasiTurnamen(String namaPemesan, String tanggal, String jam, String namaTim) {
        super(namaPemesan, tanggal, jam);
        this.namaTim = namaTim;
    }

    public String getNamaTim() { return namaTim; }
    public void setNamaTim(String namaTim) { this.namaTim = namaTim; }

    @Override
    public String getDetail() {
        return "Turnamen Tim: " + namaTim;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + getDetail();
    }
}
