import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    int selectedType;
    int random;
    int countdown = 51;
    int selectedWorth;
    Card drawnCard;

    public Deck() {
    }

    public void makeDeck() {
        for (int i = 0; i <= 51; i++) {
            numbers.add(i+1);
        }
        for (int i = 0; i <= 51; i++) {
            random = (int) (Math.random() * countdown);
            selectedWorth = numbers.get(random);
            calc();
            cards.add(new Card(selectedWorth , selectedType));
            numbers.remove(random);
            countdown--;
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card drawCard() {
        drawnCard = cards.get(0);
        cards.remove(0);
        return drawnCard;
    }

    public void calc() {
        if (selectedWorth > 39) {
            selectedType = 4;
            selectedWorth = selectedWorth-39;
        } else if (selectedWorth >= 26 && selectedWorth < 39) {
            selectedType = 3;
            selectedWorth = selectedWorth-26;
        } else if (selectedWorth >= 13 && selectedWorth < 26) {
            selectedType = 2;
            selectedWorth = selectedWorth-13;
        } else {
            selectedType = 1;
        }
    }
}
