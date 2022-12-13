public class Main {
    public static void main(String[] args) {

        System.out.println("Mammals");
        Mammal mammal = new Mammal();

        mammal.setAge(5);
        mammal.setWeight(120);

        Dolphin dolphin = new Dolphin("Blue Dolphin");
        System.out.println(dolphin);
    }
}