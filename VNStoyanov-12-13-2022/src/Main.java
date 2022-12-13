import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gosho");
        Mammal person2 = new Person("Tosho");
        Animal person3 = new Person("Ivan");
        System.out.println("PERSON: I");

        System.out.println(person.getName());
        person.eat();
        person.walk();
        System.out.println("Jim");
        person2.walk();
        if (person2.getClass() == Person.class) {
            ((Person) person2).eat();
        }
    }
}
