public class Cat extends Animal{

    private int distRun = 200;
    private int distSwim = 0;

    @Override
    public void run(int distance){
        if (distance <= distRun) {
            System.out.println("Кот пробежала " + distance + " метров.");
        }
        else {
            System.out.println("Кот не может пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance){
        System.out.println("Кот не умеет плавать");
    }
}
