/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Booking;
import Model.Reservasi;
import Model.ReservasiTurnamen;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */

public class Service {
    private final ArrayList<Booking> daftarReservasi = new ArrayList<>();

    // Overloading 1
    public void tambahReservasi(Booking r) {
        daftarReservasi.add(r);
        System.out.println("Reservasi berhasil ditambahkan!");
    }

    // Overloading 2
    public void tambahReservasi(String nama, String tanggal, String jam, String lapangan) {
        daftarReservasi.add(new Reservasi(nama, tanggal, jam, lapangan));
        System.out.println("Reservasi biasa berhasil ditambahkan!");
    }

    // Overloading 3 
    public void tambahReservasi(String nama, String tanggal, String jam, String tim, boolean turnamen) {
        daftarReservasi.add(new ReservasiTurnamen(nama, tanggal, jam, tim));
        System.out.println("Reservasi turnamen berhasil ditambahkan!");
    }

    public void lihatReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi.");
        } else {
            System.out.println("\n--- Daftar Reservasi ---");
            for (int i = 0; i < daftarReservasi.size(); i++) {
                // ✅ Polymorphism → method getDetail() berbeda tiap subclass
                Booking b = daftarReservasi.get(i);
                System.out.println((i + 1) + ". " + b + " [" + b.getDetail() + "]");
            }
        }
    }

    public void ubahReservasi(int index, Booking newData) {
        if (index >= 0 && index < daftarReservasi.size()) {
            daftarReservasi.set(index, newData);
            System.out.println("Reservasi berhasil diperbarui!");
        } else {
            System.out.println("Nomor reservasi tidak valid.");
        }
    }

    public void hapusReservasi(int index) {
        if (index >= 0 && index < daftarReservasi.size()) {
            daftarReservasi.remove(index);
            System.out.println("Reservasi berhasil dihapus!");
        } else {
            System.out.println("Nomor reservasi tidak valid.");
        }
    }

    public int getJumlahReservasi() { return daftarReservasi.size(); }
    public Booking getReservasi(int index) {
        if (index >= 0 && index < daftarReservasi.size()) return daftarReservasi.get(index);
        return null;
    }
}
