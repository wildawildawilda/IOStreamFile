//Nama : Wilda Yanti
//Npm : 2410010569
package tugas;

public class MainTugas {

    public static void main(String[] args) {
        String[] kategori = {"Elektronik", "Peralatan Dapur", "Alat Kebersihan"};
        System.out.println("=== Daftar Kategori Barang Rumah Tangga ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Kulkas 2 Pintu", 3500000, 5));
        gudang.tambahBarang(new Barang("Blender Mini", 250000, 15));
        gudang.tambahBarang(new Barang("Sapu Lipat", 45000, 30));
        gudang.tambahBarang(new Barang("Rice Cooker", 400000, 12));
        gudang.tambahBarang(new Barang("Wajan Anti Lengket", 180000, 20));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();

        System.out.println();
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total nilai persediaan item = Rp" + gudangBaru.totalNilai());
    }
}