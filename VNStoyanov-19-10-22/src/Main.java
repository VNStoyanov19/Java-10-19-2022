import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lamp's wattage");
        for(int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            Lamp lamp = new Lamp(input);
            lamp.switchLampOnOrOff();
        }

    }
}