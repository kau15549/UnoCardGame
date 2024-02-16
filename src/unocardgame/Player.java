/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unocardgame;

/**
 *
 * @author Harpreet kaur
 * @editor Nitesh Bajaj
 * @editor Utsavjeet Singh
 15/02/2024
 */
 
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public Card playCard(Card currentCard) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the card you want to play (0 to " + (hand.size() - 1) + "): ");
        int index = scanner.nextInt();

        while (index < 0 || index >= hand.size() || !hand.get(index).matches(currentCard)) {
            System.out.println("Invalid choice. Try again.");
            index = scanner.nextInt();
        }

        return hand.remove(index);
    }
}
