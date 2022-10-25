public class Main {

    public static void main(String[] args) {

        Animal collard = new Bird("collard");
        Bird spoonbill = new Bird("spoonbill");
        Penguin penguin = new Penguin("penguin");
        Animal[] animalArray = {penguin, collard, spoonbill, new Fish("fish")};

        for (Animal animal : animalArray) {
            engageInCombat(animal);
        }

        System.out.println();
        engageInCombat(penguin);
    }

    public static void engageInCombat(Animal animal){
        System.out.println(animal.toString());
        animal.hunt();
        animal.flee();
    }
}
