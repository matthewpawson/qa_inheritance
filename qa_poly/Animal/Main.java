public class Main {

    public static void main(String[] args) {

        Animal collard = new Bird("collard");
        Bird spoonbill = new Bird("spoonbill");
        Penguin penguin = new Penguin("penguin");
        Animal[] animalArray = {penguin, collard, spoonbill, new Fish("fish")};

        for (Animal animal : animalArray)
            System.out.println(animal.toString());
    }
}
