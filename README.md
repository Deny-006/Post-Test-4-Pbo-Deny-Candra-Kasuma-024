# Post-Test-4-Pbo-Deny-Candra-Kasuma-024

Deny Candra Kasuma | Sistem Informasi A | 2409116024

Program ini adalah aplikasi sederhana untuk mengelola reservasi lapangan mini soccer. Data reservasi disimpan dalam **ArrayList** berisi nama pemesan, tanggal, jam, dan lapangan. Pengguna dapat memilih lima menu: menambah reservasi, melihat daftar reservasi, mengubah data, menghapus data, dan keluar. Program berjalan dalam perulangan hingga pengguna memilih keluar, menerapkan konsep **CRUD** (Create, Read, Update, Delete).

Tiga konsep OOP yang digunakan adalah **encapsulation**, **inheritance**, dan **overriding**.

* **Encapsulation**: data disimpan sebagai atribut private/protected (namaPemesan, tanggal, jam, lapangan) dan diakses melalui getter dan setter agar aman.
* **Inheritance**: kelas induk **Booking** berisi data umum, sedangkan **Reservasi** dan **ReservasiTurnamen** mewarisi atribut induk dan menambah data khusus seperti lapangan atau namaTim.
* **Overriding**: method **toString()** ditimpa di tiap subclass agar menampilkan detail sesuai jenis reservasi. Meskipun disimpan dalam list bertipe Booking, Java otomatis memanggil toString() sesuai kelas aslinya.

<img width="402" height="201" alt="image" src="https://github.com/user-attachments/assets/adfcd252-2509-4d55-89e2-b70f13b54097" />

Menerapkan **packages**, memisahkan class sesuai fungsinya:

* **main** → berisi menu utama yang diakses user (`Main`) untuk menampilkan pilihan, menerima input, dan memanggil layanan.
* **model** → menyimpan struktur data pemesanan. `Booking` menjadi **superclass** yang menampung atribut umum (nama, tanggal, jam). `Reservasi` dan `ReservasiTurnamen` adalah **subclass** yang mewarisi `Booking` dan menambahkan data khusus seperti lapangan atau nama tim.
* **service** → menyimpan logika bisnis **CRUD** (`Service`) untuk menambah, menampilkan, mengubah, dan menghapus data reservasi.

Abstraction diterapkan pada **Model/Booking.java** dengan menjadikan `Booking` sebagai **abstract class** dan menambahkan method abstract `getDetail()`, sehingga subclass **Reservasi** dan **ReservasiTurnamen** wajib membuat detailnya sendiri.

Polymorphism terlihat di **Service/Service.java** melalui **overloading** method `tambahReservasi()` yang memiliki beberapa versi parameter, serta di **Reservasi** dan **ReservasiTurnamen** lewat **overriding** method `getDetail()` dan `toString()` untuk menampilkan informasi berbeda sesuai jenis reservasi meski disimpan sebagai tipe `Booking`.

## Penjelasan Output
Menu

<img width="458" height="136" alt="image" src="https://github.com/user-attachments/assets/57bf9638-367c-4447-9469-bca11243f77a" />

Saat program dijalankan, sistem langsung menampilkan menu utama dengan pilihan 1 sampai 5.

<img width="450" height="154" alt="image" src="https://github.com/user-attachments/assets/22dbebbd-d6fe-4cd1-b333-c288deb26d35" />

Jika pengguna salah memasukkan angka, maka akan muncul pesan “Pilihan tidak valid!” agar pengguna hanya memilih menu yang tersedia.

<img width="449" height="232" alt="image" src="https://github.com/user-attachments/assets/6532fb16-56d7-4c7b-a6ef-a2bbb93fceb9" />

Ketika memilih menu Tambah Reservasi(1), pengguna diminta mengisi data seperti nama, tanggal, jam, dan lapangan. Setelah data dimasukkan, program akan menyimpan reservasi tersebut dan menampilkan pesan “Reservasi berhasil ditambahkan!”.

<img width="450" height="229" alt="image" src="https://github.com/user-attachments/assets/7a7df4d6-7a3d-4409-983f-92756e213d72" />


Jika memilih menu Lihat Reservasi(2), program akan menampilkan daftar semua reservasi yang sudah tersimpan. Jika memilih menu Lihat Reservasi, program akan menampilkan daftar semua reservasi yang sudah tersimpan.

<img width="454" height="158" alt="image" src="https://github.com/user-attachments/assets/4b2c32f6-f120-460a-89ad-a702eadd86dd" />

Bila belum ada data, maka muncul pesan “Belum ada data reservasi.”.

<img width="456" height="244" alt="image" src="https://github.com/user-attachments/assets/fd24aa72-0964-492c-9c5f-ae7e333ac70d" />

Pada menu Ubah Reservasi(3), pengguna memilih nomor reservasi yang ingin diubah. Data lama bisa diganti sebagian atau seluruhnya contohnya disini jam reservasi yang awalnya 09:00 menjadi 15:00, lalu sistem menampilkan pesan “Reservasi berhasil diperbarui!” setelah selesai.

<img width="452" height="174" alt="image" src="https://github.com/user-attachments/assets/208fd40d-b4c9-4f80-bfae-1a7ef218a44b" />

Menu Hapus Reservasi(4) digunakan untuk menghapus data berdasarkan nomor reservasi. Jika nomor benar, data dihapus dan muncul pesan “Reservasi berhasil dihapus!”.

<img width="448" height="154" alt="image" src="https://github.com/user-attachments/assets/71f958ed-0923-420d-98b0-24d93b248c16" />

jika memilih menu Keluar(5), program akan berhenti dan menampilkan pesan “Terima kasih! Telah Menggunakan Program.” sebagai penutup.


Penambahan Subclass Reservasi Turnamen

<img width="464" height="245" alt="image" src="https://github.com/user-attachments/assets/8ac6a2c8-c2dc-4b82-9f27-988232ed8968" />

Jika memilih menu **2**, lalu mengisi data pemesan, tanggal, jam, dan nama tim.
Setelah input lengkap, sistem menampilkan pesan **“Reservasi berhasil ditambahkan!”** sebagai konfirmasi data tersimpan.
