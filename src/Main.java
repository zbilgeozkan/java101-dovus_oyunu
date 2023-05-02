public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Player 1", 10, 95, 90, 20);
        Fighter f2 = new Fighter("Player 2", 10, 95, 90, 20);

        Match match = new Match(f1, f2,90,110);
        match.run();

    }
}