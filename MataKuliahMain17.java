public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.tampilInformasi();

        MataKuliah17 mk2 = new MataKuliah17("ASD26", "Algoritma dan Struktur Data", 2, 6);
        mk2.tampilInformasi();

        
        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();
    }
}
