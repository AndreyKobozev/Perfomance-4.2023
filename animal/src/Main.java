public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cat(), new Cat(), new Tiger()};
        int countCats = 0;
        int countDog = 0;
        int countTiger = 0;

        for (Animal animal : animals) {
            int distance = animal.randomDistance();
            animal.run(distance);
            animal.swim(distance);
            if (animal instanceof Cat) {
                countCats++;
            }
            if (animal instanceof Dog) {
                countDog++;
            }
            if (animal instanceof Tiger) {
                countTiger++;
            }
            System.out.println("котов "+ countCats);
            System.out.println("собак "+ countDog);
            System.out.println("тигров "+ countTiger);
        }
    }
}