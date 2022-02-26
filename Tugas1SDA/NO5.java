package Tugas1SDA;
import java.util.ArrayList;

public class NO5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("S");
        nama.add("Y");
        nama.add("A");
        nama.add("H");
        System.out.println("ArrayList sebelum remove:");
        for(String var: nama){
             System.out.println(var);
        }
        
        System.out.println("\n");
    
    nama.remove(0); 
    //nama.remove(0);
    System.out.println("ArrayList setelah remove (0):");
       for(String var2: nama){
             System.out.println(var2);
       }
    }
}