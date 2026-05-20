package CaseMethod;

public class Order {
    int OrderCode;
    String OrderName;
    int price;

    public Order() {
    }

    public Order(int a, String b, int d) {
        OrderCode = a;
        OrderName = b;
        price = d;
    }

    void print() {
        
        System.out.println(OrderCode + "\t" + OrderName + "\t" + price);
    }
}