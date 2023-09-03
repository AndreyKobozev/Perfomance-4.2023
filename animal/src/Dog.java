public class Dog extends Animal{

    private int distRun = 500;
    private int distSwim = 10;

    @Override
    public void run(int distance){
        if (distance <= distRun){
            System.out.println("Собака пробежала " + distance + " метров.");
        }
        else {
            System.out.println("Собака не может пробежать " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance){
        if (distance <= distSwim){
            System.out.println("Собака проплыла " + distance + " метров.");
        }
        else {
            System.out.println("Собака не может проплыть " + distance + " метров.");
        }
    }
}
