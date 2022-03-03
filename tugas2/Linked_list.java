package tugas2;

import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("\t\t\t------------------------TUGAS 2-----------------------");
        System.out.println("\t\t\t======================================================");
        System.out.println("\n");
        LinkedList <String> nama = new LinkedList<String>();
        LinkedList <String> nama1 = new LinkedList<String>();
        nama1.add("I");
        nama1.add("Q");
        nama1.add("B");
        nama1.add("A");
        nama1.add("L");
        nama1.add(" ");
        nama1.add("F");
        nama1.add("I");
        nama1.add("R");
        nama1.add("M");
        nama1.add("A");
        nama1.add("N");
        nama1.add("S");
        nama1.add("Y");
        nama1.add("A");
        nama1.add("H");
        System.out.println("nama awal\t\t: "+ nama1 +"\nukuran list\t\t: "+nama1.size());
        System.out.println("\n");

        //add
        nama1.add("O");
        nama1.add(7,"Q");
        nama1.add(" ");
        nama.add("H");
        nama1.addFirst("X");
        nama1.addAll(nama);
        System.out.println("menambah karakter lain yang diinginkan");
        System.out.println("setelah ditambah\t: "+ nama1 +"\nukuran list\t\t: "+nama1.size());
        System.out.println("\n");

        //set
        nama1.set(19, "O");
        nama1.set(0, "T");
        System.out.println("menyisipkan karakter lain yang diinginkan");
        System.out.println("setelah disisip\t\t: "+ nama1+"\nukuran list\t\t: "+nama1.size());
        System.out.println("\n"); 

        //remove
        nama1.removeFirst();
        nama1.removeLast();
        nama1.remove(18);
        nama1.remove(17);
        nama1.remove(7);
        System.out.println("menghapus karakter lain yang diinginkan");
        System.out.println("setelah dihapus\t\t: "+ nama1+"\nukuran list\t\t: "+nama1.size());
        System.out.println("\n");

        //pop 
        System.out.println("menggunakan fungsi pop "); 
        System.out.println("Objek yang dikeluarkan (Pop) : "+ nama1.get(0) + " dan "+ nama1.get(1));   
        nama1.pop();
        nama1.pop();      
        System.out.println("hasil\t\t\t: "+ nama1+"\nukuran list\t\t: "+nama1.size());
        System.out.println("\n");

        //push
        System.out.println("menggunakan fungsi push ");   
        nama1.push("Q");
        nama1.push("I");
        nama1.push("Kelas B");
        System.out.println("Objek yang dimasukkan (Push) : "+ nama1.get(2) + ", " + nama1.get(1) +" dan "+ nama1.get(0));    
        System.out.println("hasil\t\t\t: "+ nama1+"\nukuran list\t\t: "+nama1.size());
        
        
    }
}
