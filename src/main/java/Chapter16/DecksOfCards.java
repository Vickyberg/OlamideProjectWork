package Chapter16;


import java.util.List;

public class DecksOfCards {

    private List<Card> list;

    public DecksOfCards(){
        Card [] deck = new Card[52];
        int count = 0;

        for ( Card.Suit suit : Card.Suit.values()){
            for (Card.Face face : Card.Face.values()){
                deck[count] = new Card(face,suit);
                ++count;
            }

        }

    }

}
