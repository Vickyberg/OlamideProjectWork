package Chapter16;


import java.util.Arrays;
import java.util.Collections;
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
        list = Arrays.asList(deck);
        Collections.shuffle(list);

    }

    public  void  printCards(){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%-19s%s", list.get(i), ((i+1) % 4 == 0) ? System.lineSeparator() : "");
        }
    }
    public  static void  main(String[] args){
        DecksOfCards cards = new DecksOfCards();
        cards.printCards();
    }

}
