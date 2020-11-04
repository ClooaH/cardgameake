public class Game {

    Card card = new Card(2,2);
    Card card2 = new Card(2,3);

    public static void main(String[] args) {
        String gameWinner = "";
        Deck deck = new Deck();
        deck.makeDeck();
        System.out.println(deck.getCards());

        Card card = deck.drawCard();
        Card card2 = deck.drawCard();
        System.out.println(card.toString() + " , " + card2.toString());

        gameWinner = getGameWinner(gameWinner, card, card2);
        System.out.println(gameWinner);
    }

    public static String getGameWinner(String gameWinner, Card card, Card card2) {
        if (card.getWorth() < card2.getWorth()) {
            gameWinner = "Player 2 wins!";
        } else if (card.getWorth() > card2.getWorth()) {
            gameWinner = "Player 1 wins!";
        } else {
            if (card.getType() < card2.getType()) {
                gameWinner = "Player 2 wins!";
            } else if (card.getType() > card2.getType()) {
                gameWinner = "Player 1 wins!";
            }
        }
        return gameWinner;
    }
}
