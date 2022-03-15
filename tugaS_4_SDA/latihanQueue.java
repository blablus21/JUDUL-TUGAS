package tugaS_4_SDA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class latihanQueue {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("nama\t: IQBAL FIRMANSYAH");
        System.out.println("NIM\t: 2111521014");
        System.out.println("========Tugas 4 SDA ========\n");  
        
        String data;
        int i=0;
        boolean bool = true;

        System.out.println("================");
        System.out.println("MEMBUAT ANTRIAN");
        System.out.println("===============\n");  

        Queue<String> antrian = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        System.out.printf("Jumlah data yang akan di masukkan: ");
        i=0;
        int a=input.nextInt();
        do{
            System.out.printf("Masukan data: ");
            data=input.next();
            antrian.add(data);
            i++; 

        } while(i<a);
        System.out.println("Queue: "+antrian);
        System.out.println("Jumlah Antrian : "+antrian.size());
        System.out.println("\n");

        int ulang = 0;
        while (ulang != 5) {
            System.out.println(" ----------MENU----------");
            System.out.println("1. TAMBAH ANTRIAN(ENQUEUE)");
            System.out.println("2. AMBIL ANTRIAN(DEQUEUE)");
            System.out.println("3. PANGGIL ANTRIAN TERATAS");
            System.out.println("4. HAPUS SEMUA ANTRIAN");
            System.out.println("5. exit");
            System.out.println("=========================");
            System.out.printf(" masukkan pilihan anda = ");
            int pil = input.nextInt();
            System.out.println("\n");

            switch (pil) {
                case 1:
                    System.out.printf("Banyak data yang akan di masukkan: ");
                    i=0;
                    int b=input.nextInt();
                    do{
                        System.out.printf("Masukan data: ");
                        data=input.next();
                        antrian.add(data);
                        i++; 
            
                    } while(i<b);
                    System.out.println("Queue: "+antrian);
                    System.out.println("Jumlah Antrian : "+antrian.size());
                    System.out.println("\n"); 
                        break;

                case 2:
                    System.out.println("Ambil data: "+antrian.poll());
                    System.out.println("Queue: "+antrian);
                    System.out.println("Jumlah Antrian : "+antrian.size());
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("data yang dipanggil: "+antrian.peek());
                    System.out.println("Queue: "+antrian);
                    System.out.println("Jumlah Antrian : "+antrian.size());
                    break;

                case 4:
                    System.out.println(" menghapus semua antrian ");
                    antrian.clear();
                    System.out.println("Queue: "+antrian);
                    System.out.println("Jumlah Antrian : "+antrian.size());
                    break;

                case 5:
                    System.out.println("hasil setelah operasi ");
                    System.out.println("queue : "+ antrian +"\n" + "ukuran : " + antrian.size());
                   
                    
                System.exit(0);

                default:
                    break;
            }


        }
    }
}
