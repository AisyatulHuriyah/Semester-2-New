package Jobsheet10_Stack;

public class ExcuseLetterStack04 {
    ExcuseLetter04[] stack;
    int size;
    int top;

    public ExcuseLetterStack04(int size) {
        this.size = size;
        stack = new ExcuseLetter04[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(ExcuseLetter04 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is full! Cannot submit more letters.");
        }
    }

    public ExcuseLetter04 pop() {
        if (isEmpty()) {
            System.out.println("Stack still empty! No letter to process.");
            return null;
        } else {
            ExcuseLetter04 temp = stack[top];
            stack[top] = null;
            top--;
            return temp;
        }
    }

    public ExcuseLetter04 peek() {
        if (isEmpty()) {
            System.out.println("Stack still empty!");
            return null;
        } else {
            return stack[top];
        }
    }

    public ExcuseLetter04 searchByName(String name) {
        for (int i = top; i >= 0; i--) {   // cek dari paling atas
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("No excuse letters in stack.");
        } else {
            System.out.println("ID\tName\tClass\tType\tDuration");
            for (int i = top; i >= 0; i--) {
                ExcuseLetter04 e = stack[i];
                System.out.println(e.id + "\t" + e.name + "\t" + e.className + "\t" + e.typeOfExcuse + "\t" + e.duration);
            }
        }
        System.out.println();
    }
}