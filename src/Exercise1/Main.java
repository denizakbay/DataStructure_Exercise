package Exercise1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        House h1 = new House("pink", "gold", "pimapen");
        House h2 = new House("red", "steel", "pimapen");

        System.out.println("House 1 = " + h1);
        System.out.println("House 2 = " + h2);

        h1.setColor("white");
        System.out.println("House 1 = " + h1);

        House.writeSomething();

    }

}
