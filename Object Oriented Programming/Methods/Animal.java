class Animal {
    void makeSound() {
        System.out.println("\n\tGeneric Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("\n\tBark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("\n\tMeow");
    }
}

