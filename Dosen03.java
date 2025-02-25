package latihantugas_ALSD3;

public class Dosen03 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen03(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia + " tahun");
        System.out.println("--------------------------------------");
    }
}
