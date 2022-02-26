package Tugas1SDA;
import java.util.ArrayList;

public class NO3 {
public static void main(String[] args) {
    //String[] nama= {"S","Y","A","H"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("S");
    nama.add("Y");
    nama.add("A");
    nama.add("H");

    //soal no 3
    //perintah get(0) get(2) get(6) get(-3)
    System.out.println("hasil dari get(0) = "+ nama.get(0));
    System.out.println("hasil dari get(2) = "+ nama.get(2));
    System.out.println("hasil dari get(6) = "+ nama.get(6));
    System.out.println("hasil dari get(-3) = "+ nama.get(-3));
}
   
}
