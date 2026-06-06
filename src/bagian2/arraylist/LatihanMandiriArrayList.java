
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Dina");
        nama.add("Aldi");
        nama.add("Rina");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    
    ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); nilai.add(95); nilai.add(60);
        nilai.add(88); nilai.add(75);
    int max = nilai.get(0);
    for (int n : nilai) {
    if (n > max) max = n;
    }
    System.out.println("\n Soal 2");
    System.out.println("Terbesar: " + max); // hasil: 95
    
    ArrayList<String> nama2 = new ArrayList<>();
    String[] data = {"Andi","Budi","Ayu","Citra","Adit","Doni"};
    System.out.println("\n Soal 3");
    for (String d : data) nama2.add(d);
    for (String n : nama2) {
        
    if (n.startsWith("A")) System.out.println(n);
        }
    
    // hasil: Andi, Ayu, Adit
    }
}

