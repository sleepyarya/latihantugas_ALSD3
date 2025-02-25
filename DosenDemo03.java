package latihantugas_ALSD3;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Meminta user menentukan jumlah dosen
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(s.nextLine());

        // Inisialisasi array of object Dosen
        Dosen03[] daftarDosen = new Dosen03[jumlahDosen];

        // Looping FOR untuk input data
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = s.nextLine();
            System.out.print("Nama          : ");
            String nama = s.nextLine();
            System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
            String jk = s.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(s.nextLine());
            System.out.println("--------------------------------------");

            // Membuat objek Dosen dan menyimpannya dalam array
            daftarDosen[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan data menggunakan FOREACH
        System.out.println("\n==== DATA DOSEN ====");
        for (Dosen03 dosen : daftarDosen) {
            dosen.tampilkanInfo();
        }

    }
}
