public class Player {
    //region int _playerMoney
    private int _playerMoney;

    public int getPlayerMoney() {
        return _playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        _playerMoney = playerMoney;
    }
    //endregion

    //region String _id
    private String _id;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        _id = id;
    }
    //endregion

    //region int _victoryCount
    private int _victoryCount;

    public int getVictoryCount() {
        return _victoryCount;
    }

    public void setVictoryCount(int victoryCount) {
        _victoryCount = victoryCount;
    }
    //endregion

    //region Card _firstCard
    private Card _firstCard;

    public Card getFirstCard() {
        return _firstCard;
    }

    public void setFirstCard(Card firstCard) {
        _firstCard = firstCard;
    }
    //endregion

    //region Card _secondCard
    private Card _secondCard;

    public Card getSecondCard() {
        return _secondCard;
    }

    public void setSecondCard(Card secondCard) {
        _secondCard = secondCard;
    }
    //endregion


    public Player(int playerMoney, String id) {
        _playerMoney = playerMoney;
        _id = id;
    }

    public void printCurrentMoney() {
        System.out.print(getPlayerMoney());
        System.out.printf("\t\t");

    }
}
