package ChapterSeven.CreatingAndManipulationOfArray.PokerApp;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCard = new DeckOfCards();
        myDeckOfCard.shuffle();
        System.out.println("=".repeat(75));

        System.out.printf("%40s%n","DECK OF CARDS");
        System.out.println("=".repeat(75));



        for (int i = 1; i <= 52 ; i++) {

            System.out.printf("%-19s",myDeckOfCard.dealCard());
            if (i % 4 == 0){
                System.out.println();
            }
            
        }
        System.out.println("=".repeat(75));

    }
}
