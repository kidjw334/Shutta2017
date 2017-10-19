//3

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1000, "aaa");
        Player player2 = new Player(1000, "bbb");

        Dealer dealer = Dealer.getInstance();

        dealer.createCard();

        dealer.collectMoney(player1.getPlayerMonery(), player2.getPlayerMonery());

        DrawCard(player1, dealer);
        DrawCard(player2, dealer);





        dealer.getCard();
    }

    private static void DrawCard(Player player, Dealer dealer) {
        player.setFirstCard(dealer.distributeCard());
        player.setSecondCard(dealer.distributeCard());
    }
}