public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dosen1 = new Dosen17();
        dosen1.tampilInformasi();

        Dosen17 dosen2 = new Dosen17("ROV712", "Rokhimatul Wakhidah, S.Pd., M.T.", true, 2010, "Sistem Operasi");
        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);
        System.out.println("Status aktif telah diperbarui.");
        dosen2.tampilInformasi();

        int tahunSekarang = 2025;
        int masaKerja = dosen2.hitungMasaKerja(tahunSekarang);
        System.out.println("Masa kerja adalah " + masaKerja + " tahun.");

        dosen2.ubahKeahlian("Algoritma dan Struktur Data");
        System.out.println("Bidang keahlian telah diperbarui.");
        dosen2.tampilInformasi();
    }
}
