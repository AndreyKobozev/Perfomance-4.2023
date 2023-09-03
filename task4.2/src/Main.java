import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\IdeaProjects\\task4.2\\src\\Poem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                queue.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
            return;
        }

        printQueueWithDelay(queue);
    }

    public static void printQueueWithDelay(Queue<String> queue) {
        Random random = new Random();

        while (!queue.isEmpty()) {
            String line = queue.poll();
            System.out.println(line);

            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}