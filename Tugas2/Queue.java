public class Queue {

    Mahasiswa[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan adalah : ");
            System.out.println("Nim : " + antrian[front].nim);
            System.out.println("Nama : " + antrian[front].nama);
            System.out.println("Absen : " + antrian[front].absen);
            System.out.println("IPK : " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPositionNim(String n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i].nim == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void peekPositionNama(String n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i].nama == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void peekPositionAbsen(int n) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (antrian[i].absen == n) {
                    System.out.println("Elemen berada pada indeks ke : " + i + " yaitu data ke " + (i + 1));
                } else {
                    System.out.println("Data tidak ditemukan, atau mungkin data sudah dikeluarkan");
                }
            }
        }
    }

    public void printMahasiswa(int position) {
        for(int i = 0; i < max; i++){
            if (i = position){
                System.out.println("Nilai dari indeks tersebut adalah : ");
                System.out.println("Nim : " + antrian[position].nim);
                System.out.println("Nama : " + antrian[position].nama);
                System.out.println("Absen : " + antrian[position].absen);
                System.out.println("IPK : " + antrian[position].ipk);
            }
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang adlah : ");
            System.out.println("Nim : " + antrian[rear].nim);
            System.out.println("Nama : " + antrian[rear].nama);
            System.out.println("Absen : " + antrian[rear].absen);
            System.out.println("IPK : " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Elemen terbelakang adlah : ");
                System.out.println("Nim : " + antrian[i].nim);
                System.out.println("Nama : " + antrian[i].nama);
                System.out.println("Absen : " + antrian[i].absen);
                System.out.println("IPK : " + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terbelakang adlah : ");
            System.out.println("Nim : " + antrian[i].nim);
            System.out.println("Nama : " + antrian[i].nama);
            System.out.println("Absen : " + antrian[i].absen);
            System.out.println("IPK : " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa mhs = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            mhs = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    rear++;
                }
            }
        }
        return mhs;
    }
}