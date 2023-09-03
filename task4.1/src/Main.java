import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Чтение файла
            BufferedReader reader = new BufferedReader(new FileReader("D:\\IdeaProjects\\task4.1\\src\\Poem.txt"));
            StringBuilder poem = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                poem.append(line).append("\n");
            }
            reader.close();

            // Разделение стихотворения на абзацы
            String[] paragraphs = poem.toString().split("\n\n");

            // Создание новых файлов и запись абзацев в них
            for (int i = 0; i < paragraphs.length; i++) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("part" + (i + 1) + ".txt"));
                writer.write(paragraphs[i]);
                writer.close();
            }

            System.out.println("Файлы успешно созданы.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файлов.");
        }
    }
}