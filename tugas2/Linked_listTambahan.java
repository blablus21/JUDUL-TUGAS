package tugas2;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_listTambahan {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("nama\t: IQBAL FIRMANSYAH");
        System.out.println("NIM\t: 2111521014");
        System.out.println("========Tugas 2 SDA TAMBAHAN========\n");
        
        int pil, pil2, data2, pil3;

        LinkedList<String> nama1 = new LinkedList<String>();
        LinkedList<Integer> nim1 = new LinkedList<Integer>();
        LinkedList<String> alamat1 = new LinkedList<String>();

        System.out.println("============ data awal ===============");
        nama1.add("IQBAL");
        nama1.add("VIKRAM");
        nama1.add("AHMAD");

        nim1.add(2111521014);
        nim1.add(2111112027);
        nim1.add(2111101004);

        alamat1.add("pasaman");
        alamat1.add("kinali");
        alamat1.add("talamau");

        System.out.println("Nama\t= "+ nama1);
        System.out.println("Nim\t= "+ nim1);
        System.out.println("Alamat\t= "+ alamat1 + "\n");

        try (Scanner input = new Scanner(System.in)) {
        int ulang = 0;
        while (ulang != 4) {
    
            System.out.println(" ----------MENU----------");
            System.out.println("1. ADD DATA");
            System.out.println("2. SET DATA");
            System.out.println("3. REMOVE DATA");
            System.out.println("4. exit");
            System.out.println("=========================");
            System.out.printf(" masukkan pilihan anda = ");
            pil = input.nextInt();
            System.out.println("\n");

            switch (pil) {
                case 1:
                    System.out.println(" menu operasi penambahan : \n"
                                        + "1. penambahan \n"
                                        + "2. penambahan di awal \n"
                                        + "3. penambahan di akhir \n");
                    System.out.printf(" pilih operasi : ");
                    pil2 = input.nextInt();

                    switch (pil2) {
                        case 1:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan ditambahkan : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");

                            switch (pil3) {
                                case 1:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    
                                    String data1 = input.next();
                                    
                                    nama1.add(data1);
                                    break;

                                case 2:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    data2 = input.nextInt();
                                    nim1.add(data2);
                                    break;
                                    
                                case 3:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    String data3 = input.next();
                                    alamat1.add(data3);
                                    break;
                               default:
                               break; 
                            }break;
                        case 2:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan ditambahkan : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");
                            switch (pil3) {
                                case 1:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    String data1 = input.next();
                                    nama1.addFirst(data1);
                                    break;

                                case 2:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    data2 = input.nextInt();
                                    nim1.addFirst(data2);
                                    break;
                                    
                                case 3:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    String data3 = input.next();
                                    alamat1.addFirst(data3);
                                    break;
                               default:
                               break; 
                            }break;
                        case 3:
                           System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan ditambahkan : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");
                            switch (pil3) {
                                case 1:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    String data1 = input.next();
                                    nama1.addLast(data1);
                                    break;

                                case 2:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    data2 = input.nextInt();
                                    nim1.addLast(data2);
                                    break;
                                    
                                case 3:
                                    System.out.printf("masukkan data yang akan ditambahkan : ");
                                    String data3 = input.next();
                                    alamat1.addLast(data3);
                                    break;
                               default:
                               break; 
                            }  
                            default:
                            break; 
                       
                    } break;
                case 2:
                    System.out.println(" menu operasi penyisipan : \n"
                                        + "1. penyisipan di awal\n"
                                        + "2. penyisipan di akhir \n");
                    System.out.printf(" pilih operasi : ");
                    pil2 = input.nextInt();
                    System.out.println("\n");

                    switch (pil2) {
                        case 1:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan disisip : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");

                            switch (pil3) {
                                case 1:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    String data1 = input.next();
                                    nama1.set(0, data1);
                                    break;

                                case 2:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    data2 = input.nextInt();
                                    nim1.set(0, data2);
                                    break;
                                    
                                case 3:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    String data3 = input.next();
                                    alamat1.set(0, data3);
                                    break;
                               default:
                               break; 
                            }break;
                        case 2:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan disisip : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");
                            switch (pil3) {
                                case 1:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    String data1 = input.next();
                                    nama1.set(2, data1);
                                    break;

                                case 2:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    data2 = input.nextInt();
                                    nim1.set(2, data2);
                                    break;
                                    
                                case 3:
                                    System.out.printf("masukkan data yang akan disisip : ");
                                    String data3 = input.next();
                                    alamat1.set(2, data3);
                                    break;
                               default:
                               break; 
                            }break;  
                            default:
                            break;        
                    }break;
                case 3:
                System.out.println(" menu operasi hapus : \n"
                                        + "1. hapus \n"
                                        + "2. hapus di awal \n"
                                        + "3. hapus di akhir \n" );
                    System.out.printf(" pilih operasi : ");
                    pil2 = input.nextInt();
                    System.out.println("\n");

                    switch (pil2) {
                        case 1:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan dihapus : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");

                            switch (pil3) {
                                case 1:
                                    nama1.remove();
                                    break;

                                case 2:
                                    nim1.remove();
                                    break;
                                    
                                case 3:
                                    alamat1.remove();
                                    break;
                               default:
                               break; 
                            } break;
                        case 2:
                            System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan dihapus : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");

                            switch (pil3) {
                                case 1:
                                    nama1.removeFirst();
                                    break;

                                case 2:
                                    nim1.removeFirst();
                                    break;
                                    
                                case 3:
                                    alamat1.removeFirst();
                                    break;
                               default:
                               break; 
                            }break;
                        case 3:
                           System.out.printf("1. nama \n2. nim \n3. alamat \n pilih data yang akan dihapus : ");
                            pil3 = input.nextInt();
                            System.out.println("\n");

                            switch (pil3) {
                                case 1:
                                    nama1.removeLast();
                                    break;

                                case 2:
                                    nim1.removeLast();
                                    break;
                                    
                                case 3:
                                    alamat1.removeLast();
                                    break;
                               default:
                               break; 
                            }break;
                            default:
                            break;        
                    } break;   
                case 4:
                
                System.out.println("setelah operasi ");
                System.out.println("Nama\t= "+ nama1 + " ukuran : " + nama1.size());
                System.out.println("Nim\t= "+ nim1+ " ukuran : "+ nim1.size());
                System.out.println("Alamat\t= "+ alamat1+" ukuran : " +alamat1.size());
                    
                System.exit(0);
                default:
                 break;
            }
        }

    }

    }
}

           