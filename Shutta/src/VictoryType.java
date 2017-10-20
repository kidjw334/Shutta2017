import java.util.ArrayList;

public abstract class VictoryType {
    public void checkWinner(Player player1, Player player2, Dealer dealer, Round round) {
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

        System.out.print("RankResult :\t");
        int play1Rank = rankCalculator(play1Cards);
        int play2Rank = rankCalculator(play2Cards);

        System.out.println("");
        System.out.print("Round Result :\t");
        if (play1Rank > play2Rank) {
            round.setCheckRoundType(false);
            player1.setVictoryCount(player1.getVictoryCount() + 1);
            player1.setPlayerMoney(player1.getPlayerMoney() + dealer.getPrizeMoney());
            dealer.setPrizeMoney(0);
            dealer.setBettingMoney(100);
            System.out.println("** Play1 Win **");
        } else if (play1Rank < play2Rank) {
            round.setCheckRoundType(false);
            player2.setVictoryCount(player2.getVictoryCount() + 1);
            player2.setPlayerMoney(player2.getPlayerMoney() + dealer.getPrizeMoney());
            dealer.setPrizeMoney(0);
            dealer.setBettingMoney(100);
            System.out.println("** Play2 Win **");
        } else {
            round.setCheckRoundType(false);
            System.out.println("** Tie **");
        }

        System.out.println("-----------------------------------------");
    }

    abstract int rankCalculator(ArrayList<Card> playCards);
}
