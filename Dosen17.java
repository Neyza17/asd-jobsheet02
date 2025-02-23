public class Dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen17() {
        this.idDosen = "-";
        this.nama = "-";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "-";
    }

    public Dosen17(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("-----------------------------------");
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("-----------------------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif dosen " + nama + " telah diperbarui : " + (status ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        if (thnSkrg < tahunBergabung) {
            System.out.println("Error: Tahun sekarang lebih kecil dari tahun bergabung.");
            return 0;
        }
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " telah diperbarui : " + bidang);
    }
}
