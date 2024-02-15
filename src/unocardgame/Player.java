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

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
