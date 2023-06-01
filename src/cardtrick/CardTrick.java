/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

/**
 *
 * @author khoavan
 */
import java.util.Scanner;

public class CardTrick {

    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] hand = new String[7];

    public CardTrick() {
        // fill the hand array with random cards
        for (int i = 0; i < hand.length; i++) {
            int suitIndex = (int) (Math.random() * suits.length);
            int valueIndex = (int) (Math.random() * values.length);
            hand[i] = values[valueIndex] + " of " + suits[suitIndex];
        }
    }

    public void pickCard(String card) {
        // search the hand array for the specified card
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].equals(card)) {
                System.out.println("Your card, the " + card + ", is in the magic hand!");
                return;
            }
        }
        System.out.println("Sorry, your card, the " + card + ", is not in the magic hand.");
    }

    public static void main(String[] args) {
        // create a new instance of the CardTrick class
        CardTrick magicHand = new CardTrick();

        // prompt the user to pick a card
        System.out.println("Pick a card, any card:");
        try (Scanner sc = new Scanner(System.in)) {
            String card = sc.nextLine();

            // search the hand for the specified card
            magicHand.pickCard(card);
        }
    }
}