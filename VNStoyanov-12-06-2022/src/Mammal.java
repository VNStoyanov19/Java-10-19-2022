public class Mammal {
    private int age;
    private int weight;

    public Mammal() {
        this.age = 0;
        this.weight = 0;
    }

    public Mammal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        if (age < 0) {
            return age;
        }
    }

}
