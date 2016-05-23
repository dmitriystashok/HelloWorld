public class InheritancePractice {
    public static void main(String[] args) {
        Animal[] all = {
                new Animal(),
                new Dog(),
                new Cat()
        };
        for (Animal i:all){
            i.eat();
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal can eat");
    }

    public void sleep() {
        System.out.println("Animal can sleep");
    }
}

class Dog extends Animal {
    public void say() {
        System.out.println("The dog say Woof!!!");
    }

    public void eat() {
        System.out.println("The dog eat meat!");
    }
}

class Cat extends Animal {
    public void say() {
        System.out.println("The cat say Meow!!!");
    }

    public void eat() {
        System.out.println("The cat eat fish!");
    }
}