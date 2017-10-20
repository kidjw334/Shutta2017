public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1000, "aaa");
        Player player2 = new Player(1000, "bbb");


        Dealer dealer = Dealer.getInstance();


        while (true) {
            if (player1.getPlayerMonery() > 0 && player2.getPlayerMonery() > 0) {

                Round round = new Round();

                // 이전판이 무승부였는지 비교 (무승부면 장떙우선 아니면 광땡우선)
                if (dealer.getCheckRoundType() == false) {
                    Factory.getInstance().setVictoryType(new VictoryGwang());
                } else Factory.getInstance().setVictoryType(new VictoryJang());

                dealer.collectMoney(player1, player2, round);

                dealer.createCard();

                DrawCard(player1, dealer);
                DrawCard(player2, dealer);


                round.roundInformation(player1, player2, dealer);

                Factory.getInstance().checkWinner(player1, player2, dealer, round);

                // 딜러가 현재 라운드의 라운드타입을 체크
                dealer.setCheckRoundType(round.getCheckRoundType());

            } else {
                System.out.println(player1.getVictoryCount());
                System.out.println(player2.getVictoryCount());
                break;
            }
        }
    }

    private static void DrawCard(Player player, Dealer dealer) {
        player.setFirstCard(dealer.distributeCard());
        player.setSecondCard(dealer.distributeCard());
    }
}