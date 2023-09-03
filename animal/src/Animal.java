import java.util.Random;

abstract class Animal {
    public abstract void run(int distance);
    public abstract void swim(int distance);

    public int randomDistance(){
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
}
