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

    //region int _bettingMoney
    private int _bettingMoney = 100;

    public int getBettingMoney() {
        return _bettingMoney;
    }

    public void setBettingMoney(int bettingMoney) {
        _bettingMoney = bettingMoney;
    }
    //endregion

    //region boolean _checkRoundType
    private boolean _checkRoundType;

    public boolean getCheckRoundType() {
        return _checkRoundType;
    }

    public void setCheckRoundType(boolean checkRoundType) {
        _checkRoundType = checkRoundType;
    }
    //endregion

    //region int _checkRoundCount
    private int _checkRoundCount;

    public int getCheckRoundCount() {
        return _checkRoundCount;
    }

    public void setCheckRoundCount(int checkRoundCount) {
        _checkRoundCount = checkRoundCount;
    }
    //endregion
    
    void createCard(){
        _card.clear();
        for (int i = 0; i < 20; i++) {
            _card.add(new Card(i%10+1, false));
            if(i == 10 || i==12 || i==17){
                _card.get(i).setIsGwang(true);
            }
        }
    }

    int collectMoney(Player player1, Player player2, Round round) {

        if(getCheckRoundType() == true) _bettingMoney = _bettingMoney * 2;
        _prizeMoney = _prizeMoney + _bettingMoney * 2;
        int player1Money = player1.getPlayerMonery();
        int player2Money = player2.getPlayerMonery();
        player1.setPlayerMonery(player1Money - _bettingMoney);
        player2.setPlayerMonery(player2Money - _bettingMoney);
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

