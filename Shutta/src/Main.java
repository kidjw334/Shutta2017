public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1000, "aaa");
        Player player2 = new Player(1000, "bbb");


        Dealer dealer = Dealer.getInstance();


        while (true) {
            if (player1.getPlayerMoney() > 0 && player2.getPlayerMoney() > 0) {


                Round round = new Round(dealer);

                // 이전판이 무승부였는지 비교 (무승부면 장떙우선 아니면 광땡우선)
                if (dealer.getCheckRoundType() == false) {
                    Factory.getInstance().setVictoryType(new VictoryGwang());
                } else Factory.getInstance().setVictoryType(new VictoryJang());

                System.out.print("CurrentMoney :\t");
                player1.printCurrentMoney();
                player2.printCurrentMoney();
                System.out.println("");

                dealer.collectMoney(player1, player2, round);

                dealer.createCard();

                drawCard(player1, player2, dealer);

                round.roundInformation(player1, player2, dealer);

                Factory.getInstance().checkWinner(player1, player2, dealer, round);

                // 딜러가 현재 라운드의 라운드타입을 체크
                dealer.setCheckRoundType(round.getCheckRoundType());

            } else {
                dealer.shuttaResultInformation(player1, player2);
                break;
            }
        }
    }

    private static void drawCard(Player player1, Player player2, Dealer dealer) {
        player1.setFirstCard(dealer.distributeCard());
        player1.setSecondCard(dealer.distributeCard());
        player2.setFirstCard(dealer.distributeCard());
        player2.setSecondCard(dealer.distributeCard());
    }
}