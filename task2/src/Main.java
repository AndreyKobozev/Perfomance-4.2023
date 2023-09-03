public class Main {
    public static void main(String[] args) {
        Author god = new Author("God", "heaven@earth.god", 'M');
        Book bible = new Book("Bible", god, 100.50, 1);
        System.out.println(bible.toString());
    }
}