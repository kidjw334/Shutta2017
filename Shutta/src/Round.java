public class Round {

    //region boolean _checkRoundType
    private boolean _RoundType;

    public boolean getCheckRoundType() {
        return _RoundType;
    }

    public void setCheckRoundType(boolean checkRoundType) {
        _RoundType = checkRoundType;
    }

    public void roundInformation(Player player1, Player player2, Dealer dealer) {
        System.out.println("\t\t\t\tPlay1\tPlay2");
        System.out.println("-----------------------------------------");
        System.out.printf("ID :\t\t\t");
        System.out.printf(player1.getId());
        System.out.printf("\t\t");
        System.out.println(player2.getId());


        System.out.print("RestMoney :\t\t");
        System.out.print(player1.getPlayerMonery());
        System.out.printf("\t\t");
        System.out.println(player2.getPlayerMonery());

        System.out.print("RestMoney :\t\t");

        System.out.print(player1.getPlayerMonery());
        System.out.printf("\t\t");
        System.out.println(player2.getPlayerMonery());

        System.out.print("SeletedCard :\t");
        System.out.print(player1.getFirstCard().getNo());
        if (player1.getFirstCard().getIsGwang()) System.out.print("광 ");
        else System.out.print("  ");
        System.out.print(player1.getSecondCard().getNo());
        if (player1.getSecondCard().getIsGwang()) System.out.print("광 ");
        else System.out.print("  ");
        System.out.print("\t");
        System.out.print(player2.getFirstCard().getNo());
        if (player2.getFirstCard().getIsGwang()) System.out.print("광 ");
        else System.out.print("  ");
        System.out.print(" ");
        System.out.print(player2.getSecondCard().getNo());
        if (player2.getSecondCard().getIsGwang()) System.out.print("광 ");
        else System.out.print("  ");
        System.out.println("");
    }
    //endregion
}
