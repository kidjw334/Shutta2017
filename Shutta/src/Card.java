import java.util.Random;

public class Card {
    //region int _no
    private int _no;

    public int getNo() {
        return _no;
    }

    public void setNo(int no) {
        _no = no;
    }
    //endregion

    //region boolean _isGwang
    private boolean _isGwang;

    public boolean getIsGwang() {
        return _isGwang;
    }

    public void setIsGwang(boolean isGwang) {
        _isGwang = isGwang;
    }
    //endregion


    public Card(int no, boolean isGwang) {
        _no = no;
        _isGwang = isGwang;
    }
}
