public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        if(name.contains("1") || name.contains("2"))
        {
            return;
        }

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}