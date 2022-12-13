import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        printHeader();
    }

    public static void printHeader() {
        System.out.println("---------------------");
    }

    Person person = new Person("John", 6);

    Box box = new Box(12, 5, 5);

}
