import java.util.Scanner;

public class QueueMain {
    
    public static void menu() {
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari letak indeks dengan NIM");
        System.out.println("7. Cari letak indeks dengan Nama");
        System.out.println("8. Cari letak indeks dengan Absen");
        System.out.println("9. Mencetak data mahasiswa berdasarkan urutan indeks");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas mahasiswa : ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM Mahasiswa : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String n = sc.nextLine();
                    System.out.print("Absen Mahasiswa : ");
                    int a = sc.nextInt();
                    System.out.print("IPK : ");
                    double i = sc.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, n, a, i);
                    sc.nextLine();
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama ) && (data.absen) != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar : ");
                        System.out.println("NIM : "+data.nim);
                        System.out.println("Nama : "+data.nama);
                        System.out.println("Absen : "+data.absen);
                        System.out.println("IPK : "+data.ipk);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
                    String cari = sc.nextLine();
                    antri.peekPositionNim(cari);
                case 7:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari : ");
                    String car = sc.nextLine();
                    antri.peekPositionNama(car);
                case 8:
                    System.out.print("Masukkan Absen Mahasiswa yang dicari : ");
                    int ca = sc.nextInt();
                    antri.peekPositionAbsen(ca);
                case 9:
                    System.out.print("Masukkan urutan mahasiswa yang anda cari : ");
                    int p = sc.nextInt();
                    antri.printMahasiswa(p);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}