package se.iths.romeo.Prob;

public class Dice {
    public static void main() {
        String firstNamePlayerOne = IO.readln("Spelare 1 skriv in ditt förnamn: ");
        String lastnamePlayerone = IO.readln("spelare 1 skriv efternamn: ");

        String Romeo2 = IO.readln();
        String Julia2 = IO.readln();

        Player player1 = new Player(firstNamePlayerOne, lastnamePlayerone);
        Player player2 = new Player(Romeo2, Julia2);
        int resultat1 = (int) (Math.random() * 6) + 1;
        int resultat2 = (int) (Math.random() * 6) + 1;
        player1.addToScore(resultat1);
        System.out.println(player1.getFullName() + " slog " + resultat1);
        player1.addToScore(resultat2);
        System.out.println(player1.getFullName() + " slog " + resultat2);
        int throw1 = (int) (Math.random() * 6) + 1;
        int throw2 = (int) (Math.random() * 6) + 1;
        player2.addToScore(throw1);
        System.out.println(player2.getFullName() + " slog " + throw1);
        player2.addToScore(throw2);
        System.out.println(player2.getFullName() + " slog " + throw2);
        System.out.println(player1.getFullName() + " fick " + player1.getScore());
        System.out.println(player2.getFullName() + " fick " + player2.getScore());

        calculateWinner(player1, player2);

    }

    public static void calculateWinner(Player player1, Player player2 ) {


        if (player1.getScore() > player2.getScore()) {
            System.out.println(" Spelare 1 vinner!!! ");
        }
        else if (player1.getScore() < player2.getScore()) {
            System.out.println(" Spelare 2 vinner!!! ");
        } else {
            System.out.println(" Lika!!! ");
        }

    }

    public static int add(int a, int b){
        return a + b;
    }
}
