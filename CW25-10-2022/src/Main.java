import java.util.Collection;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n;
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        for (int i =0; i < n; i++){
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);
        }

        for(int i = 0; i < people.size(); i++){
            if(people.get(i).getAge() >= 30){
                System.out.println((people.get(i)));
            }
        }

    }
}