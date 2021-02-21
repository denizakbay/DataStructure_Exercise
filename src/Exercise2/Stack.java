package Exercise2;

public class Stack {
    //properties
    int maxTop;
    int top;
    double[] values;
    int size;

    //constructer
    public Stack(int size) {
        this.size = size;
        maxTop = size - 1;
        top = -1;
        values = new double[size];
    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (size == top + 1)
            return true;
        else
            return false;


    }

    void push(double value) {

        if (isFull())
            System.out.println("stack is full.");
        else {
            top++;
            values[top] = value;
        }

    }

    double pop() {
        if (isEmpty()) {
            System.out.println("stack is empty. error!");
            return -1;
        } else {
            return values[top--];
        }

    }

    double top(double value) {

        if (isEmpty()) {
            System.out.println("stack is empty. error!");
            return -1;
        } else {
            return values[top];
        }
    }

    void displayStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(values[i] + " ");
        }

    }


}