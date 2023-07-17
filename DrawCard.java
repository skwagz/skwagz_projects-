import java.util.Random;
public class DrawCard {
    public static void main (String args[]){
        String card = "zero"; 
    String cardVal = "zero";
    Random rand = new Random();
    int  random_suit = rand.nextInt(4);
    int random_card = rand.nextInt(14);
   
    
    switch (random_suit) {
        case 0: 
            card = "Spades";
            break;
        case 1:
            
            card ="Diamonds";
            break;
        
        case 2:
        
            card = "Clubs";
        break;

            default:
            card = "Hearts";
            break;
    }

    switch (random_card) {
        case 0:
            cardVal = "Ace";
            break;
        
        case 1:
        cardVal = "One";
        break;

        case 2:
         cardVal = "Two";
        break;

        case 3:
         cardVal = "Three";
        break;

        case 4:
        cardVal = "Four";
        break;

        case 5:
        cardVal = "Five";
        break;

        case 6:
        cardVal = "Six";
        break;

        case 7:
        cardVal = "Seven";
        break;

        case 8:
        cardVal = "Eight";
        break;

        case 9:
        cardVal = "Nine";
        break;

        case 10:
        cardVal = "Jack";
        break;

        case 11:
        cardVal = "Queen";
        break;

        case 12:
        cardVal = "King";
        break;

        default:

            break;
    }
        System.out.println(cardVal + " of " + card);
}
}
