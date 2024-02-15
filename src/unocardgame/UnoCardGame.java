/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unocardgame;

/**
 *
 * @author Harpreet kaur
 15/02/2024
 */
public class UnoCardGame {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player();
        Player player2 = new Player();

        // Initial card draw
        for (int i = 0; i < 7; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }
        // Show player hands (for testing)
        System.out.println("Player 1 hand: " + player1.getHand());
        System.out.println("Player 2 hand: " + player2.getHand());
    }
}
