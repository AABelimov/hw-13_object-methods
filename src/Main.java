public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Book warAndPeace = new Book("War and Peace", tolstoy, 1867);
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoevsky, 1866);

        warAndPeace.setYear(2025);
        System.out.println(crimeAndPunishment);
    }
}