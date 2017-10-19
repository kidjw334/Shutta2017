public class Factory {
    private Factory() {
    }

    private static Factory _instance = new Factory();

    public static Factory getInstance() {
        return _instance;
    }

    //region VictoryType _victoryType
    private VictoryType _victoryType;

    public VictoryType getVictoryType() {
        return _victoryType;
    }

    public void setVictoryType(VictoryType victoryType) {
        if(_victoryType != victoryType)
        _victoryType = victoryType;
    }
    //endregion

    void checkWinner(Player player1, Player player2){
        if(_victoryType == null) return;
        _victoryType.checkWinner(player1, player2);
    }
}
