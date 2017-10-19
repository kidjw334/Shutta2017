public class Round {
    private Round() {
    }

    private static Round _instance = new Round();

    public static Round getInstance() {
        return _instance;
    }

    //region int _roundCount
    private int _roundCount;

    public int getRoundCount() {
        return _roundCount;
    }

    public void setRoundCount(int roundCount) {
        _roundCount = roundCount;
    }
    //endregion

    //region int _roundMoney
    private int _roundMoney;

    public int getRoundResult() {
        return _roundMoney;
    }

    public void setRoundResult(int roundResult) {
        _roundMoney = roundResult;
    }
    //endregion
}
