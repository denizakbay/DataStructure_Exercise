package Exercise1;

public class House extends A {
    private String color;
    private String door;
    private String window;

    public House(String color, String door, String window){
        this.color = color;
        this.door = door;
        this.window = window;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public static void  writeSomething(){
        System.out.println("Static metod calisti");
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", door='" + door + '\'' +
                ", window='" + window ;

    }


    @Override
    public void writeAddress() {

    }
}


