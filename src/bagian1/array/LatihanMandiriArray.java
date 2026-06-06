package bagian1.array;

public class LatihanMandiriArray {

    public static void main(String[] args) {

        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) {
                max = s;
            }

            if (s < min) {
                min = s;
            }
        }
        
        System.out.println("Tertinggi : " + max);
        System.out.println("Terendah  : " + min);
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("\n Soal 2");
                System.out.println(h);
            }
        }
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int n : angka) {
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\n Soal 3");
        System.out.println("Jumlah angka genap = " + jumlahGenap);
    }
     
}
