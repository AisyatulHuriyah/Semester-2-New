package CaseMethod;

import java.util.Scanner;

class OrderList {
    Order[] orders;
    int count;

    OrderList() {
        orders = new Order[10];
        count = 0;
    }

    void addOrder(Order order) {
        if (count < orders.length) {
            orders[count] = order;
            count++;
        }
    }

    void sortOrdersByName() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (orders[j].OrderName.compareTo(orders[j+1].OrderName) > 0) {
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }

    void printReport() {
        if (count == 0) {
            System.out.println("Belum ada pesanan.");
            return;
        }
        sortOrdersByName();
         System.out.println("\n==============================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==============================");
        System.out.println("Kode\tNama\t\tHarga");
        for (int i = 0; i < count; i++) {
            orders[i].print();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuyerQueue dll = new BuyerQueue();
        OrderList orderList = new OrderList();
        int nextQueueNumber = 1;

        int choice;
        do {
            System.out.println("\n==============================");
            System.out.println("ROYAL DELISH QUEUE SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Report order");
            System.out.println("0. Exit");
            System.out.print("Select menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name Buyer: ");
                    String name = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    String phone = sc.nextLine();
                    dll.addLast(new Buyer(name, phone), nextQueueNumber);
                    System.out.println("Antrian berhasil di tambahkan dengan nomor: " + nextQueueNumber);
                    nextQueueNumber++;
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    if (dll.isEmpty()) {
                        System.out.println("Antrian kosong! Tidak ada pelanggan dipanggil.");
                    } else {
                        Buyer buyer = dll.getFirstBuyer();
                        int nomor = dll.getFirstQueueNumber();
                        System.out.print("Order Code: ");
                        int code = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Order Name: ");
                        String orderName = sc.nextLine();
                        System.out.print("Price: ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        Order newOrder = new Order(code, orderName, price);
                        orderList.addOrder(newOrder);
                        System.out.println(buyer.Name + " telah memesan " + orderName);
                        dll.removeFirst();
                    }
                    break;
                case 4:
                    orderList.printReport();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        sc.close();
    }
}