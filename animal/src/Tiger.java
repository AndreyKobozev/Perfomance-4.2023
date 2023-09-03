public class Tiger extends Animal{

    private int distRun = 1000;
    private int distSwim = 100;

    @Override
    public void run(int distance){
        if (distance <= distRun){
            System.out.println("Тигр проплывет " + distance + " метров.");
        }
        else {
            System.out.println("Тигр не может проплыть " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance){
        if (distance <= distSwim) {
            System.out.println("Тигр проплывет " + distance + " метров.");
        }
        else {
            System.out.println("Тигр не может проплыть " + distance + " метров.");
        }
    }

}
