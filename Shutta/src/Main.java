public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1000, "aaa");
        Player player2 = new Player(1000, "bbb");

        Dealer dealer = Dealer.getInstance();

        if(dealer.getCheckRoundType()==false){
            Factory.getInstance().setVictoryType(new VictoryGwang());
        } else
            Factory.getInstance().setVictoryType(new VictoryJang());

        for (int i = 0; i < 10; i++) {
            System.out.println("\t\t\t\tPlay1\tPlay2");
            System.out.println("-----------------------------------------");
            System.out.printf("ID :\t\t\t");
            System.out.printf(player1.getId());
            System.out.printf("\t\t");
            System.out.println(player2.getId());
            System.out.println("카드생성");
            dealer.createCard();

            System.out.print("RestMoney :\t\t");
            dealer.collectMoney(player1, player2);
            System.out.print(player1.getPlayerMonery());
            System.out.printf("\t\t");
            System.out.println(player2.getPlayerMonery());

            DrawCard(player1, dealer);
            DrawCard(player2, dealer);
            System.out.print("CardNo :\t\t");
            System.out.print(player1.getFirstCard().getNo());
            if(player1.getFirstCard().getIsGwang()) System.out.print("광 ");
                else System.out.print("  ");
            System.out.print(player1.getSecondCard().getNo());
            if(player1.getSecondCard().getIsGwang()) System.out.print("광 ");
            else System.out.print("  ");
            System.out.print("\t\t");
            System.out.print(player2.getFirstCard().getNo());
            if(player1.getFirstCard().getIsGwang()) System.out.print("광 ");
            else System.out.print("  ");
            System.out.print(" ");
            System.out.println(player2.getSecondCard().getNo());
            if(player1.getSecondCard().getIsGwang()) System.out.print("광 ");
            else System.out.print("  ");


            Factory.getInstance().checkWinner(player1, player2, dealer);

        }

        System.out.println();

    }

    private static void DrawCard(Player player, Dealer dealer) {
        player.setFirstCard(dealer.distributeCard());
        player.setSecondCard(dealer.distributeCard());
    }
}