package tugas;

public class MainTugas {
    //Faqihhuddin (2410010327)
    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        // Menambahkan minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Ical", "10321", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Ozan", "10322", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Faqih", "10323", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Adit", "10324", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Alam", "10325", 50));

        System.out.println();
        kelas.tampilkanSemua();

        System.out.println("\nRata-rata nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah lulus : "
                + kelas.jumlahLulus());

        // Menambah satu mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "10326", 85));

        System.out.println("\nSetelah menambah data baru:");
        System.out.println("Jumlah mahasiswa sekarang : "
                + kelas.jumlahMahasiswa());
    }
}