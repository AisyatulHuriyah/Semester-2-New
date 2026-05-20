package CaseMethod;

public class Buyer {
    String Name;
    String MobileNumber;

    public Buyer() {
    }

    public Buyer(String b, String c) {
        Name = b;
        MobileNumber = c;
    }

    void print() {
        System.out.print("\t" + Name + "\t\t" + MobileNumber);
    }
}