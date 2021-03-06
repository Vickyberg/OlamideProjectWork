package ChapterSeven.CreatingAndManipulationOfArray.PokerApp;

import java.security.SecureRandom;

public class DeckOfCards {
    private static final int NUMBER_OF_CLASS =52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    private Card[] deck = new Card[NUMBER_OF_CLASS];
    private int currentCard = 0;

    public DeckOfCards(){
        String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int i = 0; i < deck.length; i++) {

            deck[i] = new Card(faces[i % 13],suits[i / 13] );
            
        }
    }
    public void shuffle(){
        currentCard = 0;

        for (int first = 0;first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CLASS);

            Card temp = deck[first];
            deck[first]= deck[second];
            deck[second] = temp;
        }
    }

    public  Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else {
            return null;
        }
    }

}
