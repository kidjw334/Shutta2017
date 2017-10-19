import java.util.ArrayList;

public class VictoryGwang implements VictoryType {
    @Override
    public void checkWinner(Player player1, Player player2, Dealer dealer) {
        Card play1FirstCard = player1.getFirstCard();
        Card play1SecondCard = player1.getSecondCard();

        Card play2FirstCard = player2.getFirstCard();
        Card play2SecondCard = player2.getSecondCard();

        ArrayList<Card> play1Cards = new ArrayList<Card>();
        play1Cards.add(play1FirstCard);
        play1Cards.add(play1SecondCard);

        ArrayList<Card> play2Cards = new ArrayList<Card>();
        play2Cards.add(play2FirstCard);
        play2Cards.add(play2SecondCard);

        int play1Rank = rankCalculator(play1Cards);
        int play2Rank = rankCalculator(play2Cards);

        if(play1Rank > play2Rank){
            player1.setVictoryCount(player1.getVictoryCount()+1);
            player1.setPlayerMonery(player1.getPlayerMonery()+dealer.getPrizeMoney());
            System.out.println("Play1 Win");
        } else if (play1Rank < play2Rank){
            player2.setVictoryCount(player2.getVictoryCount()+1);
            player2.setPlayerMonery(player2.getPlayerMonery()+dealer.getPrizeMoney());
            System.out.println("Play2 Win");
        } else {
            dealer.setCheckRoundType(true);
            System.out.println("Tie");
        }
    }

    private int rankCalculator(ArrayList<Card> playCards) {
        Card card1 = playCards.get(0);
        Card card2 = playCards.get(1);

        //광떙 비교
        if ((card1.getNo() == 3 && card1.getIsGwang() == true) && (card2.getNo() == 8 && card2.getIsGwang() == true)) {
            System.out.println("38광땡");
            return 23;
        }

        if ((card1.getNo() == 1 && card1.getIsGwang() == true) && (card2.getNo() == 8 && card2.getIsGwang() == true)) {
            System.out.println("18광땡");
            return 22;
        }

        if ((card1.getNo() == 1 && card1.getIsGwang() == true) && (card2.getNo() == 3 && card2.getIsGwang() == true)) {
            System.out.println("13광땡");
            return 21;
        }


        //떙 비교
        if (playCards.get(0).getNo() == playCards.get(1).getNo()) {

            for (int i = 10; i >= 0; i--) {
                if (playCards.get(0).getNo() == i && playCards.get(1).getNo() == i) {
                    System.out.println(i + "땡");
                    return i + 10;
                }

            }
        }

        //끗 비교
        System.out.println((playCards.get(0).getNo() + playCards.get(1).getNo()) % 10 + "끗");
        return (playCards.get(0).getNo() + playCards.get(1).getNo()) % 10;
    }
}
