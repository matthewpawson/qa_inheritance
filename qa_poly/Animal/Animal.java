public class Animal {
    protected String name;
    public Animal() {}
    public Animal(String name){
        this.name = name;
    }
    public void rest() {
        System.out.println("Animal rested.");
    }
    public void eat() {
        System.out.println("Animal ate food.");
    }
    public void hunt() {
        System.out.println("Animal hunted for food.");
    }
    public void flee(){
        System.out.println("Animal fled.");
    }
    public void breed(){
        System.out.println("Animal mated.");
    }
    @Override
    public String toString() {
        return "This is an animal, named " + name + ".";
    }
}

class Fish extends Animal {
    public Fish(String name){
        super(name);
    }
    public void swim() {
        System.out.println("Fish swam.");
    }
    @Override
    public String toString() {
        return "This is a fish, a type of animal. It is named " + name + ".";
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println("Bird flew.");
    }
    public void makeNest(){
        System.out.println("Bird made a nest.");
    }
    public void migrate() {
        System.out.println("Bird migrated.");
    }
    @Override
    public String toString() {
        return "This is a bird, a type of animal. It is named " + name + ".";
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly!");
    }
    @Override
    public String toString() {
        return "This is a penguin, a type of bird. It is named " + name + ".";
    }
}

class Owl extends Bird {
    public Owl(String name){
        super(name);
    }
    @Override
    public void rest() {
        System.out.println("Owl rested during the day.");
    }
    @Override
    public String toString() {
        return "This is an owl, a type of bird. It is named " + name + ".";
    }
}