package day180115;

interface First {
    int value = 100;

    default int getValue() {
        return value;
    }
}

interface Second {
    int value = -100;

    default int getValue() {
        return value;
    }
}

public class Implementation implements First, Second {
    @Override
    public int getValue() {
        return First.super.getValue() + Second.super.getValue();
    }
}
