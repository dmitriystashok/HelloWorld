public class ToStringAndObject {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 30);
        Human human2 = new Human("Billy", 25);
        System.out.println(human1);
        System.out.println(human2);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This is " + name + ", and he is " + age + " years old!";
    }
}
