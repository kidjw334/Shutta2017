import java.util.ArrayList;
import java.util.Random;

public class Dealer {
    private Dealer() {
    }

    private static Dealer _instance = new Dealer();

    public static Dealer getInstance() {
        return _instance;
    }

    //region int _prizeMoney
    int _prizeMoney;

    public int getPrizeMoney() {
        return _prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        _prizeMoney = prizeMoney;
    }
    //endregion

    //region ArrayList<Card> _card
    private ArrayList<Card> _card = new ArrayList<Card>();

    public ArrayList<Card> getCard() {
        return _card;
    }

    public void setCard(ArrayList<Card> card) {
        _card = card;
    }
    //endregion

    //region ArrayList<Integer> _selectedCard
    private ArrayList<Integer> _selectedCard = new ArrayList<Integer>();

    public ArrayList<Integer> getSelectedCard() {
        return _selectedCard;
    }

    public void setSelectedCard(ArrayList<Integer> selectedCard) {
        _selectedCard = selectedCard;
    }
    //endregion

    void createCard(){
        for (int i = 0; i < 20; i++) {
            _card.add(new Card(i%10+1, false));
            if(i == 10 || i==12 || i==17){
                _card.get(i).setIsGwang(true);
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(_card.get(i).getNo());
            System.out.println(_card.get(i).getIsGwang());
        }
    }

    int collectMoney(int p1Money, int p2Money) {
        _prizeMoney = p1Money + p2Money;
        return _prizeMoney;
    }

    public Card distributeCard() {
        Random random = new Random();
        int listNo = random.nextInt(_card.size());
        Card selectCard = _card.get(listNo);
        _card.remove(listNo);
        return selectCard;
    }
}

