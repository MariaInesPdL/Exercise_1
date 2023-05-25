package exercise1;

import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author poncedel
 * @author Maria Ines Ponce de Leon May 23, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
                
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int randomNumber = random.nextInt(13) + 1;
            //card.setValue(insert call to random number generator here)
            card.setValue(randomNumber);
            
            int randomSuit = random.nextInt(4);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[randomSuit]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            hand[i] = card;
        }

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a card value (1-10, Jack-11, Queen-12, King-13): ");
        int cardValue = sc.nextInt();
        
        System.out.print("Input a card suit (0-Diamonds, 1-Hearts, 2-Spades, 3-Clubs): ");
        int cardSuit = sc.nextInt();
        
        Card user = new Card();
        user.setValue(cardValue);
        user.setSuit(Card.SUITS[cardSuit]);
        
        boolean isAMatch = false;
        
        for (Card card : hand) {
            if (card.getValue() == user.getValue() && card.getSuit().equals(user.getSuit())) {
                isAMatch = true;
                break;
            }
        }
        
        if (isAMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not found. Try again!");
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Maria Ines Ponce de Leon - May, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Maria Ines, and I'm an International student from Peru");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Become a proficient Developer");
        System.out.println("-- Find a successful and enriching job in the field once I graduate");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Baking");
        System.out.println("-- Travelling whenever I can");
        System.out.println("-- Learning how to code");
        System.out.println("-- Crochet");

        System.out.println();
        
    
    }

}
