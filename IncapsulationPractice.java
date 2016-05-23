public class IncapsulationPractice {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //person1.setAge(-20);
        //person1.setName("");
        //person1.speak();
        Person1 person = new Person1("Bob", 30);
        person.speak();

    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can't be empty");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age should be more than 0");
        } else {
            this.age = age;
        }
    }

    public void speak() {
        System.out.println("My name is " + name + ". I'm " + age + " years old.");
    }

}

class Person1 {
    private String name1;
    private int age1;

    public Person1(String name1, int age1) {
        this.name1 = name1;
        this.age1 = age1;
    }

    public void speak() {
        if (name1.isEmpty()) {
            System.out.println("Name can't be empty");
        } else if (age1 <= 0) {
            System.out.println("Age should be more than 0");
        } else {
            System.out.println("My name is " + name1 + ". I'm " + age1 + " years old.");
        }
    }
}