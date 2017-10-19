public class Player {
    //region int _playerMonery
    private int _playerMonery;

    public int getPlayerMonery() {
        return _playerMonery;
    }

    public void setPlayerMonery(int playerMonery) {
        _playerMonery = playerMonery;
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


    public Player(int playerMonery, String id) {
        _playerMonery = playerMonery;
        _id = id;
    }
}
