package Week14;

public class Student04 {
    String nim, name, className;
    double ipk;

    public Student04() {
    }
    public Student04(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }
    void print() {
        System.out.println(nim+" - "+name+" - "+className+" - "+ipk );
    }
}