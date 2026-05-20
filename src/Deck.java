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

    public Card getRandomCard() {
        String s = "";
        String v = "";

        // get random suit
        int i = (int) (Math.random() * 4);
        if (i == 0) s = "spades";
        else if (i == 1) s = "hearts";
        else if (i == 2) s = "diamonds";
        else s = "clubs";

        // get random value
        int k = (int) (Math.random() * 13);
        if (k == 0) v = "A";
        else if (k == 1) v = "02";
        else if (k == 2) v = "03";
        else if (k == 3) v = "04";
        else if (k == 4) v = "05";
        else if (k == 5) v = "06";
        else if (k == 6) v = "07";
        else if (k == 7) v = "09";
        else if (k == 8) v = "09";
        else if (k == 9) v = "10";
        else if (k == 10) v = "J";
        else if (k == 11) v = "Q";
        else v = "K";

        return new Card(s, v);
    }
}
