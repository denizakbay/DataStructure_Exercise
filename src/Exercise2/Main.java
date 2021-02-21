package Exercise2;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        System.out.println("stack bos mu?");
        System.out.println(stack.isEmpty());
        stack.push(3.2);
        stack.push(5.3);
        stack.push(3.6);
        stack.push(8.2);
        stack.push(6.2);
        stack.displayStack();
        stack.pop();
        System.out.println();
        stack.displayStack();

    }
}
