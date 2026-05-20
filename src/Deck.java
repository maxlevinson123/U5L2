import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("spades", "A"));
        cards.add(new Card("spades", "02"));
        cards.add(new Card("spades", "03"));
        cards.add(new Card("spades", "04"));
        cards.add(new Card("spades", "05"));
        cards.add(new Card("spades", "06"));
        cards.add(new Card("spades", "07"));
        cards.add(new Card("spades", "08"));
        cards.add(new Card("spades", "09"));
        cards.add(new Card("spades", "10"));
        cards.add(new Card("spades", "J"));
        cards.add(new Card("spades", "Q"));
        cards.add(new Card("spades", "K"));
        cards.add(new Card("hearts", "A"));
        cards.add(new Card("hearts", "02"));
        cards.add(new Card("hearts", "03"));
        cards.add(new Card("hearts", "04"));
        cards.add(new Card("hearts", "05"));
        cards.add(new Card("hearts", "06"));
        cards.add(new Card("hearts", "07"));
        cards.add(new Card("hearts", "08"));
        cards.add(new Card("hearts", "09"));
        cards.add(new Card("hearts", "10"));
        cards.add(new Card("hearts", "J"));
        cards.add(new Card("hearts", "Q"));
        cards.add(new Card("hearts", "K"));
        cards.add(new Card("diamonds", "A"));
        cards.add(new Card("diamonds", "02"));
        cards.add(new Card("diamonds", "03"));
        cards.add(new Card("diamonds", "04"));
        cards.add(new Card("diamonds", "05"));
        cards.add(new Card("diamonds", "06"));
        cards.add(new Card("diamonds", "07"));
        cards.add(new Card("diamonds", "08"));
        cards.add(new Card("diamonds", "09"));
        cards.add(new Card("diamonds", "10"));
        cards.add(new Card("diamonds", "J"));
        cards.add(new Card("diamonds", "Q"));
        cards.add(new Card("diamonds", "K"));
        cards.add(new Card("clubs", "A"));
        cards.add(new Card("clubs", "02"));
        cards.add(new Card("clubs", "03"));
        cards.add(new Card("clubs", "04"));
        cards.add(new Card("clubs", "05"));
        cards.add(new Card("clubs", "06"));
        cards.add(new Card("clubs", "07"));
        cards.add(new Card("clubs", "08"));
        cards.add(new Card("clubs", "09"));
        cards.add(new Card("clubs", "10"));
        cards.add(new Card("clubs", "J"));
        cards.add(new Card("clubs", "Q"));
        cards.add(new Card("clubs", "K"));
        this.cards = cards;
    }
}
