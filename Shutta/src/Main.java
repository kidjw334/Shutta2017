//3

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1000, "aaa");
        Player player2 = new Player(1000, "bbb");

        Dealer dealer = Dealer.getInstance();

        dealer.createCard();

        int bettingMoney = 100;
        dealer.collectMoney(bettingMoney, player1, player2);


        DrawCard(player1, dealer);
        DrawCard(player2, dealer);


        if(dealer.getCheckRoundType()==false){
            Factory.getInstance().setVictoryType(new VictoryGwang());
        } else
            Factory.getInstance().setVictoryType(new VictoryJang());

        Factory.getInstance().checkWinner(player1, player2);
    }

    private static void DrawCard(Player player, Dealer dealer) {
        player.setFirstCard(dealer.distributeCard());
        player.setSecondCard(dealer.distributeCard());
    }
}