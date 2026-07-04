package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        
        buku.tambahKontak(new Kontak("Amanda", "+123123", "amanda@gmail.com"));
        buku.tambahKontak(new Kontak("Siti", "+123123", "siti@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "+123123", "citra@gmail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println();
        
        bukuLain.cariKontak("Amanda");
        System.out.println();
        
        bukuLain.hapusKontak("Amanda");
        System.out.println();
        
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}