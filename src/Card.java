public class Card {

    int type;
    int worth;

    public Card(int worth, int type) {
        this.worth = worth;
        this.type = type;
    }

    public int getWorth() {
        return worth;
    }

    public int getType() {
        return type;
    }

    public String toString() {
        return "Card{" +
                "type=" + type +
                ", worth=" + worth +
                '}';
    }
}
