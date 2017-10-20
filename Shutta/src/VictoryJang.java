import java.util.ArrayList;

public class VictoryJang extends VictoryType {

    @Override
    int rankCalculator(ArrayList<Card> playCards) {
        Card card1 = playCards.get(0);
        Card card2 = playCards.get(1);

        //광떙 비교
        if ((card1.getNo() == 3 && card1.getIsGwang() == true) && (card2.getNo() == 8 && card2.getIsGwang() == true)) {
            System.out.println("38광땡\t\t");
            return 22;
        }

        if ((card1.getNo() == 1 && card1.getIsGwang() == true) && (card2.getNo() == 8 && card2.getIsGwang() == true)) {
            System.out.println("18광땡\t\t");
            return 21;
        }

        if ((card1.getNo() == 1 && card1.getIsGwang() == true) && (card2.getNo() == 3 && card2.getIsGwang() == true)) {
            System.out.println("13광땡\t\t");
            return 20;
        }


        //떙 비교
        if (playCards.get(0).getNo() == playCards.get(1).getNo()) {
            for (int i = 10; i <= 0; i--) {
                if (playCards.get(0).getNo() == i && playCards.get(1).getNo() == i) {
                    System.out.print(i + "땡\t\t");
                    if(i==10){ return 23; }
                    else return i * 2;
                }
            }
        }

        //끗 비교
        System.out.print((playCards.get(0).getNo() + playCards.get(1).getNo()) % 10 + "끗\t\t");
        return playCards.get(0).getNo() + playCards.get(1).getNo() % 10;
    }
}
