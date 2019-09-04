package discount;

public class Context {
    private boolean _isAfterEight;

    public Context(boolean isAfterEight) {
        _isAfterEight = isAfterEight;
    }

    public boolean getIsAfterEight() {
        return _isAfterEight;
    }

    public void setIsAfterEight(boolean _isAfterEight) {
        this._isAfterEight = _isAfterEight;
    }
}
