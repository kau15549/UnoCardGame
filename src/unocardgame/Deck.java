/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unocardgame;

/**
 *
 * @author User
 */

   
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two"};

        for (String color : colors) {
            for (String value : values) {
                cards.add(new Card(color, value));
                if (!value.equals("0")) { // Add two of each card, except for 0
                    cards.add(new Card(color, value));
                }
            }
        }
        // Add Wild cards
        for (int i = 0; i < 4; i++) {
            cards.add(new Card("Wild", "Color Changer"));
            cards.add(new Card("Wild", "Draw Four"));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(cards.size() - 1);
    }
}
}
