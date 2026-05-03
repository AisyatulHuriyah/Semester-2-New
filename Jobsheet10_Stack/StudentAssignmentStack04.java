package Jobsheet10_Stack;

public class StudentAssignmentStack04 {
    Student04[] stack;
    int size;
    int top;

    public StudentAssignmentStack04(int size) {
        this.size = size;
        stack = new Student04[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Student04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public Student04 pop() {
        if (isEmpty()) {
            System.out.println("Stack still empty!");
            return null;
        } else {
            Student04 temp = stack[top];
            stack[top] = null;
            top--;
            return temp;
        }
    }

    public Student04 peek() {
        if (isEmpty()) {
            System.out.println("Stack still empty!");
            return null;
        } else {
            return stack[top];
        }
    }

    public void print() {
        System.out.println("NIM\tNama\tKelas");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println();
    }

    // modify question no 5
    public Student04 firstSubmitted() {
    if (isEmpty()) {
        System.out.println("Stack masih kosong!");
        return null;
    } else {
        return stack[0];   // elemen pertama di indeks 0
    }
    }
}
