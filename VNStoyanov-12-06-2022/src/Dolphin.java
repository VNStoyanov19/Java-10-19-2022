public class Dolphin extends Mammal {
    private String type;

    public Dolphin(String type) {
        super.getAge();
        super.getWeight();
        this.type = type;
    }

    public Dolphin(int age, int weight, String type) {
        super(age, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
