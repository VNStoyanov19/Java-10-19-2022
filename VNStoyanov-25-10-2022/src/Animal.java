public class Animal {
    private String breed;
    private int age;

    public static int test = 1;

    public Animal() {
        this.age = 10;
    }

    public Animal(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void test(){
        test++;
    }
}